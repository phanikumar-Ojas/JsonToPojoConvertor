package pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StoreAddress {

	@JsonProperty("city")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	String city;

	@JsonProperty("createByProcess")
	public String getCreateByProcess() {
		return this.createByProcess;
	}

	public void setCreateByProcess(String createByProcess) {
		this.createByProcess = createByProcess;
	}

	String createByProcess;

	@JsonProperty("createBySystemId")
	public int getCreateBySystemId() {
		return this.createBySystemId;
	}

	public void setCreateBySystemId(int createBySystemId) {
		this.createBySystemId = createBySystemId;
	}

	int createBySystemId;

	@JsonProperty("firstName")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String firstName;

	@JsonProperty("lastName")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String lastName;

	@JsonProperty("providerCd")
	public String getProviderCd() {
		return this.providerCd;
	}

	public void setProviderCd(String providerCd) {
		this.providerCd = providerCd;
	}

	String providerCd;

	@JsonProperty("providerCommNb1")
	public String getProviderCommNb1() {
		return this.providerCommNb1;
	}

	public void setProviderCommNb1(String providerCommNb1) {
		this.providerCommNb1 = providerCommNb1;
	}

	String providerCommNb1;

	@JsonProperty("providerCommNbCd1Id")
	public int getProviderCommNbCd1Id() {
		return this.providerCommNbCd1Id;
	}

	public void setProviderCommNbCd1Id(int providerCommNbCd1Id) {
		this.providerCommNbCd1Id = providerCommNbCd1Id;
	}

	int providerCommNbCd1Id;

	@JsonProperty("providerId")
	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	String providerId;

	@JsonProperty("providerRefNb1")
	public String getProviderRefNb1() {
		return this.providerRefNb1;
	}

	public void setProviderRefNb1(String providerRefNb1) {
		this.providerRefNb1 = providerRefNb1;
	}

	String providerRefNb1;

	@JsonProperty("providerRefQual1")
	public String getProviderRefQual1() {
		return this.providerRefQual1;
	}

	public void setProviderRefQual1(String providerRefQual1) {
		this.providerRefQual1 = providerRefQual1;
	}

	String providerRefQual1;

	@JsonProperty("providerSpecialtyCd")
	public String getProviderSpecialtyCd() {
		return this.providerSpecialtyCd;
	}

	public void setProviderSpecialtyCd(String providerSpecialtyCd) {
		this.providerSpecialtyCd = providerSpecialtyCd;
	}

	String providerSpecialtyCd;

	@JsonProperty("state")
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	String state;

	@JsonProperty("street")
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	String street;

	@JsonProperty("zip")
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	String zip;

	@JsonProperty("erxTransProviderId")
	public long getErxTransProviderId() {
		return erxTransProviderId;
	}

	public void setErxTransProviderId(long erxTransProviderId) {
		this.erxTransProviderId = erxTransProviderId;
	}

	long erxTransProviderId;

	@JsonProperty("erxTransCommonBufferId")
	public long getErxTransCommonBufferId() {
		return erxTransCommonBufferId;
	}

	public void setErxTransCommonBufferId(long erxTransCommonBufferId) {
		this.erxTransCommonBufferId = erxTransCommonBufferId;
	}

	long erxTransCommonBufferId;

	@JsonProperty("rank")
	public BigDecimal getRank() {
		return rank;
	}

	public void setRank(BigDecimal rank) {
		this.rank = rank;
	}

	BigDecimal rank;

	@JsonProperty("createBy")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	String createBy;

	@JsonProperty("createDate")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	Date createDate;
}
