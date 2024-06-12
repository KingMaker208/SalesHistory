package com.cg.sprint.Sales_History.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "channels")
public class Channel {
	
	@Id
	@Column(name = "channel_id")
	private int channelId;
	@Column(name = "channel_desc", length = 20, nullable = false)
	private String channelDesc;
	@Column(name = "channel_class", length = 20, nullable = false)
	private String channelClass;
	@Column(name = "channel_class_id", nullable = false)
	private int channelClassId;
	@Column(name = "channel_total", length = 13, nullable = false)
	private String channelTotal;
	@Column(name = "channel_total_id", nullable = false)
	private int channelTotalId;
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getChannelDesc() {
		return channelDesc;
	}
	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}
	public String getChannelClass() {
		return channelClass;
	}
	public void setChannelClass(String channelClass) {
		this.channelClass = channelClass;
	}
	public int getChannelClassId() {
		return channelClassId;
	}
	public void setChannelClassId(int channelClassId) {
		this.channelClassId = channelClassId;
	}
	public String getChannelTotal() {
		return channelTotal;
	}
	public void setChannelTotal(String channelTotal) {
		this.channelTotal = channelTotal;
	}
	public int getChannelTotalId() {
		return channelTotalId;
	}
	public void setChannelTotalId(int channelTotalId) {
		this.channelTotalId = channelTotalId;
	}
	public Channel(int channelId, String channelDesc, String channelClass, int channelClassId, String channelTotal,
			int channelTotalId) {
		super();
		this.channelId = channelId;
		this.channelDesc = channelDesc;
		this.channelClass = channelClass;
		this.channelClassId = channelClassId;
		this.channelTotal = channelTotal;
		this.channelTotalId = channelTotalId;
	}
	public Channel() {
		super();
	}
	@Override
	public String toString() {
		return "Channel [channelId=" + channelId + ", channelDesc=" + channelDesc + ", channelClass=" + channelClass
				+ ", channelClassId=" + channelClassId + ", channelTotal=" + channelTotal + ", channelTotalId="
				+ channelTotalId + "]";
	}
	
	
}
