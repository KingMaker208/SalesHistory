package com.cg.sprint.Sales_History.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "supplier")
public class Supplier {

	@Id
	@Column(name = "supplier_id")
	private int supplierId;
	@Column(name = "supplier_name", length = 45)
	private String supplierName;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int id) {
		this.supplierId = id;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Supplier(int id, String supplierName) {
		super();
		this.supplierId = id;
		this.supplierName = supplierName;
	}
	public Supplier() {
		super();
	}
	@Override
	public String toString() {
		return "Supplier [id=" + supplierId + ", supplierName=" + supplierName + "]";
	}
	
	
}
