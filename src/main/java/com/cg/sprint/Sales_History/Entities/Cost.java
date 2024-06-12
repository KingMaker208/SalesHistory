package com.cg.sprint.Sales_History.Entities;

import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name="costs")
public class Cost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer costId;
	
	@ManyToOne
	@JoinColumn(name="prod_id", nullable = false)
	private Product prodId;
	
	@ManyToOne
	@JoinColumn(name="time_id", nullable = false)
	private Time timeId;
	
	@ManyToOne
	@JoinColumn(name="promo_id", nullable = false)
	private Promotion promoId;
	
	@ManyToOne
	@JoinColumn(name="channel_id", nullable = false)
	private Channel channelId;
	
	@Column(name="unit_cost", precision=10, scale=2, nullable = false)
	private BigDecimal unitCost;
	@Column(name="unit_price", precision=10, scale=2, nullable = false)
	private BigDecimal unitPrice;
	public Integer getCostId() {
		return costId;
	}
	public void setCostId(Integer costId) {
		this.costId = costId;
	}
	public Product getProdId() {
		return prodId;
	}
	public void setProdId(Product prodId) {
		this.prodId = prodId;
	}
	public Time getTimeId() {
		return timeId;
	}
	public void setTimeId(Time timeId) {
		this.timeId = timeId;
	}
	public Promotion getPromoId() {
		return promoId;
	}
	public void setPromoId(Promotion promoId) {
		this.promoId = promoId;
	}
	public Channel getChannelId() {
		return channelId;
	}
	public void setChannelId(Channel channelId) {
		this.channelId = channelId;
	}
	public BigDecimal getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Cost(Integer costId, Product prodId, Time timeId, Promotion promoId, Channel channelId, BigDecimal unitCost,
			BigDecimal unitPrice) {
		super();
		this.costId = costId;
		this.prodId = prodId;
		this.timeId = timeId;
		this.promoId = promoId;
		this.channelId = channelId;
		this.unitCost = unitCost;
		this.unitPrice = unitPrice;
	}
	public Cost() {
		super();
	}
	@Override
	public String toString() {
		return "Cost [costId=" + costId + ", prodId=" + prodId + ", timeId=" + timeId + ", promoId=" + promoId
				+ ", channelId=" + channelId + ", unitCost=" + unitCost + ", unitPrice=" + unitPrice + "]";
	}
	
	
}
