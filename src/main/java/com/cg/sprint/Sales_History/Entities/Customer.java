package com.cg.sprint.Sales_History.Entities;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@Column(name = "cust_id")
	private int custId;
	@Column(name = "cust_first_name", length = 20, nullable = false)
	private String custFirstName;
	@Column(name = "cust_last_name", length = 40, nullable = false)
	private String custLastName;
	@Column(name = "cust_gender", length = 1, nullable = false)
	private String custGender;
	@Column(name = "cust_year_of_birth", nullable = false)
	private int custYearOfBirth;
	@Column(name = "cust_marital_status", length = 20)
	private String custMaritalStatus;
	@Column(name = "cust_street_address", length = 40, nullable = false)
	private String custStreetAddress;
	@Column(name = "cust_postal_code", length = 10, nullable = false)
	private String custPostalCode;
	@Column(name = "cust_city", length = 30, nullable = false)
	private String custCity;
	@Column(name = "cust_city_id", nullable = false)
	private int custCityId;
	@Column(name = "cust_state_province", length = 40, nullable = false)
	private String custStateProvince;
	@Column(name = "cust_state_province_id", nullable = false)
	private int custStateProvinceId;
	
	@ManyToOne
	@JoinColumn(name = "country_id", nullable = false)
	private Country countryId;
	
	@Column(name = "cust_main_phone_INT", length = 25, nullable = false)
	private String custMainPhoneINT;
	@Column(name = "cust_income_level", length = 30)
	private String custIncomeLevel;
	@Column(name = "cust_credit_limit")
	private int custCreditLimit;
	@Column(name = "cust_email", length = 50, nullable = false)
	private String custEmail;
	@Column(name = "cust_total", length = 14, nullable = false)
	private String custTotal;
	@Column(name = "cust_total_id", nullable = false)
	private int custTotalId;
	@Column(name = "cust_src_id")
	private int custSrcId;
	@Column(name = "cust_eff_from")
	@Temporal(TemporalType.DATE)
	private Date custEffFrom;
	@Column(name = "cust_eff_to")
	@Temporal(TemporalType.DATE)
	private Date custEffTo;
	@Column(name = "cust_valid", length = 1)
	private String cust_valid;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public String getCustGender() {
		return custGender;
	}
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}
	public int getCustYearOfBirth() {
		return custYearOfBirth;
	}
	public void setCustYearOfBirth(int custYearOfBirth) {
		this.custYearOfBirth = custYearOfBirth;
	}
	public String getCustMaritalStatus() {
		return custMaritalStatus;
	}
	public void setCustMaritalStatus(String custMaritalStatus) {
		this.custMaritalStatus = custMaritalStatus;
	}
	public String getCustStreetAddress() {
		return custStreetAddress;
	}
	public void setCustStreetAddress(String custStreetAddress) {
		this.custStreetAddress = custStreetAddress;
	}
	public String getCustPostalCode() {
		return custPostalCode;
	}
	public void setCustPostalCode(String custPostalCode) {
		this.custPostalCode = custPostalCode;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public int getCustCityId() {
		return custCityId;
	}
	public void setCustCityId(int custCityId) {
		this.custCityId = custCityId;
	}
	public String getCustStateProvince() {
		return custStateProvince;
	}
	public void setCustStateProvince(String custStateProvince) {
		this.custStateProvince = custStateProvince;
	}
	public int getCustStateProvinceId() {
		return custStateProvinceId;
	}
	public void setCustStateProvinceId(int custStateProvinceId) {
		this.custStateProvinceId = custStateProvinceId;
	}
	public String getCustMainPhoneINT() {
		return custMainPhoneINT;
	}
	public void setCustMainPhoneINT(String custMainPhoneINT) {
		this.custMainPhoneINT = custMainPhoneINT;
	}
	public String getCustIncomeLevel() {
		return custIncomeLevel;
	}
	public void setCustIncomeLevel(String custIncomeLevel) {
		this.custIncomeLevel = custIncomeLevel;
	}
	public int getCustCreditLimit() {
		return custCreditLimit;
	}
	public void setCustCreditLimit(int custCreditLimit) {
		this.custCreditLimit = custCreditLimit;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustTotal() {
		return custTotal;
	}
	public void setCustTotal(String custTotal) {
		this.custTotal = custTotal;
	}
	public int getCustTotalId() {
		return custTotalId;
	}
	public void setCustTotalId(int custTotalId) {
		this.custTotalId = custTotalId;
	}
	public int getCustSrcId() {
		return custSrcId;
	}
	public void setCustSrcId(int custSrcId) {
		this.custSrcId = custSrcId;
	}
	public Date getCustEffFrom() {
		return custEffFrom;
	}
	public void setCustEffFrom(Date custEffFrom) {
		this.custEffFrom = custEffFrom;
	}
	public Date getCustEffTo() {
		return custEffTo;
	}
	public void setCustEffTo(Date custEffTo) {
		this.custEffTo = custEffTo;
	}
	public String getCust_valid() {
		return cust_valid;
	}
	public void setCust_valid(String cust_valid) {
		this.cust_valid = cust_valid;
	}
	public Country getCountryId() {
		return countryId;
	}
	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}
	public Customer(int custId, String custFirstName, String custLastName, String custGender, int custYearOfBirth,
			String custMaritalStatus, String custStreetAddress, String custPostalCode, String custCity, int custCityId,
			String custStateProvince, int custStateProvinceId, Country countryId, String custMainPhoneINT,
			String custIncomeLevel, int custCreditLimit, String custEmail, String custTotal, int custTotalId,
			int custSrcId, Date custEffFrom, Date custEffTo, String cust_valid) {
		super();
		this.custId = custId;
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custGender = custGender;
		this.custYearOfBirth = custYearOfBirth;
		this.custMaritalStatus = custMaritalStatus;
		this.custStreetAddress = custStreetAddress;
		this.custPostalCode = custPostalCode;
		this.custCity = custCity;
		this.custCityId = custCityId;
		this.custStateProvince = custStateProvince;
		this.custStateProvinceId = custStateProvinceId;
		this.countryId = countryId;
		this.custMainPhoneINT = custMainPhoneINT;
		this.custIncomeLevel = custIncomeLevel;
		this.custCreditLimit = custCreditLimit;
		this.custEmail = custEmail;
		this.custTotal = custTotal;
		this.custTotalId = custTotalId;
		this.custSrcId = custSrcId;
		this.custEffFrom = custEffFrom;
		this.custEffTo = custEffTo;
		this.cust_valid = cust_valid;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custFirstName=" + custFirstName + ", custLastName=" + custLastName
				+ ", custGender=" + custGender + ", custYearOfBirth=" + custYearOfBirth + ", custMaritalStatus="
				+ custMaritalStatus + ", custStreetAddress=" + custStreetAddress + ", custPostalCode=" + custPostalCode
				+ ", custCity=" + custCity + ", custCityId=" + custCityId + ", custStateProvince=" + custStateProvince
				+ ", custStateProvinceId=" + custStateProvinceId + ", countryId=" + countryId + ", custMainPhoneINT="
				+ custMainPhoneINT + ", custIncomeLevel=" + custIncomeLevel + ", custCreditLimit=" + custCreditLimit
				+ ", custEmail=" + custEmail + ", custTotal=" + custTotal + ", custTotalId=" + custTotalId
				+ ", custSrcId=" + custSrcId + ", custEffFrom=" + custEffFrom + ", custEffTo=" + custEffTo
				+ ", cust_valid=" + cust_valid + "]";
	}
	public Customer() {
		super();
	}
	
}
