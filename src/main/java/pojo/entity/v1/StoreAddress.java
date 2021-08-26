package pojo.entity.v1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoreAddress {

	@JsonProperty("erxTransProviderId")
	private long erxTransProviderId;

	@JsonProperty("erxTransCommonBufferId")
	private long erxTransCommonBufferId;

	@JsonProperty("rank")
	private BigDecimal rank;

	@JsonProperty("providerId")
	private String providerId;

	@JsonProperty("providerCd")
	private String providerCd;

	@JsonProperty("providerSpecialtyCd")
	private String providerSpecialtyCd;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("providerRefNb1")
	private String providerRefNb1;

	@JsonProperty("providerRefQual1")
	private String providerRefQual1;

	@JsonProperty("state")
	private String state;

	@JsonProperty("street")
	private String street;

	@JsonProperty("city")
	private String city;

	@JsonProperty("zip")
	private String zip;

	@JsonProperty("providerCommNb1")
	private String providerCommNb1;

	@JsonProperty("providerCommNbCd1Id")
	private BigDecimal providerCommNbCd1Id;

	@JsonProperty("createBy")
	private String createBy;

	@JsonProperty("createByProcess")
	private String createByProcess;

	@JsonProperty("createBySystemId")
	private BigDecimal createBySystemId;

	@JsonProperty("createDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy hh:mm:ss aa", timezone = "America/New_York")
	private Date createDate;

	public long getErxTransProviderId() {
		return erxTransProviderId;
	}

	public void setErxTransProviderId(long erxTransProviderId) {
		this.erxTransProviderId = erxTransProviderId;
	}

	public long getErxTransCommonBufferId() {
		return erxTransCommonBufferId;
	}

	public void setErxTransCommonBufferId(long erxTransCommonBufferId) {
		this.erxTransCommonBufferId = erxTransCommonBufferId;
	}

	public BigDecimal getRank() {
		return rank;
	}

	public void setRank(BigDecimal rank) {
		this.rank = rank;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProviderCd() {
		return providerCd;
	}

	public void setProviderCd(String providerCd) {
		this.providerCd = providerCd;
	}

	public String getProviderSpecialtyCd() {
		return providerSpecialtyCd;
	}

	public void setProviderSpecialtyCd(String providerSpecialtyCd) {
		this.providerSpecialtyCd = providerSpecialtyCd;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProviderRefNb1() {
		return providerRefNb1;
	}

	public void setProviderRefNb1(String providerRefNb1) {
		this.providerRefNb1 = providerRefNb1;
	}

	public String getProviderRefQual1() {
		return providerRefQual1;
	}

	public void setProviderRefQual1(String providerRefQual1) {
		this.providerRefQual1 = providerRefQual1;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getProviderCommNb1() {
		return providerCommNb1;
	}

	public void setProviderCommNb1(String providerCommNb1) {
		this.providerCommNb1 = providerCommNb1;
	}

	public BigDecimal getProviderCommNbCd1Id() {
		return providerCommNbCd1Id;
	}

	public void setProviderCommNbCd1Id(BigDecimal providerCommNbCd1Id) {
		this.providerCommNbCd1Id = providerCommNbCd1Id;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateByProcess() {
		return createByProcess;
	}

	public void setCreateByProcess(String createByProcess) {
		this.createByProcess = createByProcess;
	}

	public BigDecimal getCreateBySystemId() {
		return createBySystemId;
	}

	public void setCreateBySystemId(BigDecimal createBySystemId) {
		this.createBySystemId = createBySystemId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
