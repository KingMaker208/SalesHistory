package com.cg.sprint.Sales_History.Entities;

import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "sales")
public class Sale {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saleId;

    @ManyToOne
    @JoinColumn(name = "prod_id", nullable = false)
    private Product prodId;

    @ManyToOne
    @JoinColumn(name = "cust_id", nullable = false)
    private Customer custId;

    @ManyToOne
    @JoinColumn(name = "time_id", nullable = false)
    private Time timeId;

    @ManyToOne
    @JoinColumn(name = "channel_id", nullable = false)
    private Channel channelId;

    @ManyToOne
    @JoinColumn(name = "promo_id", nullable = false)
    private Promotion promoId;

    @Column(name = "quantity_sold", nullable = false)
    private int quantitySold;
    
    @Column(name = "amount_sold", nullable = false, precision = 10, scale = 2)
    private BigDecimal amount_sold;

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public Product getProdId() {
		return prodId;
	}

	public void setProdId(Product prodId) {
		this.prodId = prodId;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public Time getTimeId() {
		return timeId;
	}

	public void setTimeId(Time timeId) {
		this.timeId = timeId;
	}

	public Channel getChannelId() {
		return channelId;
	}

	public void setChannelId(Channel channelId) {
		this.channelId = channelId;
	}

	public Promotion getPromoId() {
		return promoId;
	}

	public void setPromoId(Promotion promoId) {
		this.promoId = promoId;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	public BigDecimal getAmount_sold() {
		return amount_sold;
	}

	public void setAmount_sold(BigDecimal amount_sold) {
		this.amount_sold = amount_sold;
	}

	public Sale(int saleId, Product prodId, Customer custId, Time timeId, Channel channelId, Promotion promoId,
			int quantitySold, BigDecimal amount_sold) {
		super();
		this.saleId = saleId;
		this.prodId = prodId;
		this.custId = custId;
		this.timeId = timeId;
		this.channelId = channelId;
		this.promoId = promoId;
		this.quantitySold = quantitySold;
		this.amount_sold = amount_sold;
	}

	public Sale() {
		super();
	}

	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", prodId=" + prodId + ", custId=" + custId + ", timeId=" + timeId
				+ ", channelId=" + channelId + ", promoId=" + promoId + ", quantitySold=" + quantitySold
				+ ", amount_sold=" + amount_sold + "]";
	}

    
}