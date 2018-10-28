package com.prakashpandey.packetsniffer;

import com.prakashpandey.packetsniffer.PacketHandler;

public class PacketManager {
	
	private PacketHandler packet;
	
	public PacketManager(PacketHandler packet) {
		this.packet = packet;
	}
	
	/**
	 * Use for filtering DNS packets
	 * @return true if packet is of type DNS, false otherwise
	 */
	public boolean isDNSPacket() {
		return false;
	}
	
	public void printPacket() {
		System.out.println("------------------------------------------------------");
		System.out.println("timestamp: " + packet.getTimestamp());
		System.out.println("srcIp: " + packet.getSrc_ip());
		System.out.println("dstIp: " + packet.getDst_ip());
		System.out.println("srcPort: " + packet.getSrc_port());
		System.out.println("dstPort: " + packet.getDst_port());
		System.out.println("domain: " + packet.getDomain());
		System.out.println("status: " + packet.getStatus());
		System.out.println("type: " + packet.getType());
		System.out.println("protocol: " + packet.getProto());
	}
}
