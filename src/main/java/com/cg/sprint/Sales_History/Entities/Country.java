package com.cg.sprint.Sales_History.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="countries")
public class Country {
	@Id
	@Column(name = "country_id")
	private int countryId;
	@Column(name = "country_iso_code", length = 2, nullable = false)
	private String countryIsoCode;
	@Column(name = "country_name", length = 40, nullable = false)
	private String countryName;
	@Column(name = "country_subregion", length = 30, nullable = false)
	private String countrySubregion;
	@Column(name = "country_subregion_id", nullable = false)
	private int countrySubregionId;
	@Column(name = "country_region", length = 40, nullable = false)
	private String countryRegion;
	@Column(name = "country_region_id", nullable = false)
	private int countryRegionId;
	@Column(name = "country_total", length = 11, nullable = false)
	private String countryTotal;
	@Column(name = "country_total_id", nullable = false)
	private int countryTotalId;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryIsoCode() {
		return countryIsoCode;
	}
	public void setCountryIsoCode(String countryIsoCode) {
		this.countryIsoCode = countryIsoCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountrySubregion() {
		return countrySubregion;
	}
	public void setCountrySubregion(String countrySubregion) {
		this.countrySubregion = countrySubregion;
	}
	public int getCountrySubregionId() {
		return countrySubregionId;
	}
	public void setCountrySubregionId(int countrySubregionId) {
		this.countrySubregionId = countrySubregionId;
	}
	public String getCountryRegion() {
		return countryRegion;
	}
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}
	public int getCountryRegionId() {
		return countryRegionId;
	}
	public void setCountryRegionId(int countryRegionId) {
		this.countryRegionId = countryRegionId;
	}
	public String getCountryTotal() {
		return countryTotal;
	}
	public void setCountryTotal(String countryTotal) {
		this.countryTotal = countryTotal;
	}
	public int getCountryTotalId() {
		return countryTotalId;
	}
	public void setCountryTotalId(int countryTotalId) {
		this.countryTotalId = countryTotalId;
	}
	public Country(int countryId, String countryIsoCode, String countryName, String countrySubregion,
			int countrySubregionId, String countryRegion, int countryRegionId, String countryTotal,
			int countryTotalId) {
		super();
		this.countryId = countryId;
		this.countryIsoCode = countryIsoCode;
		this.countryName = countryName;
		this.countrySubregion = countrySubregion;
		this.countrySubregionId = countrySubregionId;
		this.countryRegion = countryRegion;
		this.countryRegionId = countryRegionId;
		this.countryTotal = countryTotal;
		this.countryTotalId = countryTotalId;
	}
	public Country() {
		super();
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryIsoCode=" + countryIsoCode + ", countryName=" + countryName
				+ ", countrySubregion=" + countrySubregion + ", countrySubregionId=" + countrySubregionId
				+ ", countryRegion=" + countryRegion + ", countryRegionId=" + countryRegionId + ", countryTotal="
				+ countryTotal + ", countryTotalId=" + countryTotalId + "]";
	}
	
}
