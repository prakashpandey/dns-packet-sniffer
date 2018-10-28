package com.prakashpandey.packetsniffer;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;

/**
 * Handles Network interface device
 * 
 * @author parkash
 *
 */

// Custom device exception 
class NoDeviceFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	NoDeviceFoundException(String message) {
		super(message);
	}
}

// Handle network interface device related responsibility
public class Device {

	private String name;

	public Device(String name) {
		this.name = name;
	}

	/**
	 * Selects the network device to read the data from.
	 * 
	 * @return the pcap interface device selected
	 */
	public PcapNetworkInterface getDeviceByName() throws NoDeviceFoundException {
		InetAddress addr;
		try {
			addr = InetAddress.getByName(this.name);
			PcapNetworkInterface nif = Pcaps.getDevByAddress(addr);
			return nif;
		} catch (PcapNativeException e) {
			throw new NoDeviceFoundException("NoDeviceFoundException: " + e.getMessage());
		} catch (UnknownHostException e) {
			throw new NoDeviceFoundException("UnknownHostException: " + e.getMessage());
		}
	}

}
