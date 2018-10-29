package com.prakashpandey.packetsniffer;

import java.io.EOFException;
import java.net.Inet4Address;
import java.util.concurrent.TimeoutException;

import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface.PromiscuousMode;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;

/**
 * This application is used to read network packet of a particular network interface and
 * filter out the DNS packet
 *
 */
public class PacketSniffer 
{
	private static final  int snapLen = 65536;
	private static final int timeout = 10;
	
    public static void main( String[] args ) throws NoDeviceFoundException, PcapNativeException, InterruptedException
    {
    	if(args.length < 1) {
    		System.out.println("Please provide the name of device interface as program argument");
    		System.exit(-1);
    	}
        Device device = new Device(args[0]);
        PromiscuousMode mode = PromiscuousMode.PROMISCUOUS;
        PcapHandle handle = device.getDeviceByName().openLive(snapLen, mode, timeout);
        while(true) {
        	try {
				Packet packet = handle.getNextPacketEx();
				IpV4Packet ipV4Packet = packet.get(IpV4Packet.class);
				Inet4Address srcAddr = ipV4Packet.getHeader().getSrcAddr();
				Inet4Address dstAddr = ipV4Packet.getHeader().getDstAddr();
				System.out.println("====================================================================");
				System.out.println("srcAddr: " + srcAddr);
				System.out.println("dstAddr: " + dstAddr);
				System.out.println("ipV4Packet: " + ipV4Packet);
			} catch (EOFException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotOpenException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	Thread.sleep(1000);
        }
    }
}
