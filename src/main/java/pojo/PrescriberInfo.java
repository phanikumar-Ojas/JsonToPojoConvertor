package pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrescriberInfo {

	@JsonProperty("city")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	String city;

	@JsonProperty("clinicOrgName")
	public String getClinicOrgName() {
		return this.clinicOrgName;
	}

	public void setClinicOrgName(String clinicOrgName) {
		this.clinicOrgName = clinicOrgName;
	}

	String clinicOrgName;

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

	@JsonProperty("prescriberCd")
	public String getPrescriberCd() {
		return this.prescriberCd;
	}

	public void setPrescriberCd(String prescriberCd) {
		this.prescriberCd = prescriberCd;
	}

	String prescriberCd;

	@JsonProperty("createBy")
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	String createBy;

	@JsonProperty("prescriberCommNb1")
	public String getPrescriberCommNb1() {
		return this.prescriberCommNb1;
	}

	public void setPrescriberCommNb1(String prescriberCommNb1) {
		this.prescriberCommNb1 = prescriberCommNb1;
	}

	String prescriberCommNb1;

	@JsonProperty("prescriberCommNbCd1Id")
	public int getPrescriberCommNbCd1Id() {
		return this.prescriberCommNbCd1Id;
	}

	public void setPrescriberCommNbCd1Id(int prescriberCommNbCd1Id) {
		this.prescriberCommNbCd1Id = prescriberCommNbCd1Id;
	}

	int prescriberCommNbCd1Id;

	@JsonProperty("prescriberId")
	public String getPrescriberId() {
		return this.prescriberId;
	}

	public void setPrescriberId(String prescriberId) {
		this.prescriberId = prescriberId;
	}

	String prescriberId;

	@JsonProperty("prescriberRefNb1")
	public String getPrescriberRefNb1() {
		return this.prescriberRefNb1;
	}

	public void setPrescriberRefNb1(String prescriberRefNb1) {
		this.prescriberRefNb1 = prescriberRefNb1;
	}

	String prescriberRefNb1;

	@JsonProperty("prescriberRefQual1")
	public String getPrescriberRefQual1() {
		return this.prescriberRefQual1;
	}

	public void setPrescriberRefQual1(String prescriberRefQual1) {
		this.prescriberRefQual1 = prescriberRefQual1;
	}

	String prescriberRefQual1;

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
	
	

	@JsonProperty("createDate")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	Date createDate;


}
