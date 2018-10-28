package com.prakashpandey.packetsniffer;

import java.util.Date;

/**
 * POJO contains information about a package.
 * This class stores the packet's metadata 
 * @author parkashpandey
 *
 */

// Packet types
enum PacketType {
	QUERY,
	RESPONSE
}

// Packet protocol
enum Protocol {
	TCP,
	UDP
}

public class PacketHandler {
	private Date timestamp; // : 1532407960, # Timestamp
	private String srcIp; // : 192.168.1.5, # Source IP
	private String dstIp; // : 192.168.1.1, # Destination IP
	private int srcPort; // : 50529, # Source Port
	private int dstPort;; // : 53, # Destination Port
	private String domain; // : google.com, # Domain name
	private String record; //: A, # Record type, e.g. A, AAA, CNAME, TXT, etc.
	private String status; // : NOERROR, # Domain status, e.g. NOERROR, NXDOMAIN, etc.
	private PacketType type; // : query, # Query or response
	private Protocol proto; // : udp,
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getSrc_ip() {
		return srcIp;
	}
	public void setSrc_ip(String src_ip) {
		this.srcIp = src_ip;
	}
	public String getDst_ip() {
		return dstIp;
	}
	public void setDst_ip(String dst_ip) {
		this.dstIp = dst_ip;
	}
	public int getSrc_port() {
		return srcPort;
	}
	public void setSrc_port(int src_port) {
		this.srcPort = src_port;
	}
	public int getDst_port() {
		return dstPort;
	}
	public void setDst_port(int dst_port) {
		this.dstPort = dst_port;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PacketType getType() {
		return type;
	}
	public void setType(PacketType type) {
		this.type = type;
	}
	public Protocol getProto() {
		return proto;
	}
	public void setProto(Protocol proto) {
		this.proto = proto;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + ((dstIp == null) ? 0 : dstIp.hashCode());
		result = prime * result + dstPort;
		result = prime * result + ((proto == null) ? 0 : proto.hashCode());
		result = prime * result + ((record == null) ? 0 : record.hashCode());
		result = prime * result + ((srcIp == null) ? 0 : srcIp.hashCode());
		result = prime * result + srcPort;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacketHandler other = (PacketHandler) obj;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		if (dstIp == null) {
			if (other.dstIp != null)
				return false;
		} else if (!dstIp.equals(other.dstIp))
			return false;
		if (dstPort != other.dstPort)
			return false;
		if (proto != other.proto)
			return false;
		if (record == null) {
			if (other.record != null)
				return false;
		} else if (!record.equals(other.record))
			return false;
		if (srcIp == null) {
			if (other.srcIp != null)
				return false;
		} else if (!srcIp.equals(other.srcIp))
			return false;
		if (srcPort != other.srcPort)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Packet [timestamp=" + timestamp + ", src_ip=" + srcIp + ", dst_ip=" + dstIp + ", src_port=" + srcPort
				+ ", dst_port=" + dstPort + ", domain=" + domain + ", record=" + record + ", status=" + status
				+ ", type=" + type + ", proto=" + proto + "]";
	}
}


