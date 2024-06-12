package com.cg.sprint.Sales_History.Entities;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@Column(name = "prod_id")
	private int prodId;
	
	@Column(name = "prod_name", length=50, nullable = false)
	private String prodName;
	
	@Column(name = "prod_desc", length=4000, nullable = false)
	private String prodDesc;
	
	@Column(name = "prod_subcategory", length=50, nullable = false)
	private String prodSubcategory;
	
	@Column(name = "prod_subcategory_id", nullable = false)
	private int prodSubcategoryId;
	
	@Column(name = "prod_subcategory_desc", length=2000, nullable = false)
	private String prodSubcategoryDesc;
	
	@Column(name = "prod_category", length=50, nullable = false)
	private String prodCategory;
	
	@Column(name = "prod_category_id", nullable = false)
	private int prodCategoryId;
	
	@Column(name = "prod_category_desc", length=2000, nullable = false)
	private String prodCategoryDesc;
	
	@Column(name = "prod_weight_class", nullable = false)
	private int prodWeightClass;
	
	@Column(name = "prod_unit_of_measure", length=20)
	private String prodUnitOfMeasure;
	
	@Column(name = "prod_pack_size", length=30, nullable = false)
	private String prodPackSize;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false)
	private Supplier supplierId;
	
	@Column(name = "prod_status", length=20, nullable = false)
	private String prodStatus;
	
	@Column(name = "prod_list_price", precision=8, scale=2, nullable = false)
	private BigDecimal prodListPrice;
	
	@Column(name = "prod_min_price", precision=8, scale=2, nullable = false)
	private BigDecimal prodMinPrice;
	
	@Column(name = "prod_total", length=13, nullable = false)
	private String prodTotal;
	
	@Column(name = "prod_total_id", nullable = false)
	private int prodTotalId;
	
	@Column(name = "prod_src_id")
	private int prodSrcId;
	
	@Column(name = "prod_eff_from")
	@Temporal(TemporalType.DATE)
	private Date prodEffFrom;
	
	@Column(name = "prod_eff_to")
	@Temporal(TemporalType.DATE)
	private Date prodEffTo;
	
	@Column(name = "prod_valid", length=1)
	private String prodValid;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getProdSubcategory() {
		return prodSubcategory;
	}

	public void setProdSubcategory(String prodSubcategory) {
		this.prodSubcategory = prodSubcategory;
	}

	public int getProdSubcategoryId() {
		return prodSubcategoryId;
	}

	public void setProdSubcategoryId(int prodSubcategoryId) {
		this.prodSubcategoryId = prodSubcategoryId;
	}

	public String getProdSubcategoryDesc() {
		return prodSubcategoryDesc;
	}

	public void setProdSubcategoryDesc(String prodSubcategoryDesc) {
		this.prodSubcategoryDesc = prodSubcategoryDesc;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public int getProdCategoryId() {
		return prodCategoryId;
	}

	public void setProdCategoryId(int prodCategoryId) {
		this.prodCategoryId = prodCategoryId;
	}

	public String getProdCategoryDesc() {
		return prodCategoryDesc;
	}

	public void setProdCategoryDesc(String prodCategoryDesc) {
		this.prodCategoryDesc = prodCategoryDesc;
	}

	public int getProdWeightClass() {
		return prodWeightClass;
	}

	public void setProdWeightClass(int prodWeightClass) {
		this.prodWeightClass = prodWeightClass;
	}

	public String getProdUnitOfMeasure() {
		return prodUnitOfMeasure;
	}

	public void setProdUnitOfMeasure(String prodUnitOfMeasure) {
		this.prodUnitOfMeasure = prodUnitOfMeasure;
	}

	public String getProdPackSize() {
		return prodPackSize;
	}

	public void setProdPackSize(String prodPackSize) {
		this.prodPackSize = prodPackSize;
	}

	public Supplier getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Supplier supplierId) {
		this.supplierId = supplierId;
	}

	public String getProdStatus() {
		return prodStatus;
	}

	public void setProdStatus(String prodStatus) {
		this.prodStatus = prodStatus;
	}

	public BigDecimal getProdListPrice() {
		return prodListPrice;
	}

	public void setProdListPrice(BigDecimal prodListPrice) {
		this.prodListPrice = prodListPrice;
	}

	public BigDecimal getProdMinPrice() {
		return prodMinPrice;
	}

	public void setProdMinPrice(BigDecimal prodMinPrice) {
		this.prodMinPrice = prodMinPrice;
	}

	public String getProdTotal() {
		return prodTotal;
	}

	public void setProdTotal(String prodTotal) {
		this.prodTotal = prodTotal;
	}

	public int getProdTotalId() {
		return prodTotalId;
	}

	public void setProdTotalId(int prodTotalId) {
		this.prodTotalId = prodTotalId;
	}

	public int getProdSrcId() {
		return prodSrcId;
	}

	public void setProdSrcId(int prodSrcId) {
		this.prodSrcId = prodSrcId;
	}

	public Date getProdEffFrom() {
		return prodEffFrom;
	}

	public void setProdEffFrom(Date prodEffFrom) {
		this.prodEffFrom = prodEffFrom;
	}

	public Date getProdEffTo() {
		return prodEffTo;
	}

	public void setProdEffTo(Date prodEffTo) {
		this.prodEffTo = prodEffTo;
	}

	public String getProdValid() {
		return prodValid;
	}

	public void setProdValid(String prodValid) {
		this.prodValid = prodValid;
	}

	public Product(int prodId, String prodName, String prodDesc, String prodSubcategory, int prodSubcategoryId,
			String prodSubcategoryDesc, String prodCategory, int prodCategoryId, String prodCategoryDesc,
			int prodWeightClass, String prodUnitOfMeasure, String prodPackSize, Supplier supplierId, String prodStatus,
			BigDecimal prodListPrice, BigDecimal prodMinPrice, String prodTotal, int prodTotalId, int prodSrcId,
			Date prodEffFrom, Date prodEffTo, String prodValid) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodSubcategory = prodSubcategory;
		this.prodSubcategoryId = prodSubcategoryId;
		this.prodSubcategoryDesc = prodSubcategoryDesc;
		this.prodCategory = prodCategory;
		this.prodCategoryId = prodCategoryId;
		this.prodCategoryDesc = prodCategoryDesc;
		this.prodWeightClass = prodWeightClass;
		this.prodUnitOfMeasure = prodUnitOfMeasure;
		this.prodPackSize = prodPackSize;
		this.supplierId = supplierId;
		this.prodStatus = prodStatus;
		this.prodListPrice = prodListPrice;
		this.prodMinPrice = prodMinPrice;
		this.prodTotal = prodTotal;
		this.prodTotalId = prodTotalId;
		this.prodSrcId = prodSrcId;
		this.prodEffFrom = prodEffFrom;
		this.prodEffTo = prodEffTo;
		this.prodValid = prodValid;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", prodSubcategory="
				+ prodSubcategory + ", prodSubcategoryId=" + prodSubcategoryId + ", prodSubcategoryDesc="
				+ prodSubcategoryDesc + ", prodCategory=" + prodCategory + ", prodCategoryId=" + prodCategoryId
				+ ", prodCategoryDesc=" + prodCategoryDesc + ", prodWeightClass=" + prodWeightClass
				+ ", prodUnitOfMeasure=" + prodUnitOfMeasure + ", prodPackSize=" + prodPackSize + ", supplierId="
				+ supplierId + ", prodStatus=" + prodStatus + ", prodListPrice=" + prodListPrice + ", prodMinPrice="
				+ prodMinPrice + ", prodTotal=" + prodTotal + ", prodTotalId=" + prodTotalId + ", prodSrcId="
				+ prodSrcId + ", prodEffFrom=" + prodEffFrom + ", prodEffTo=" + prodEffTo + ", prodValid=" + prodValid
				+ "]";
	}
	
	
}
