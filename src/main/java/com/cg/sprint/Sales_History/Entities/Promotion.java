package com.cg.sprint.Sales_History.Entities;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "promotions")
public class Promotion {
	
	@Id
	@Column(name = "promo_id")
	private int promoId;
	@Column(name = "promo_name", length = 30, nullable = false)
	private String promoName;
	@Column(name = "promo_subcategory", length = 30, nullable = false)
	private String promoSubcategory;
	@Column(name = "promo_subcategory_id", nullable = false)
	private int promoSubcategoryId;
	@Column(name = "promo_category", length = 30, nullable = false)
	private String promoCategory;
	@Column(name = "promo_category_id", nullable = false)
	private int promoCategoryId;
	@Column(name = "promo_cost", precision = 10, scale = 2, nullable = false)
	private BigDecimal promoCost;
	@Column(name = "promo_begin_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date promoBeginDate;
	@Column(name = "promo_end_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date promoEndDate;
	@Column(name = "promo_total", length = 15, nullable = false)
	private String promoTotal;
	@Column(name = "promo_total_id", nullable = false)
	private int promoTotalId;
	public int getPromoId() {
		return promoId;
	}
	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}
	public String getPromoName() {
		return promoName;
	}
	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}
	public String getPromoSubcategory() {
		return promoSubcategory;
	}
	public void setPromoSubcategory(String promoSubcategory) {
		this.promoSubcategory = promoSubcategory;
	}
	public int getPromoSubcategoryId() {
		return promoSubcategoryId;
	}
	public void setPromoSubcategoryId(int promoSubcategoryId) {
		this.promoSubcategoryId = promoSubcategoryId;
	}
	public String getPromoCategory() {
		return promoCategory;
	}
	public void setPromoCategory(String promoCategory) {
		this.promoCategory = promoCategory;
	}
	public int getPromoCategoryId() {
		return promoCategoryId;
	}
	public void setPromoCategoryId(int promoCategoryId) {
		this.promoCategoryId = promoCategoryId;
	}
	public BigDecimal getPromoCost() {
		return promoCost;
	}
	public void setPromoCost(BigDecimal promoCost) {
		this.promoCost = promoCost;
	}
	public Date getPromoBeginDate() {
		return promoBeginDate;
	}
	public void setPromoBeginDate(Date promoBeginDate) {
		this.promoBeginDate = promoBeginDate;
	}
	public Date getPromoEndDate() {
		return promoEndDate;
	}
	public void setPromoEndDate(Date promoEndDate) {
		this.promoEndDate = promoEndDate;
	}
	public String getPromoTotal() {
		return promoTotal;
	}
	public void setPromoTotal(String promoTotal) {
		this.promoTotal = promoTotal;
	}
	public int getPromoTotalId() {
		return promoTotalId;
	}
	public void setPromoTotalId(int promoTotalId) {
		this.promoTotalId = promoTotalId;
	}
	public Promotion(int promoId, String promoName, String promoSubcategory, int promoSubcategoryId,
			String promoCategory, int promoCategoryId, BigDecimal promoCost, Date promoBeginDate, Date promoEndDate,
			String promoTotal, int promoTotalId) {
		super();
		this.promoId = promoId;
		this.promoName = promoName;
		this.promoSubcategory = promoSubcategory;
		this.promoSubcategoryId = promoSubcategoryId;
		this.promoCategory = promoCategory;
		this.promoCategoryId = promoCategoryId;
		this.promoCost = promoCost;
		this.promoBeginDate = promoBeginDate;
		this.promoEndDate = promoEndDate;
		this.promoTotal = promoTotal;
		this.promoTotalId = promoTotalId;
	}
	public Promotion() {
		super();
	}
	@Override
	public String toString() {
		return "Promotion [promoId=" + promoId + ", promoName=" + promoName + ", promoSubcategory=" + promoSubcategory
				+ ", promoSubcategoryId=" + promoSubcategoryId + ", promoCategory=" + promoCategory
				+ ", promoCategoryId=" + promoCategoryId + ", promoCost=" + promoCost + ", promoBeginDate="
				+ promoBeginDate + ", promoEndDate=" + promoEndDate + ", promoTotal=" + promoTotal + ", promoTotalId="
				+ promoTotalId + "]";
	}
	
}
