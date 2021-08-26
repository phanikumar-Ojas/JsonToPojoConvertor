package pojo.entity.v1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErxTransProvider {

  @JsonProperty("erxTransProviderId")
  private long erxTransProviderId;

  @JsonProperty("erxTransCommonBufferId")
  private long erxTransCommonBufferId;

  @JsonProperty("rank")
  private BigDecimal rank;

  @JsonProperty("prescriberId")
  private String prescriberId;

  @JsonProperty("prescriberCd")
  private String prescriberCd;

  @JsonProperty("clinicOrgName")
  private String clinicOrgName;

  @JsonProperty("prescriberRefNb1")
  private String prescriberRefNb1;

  @JsonProperty("prescriberRefQual1")
  private String prescriberRefQual1;

  @JsonProperty("street")
  private String street;

  @JsonProperty("city")
  private String city;

  @JsonProperty("zip")
  private String zip;

  @JsonProperty("prescriberCommNb1")
  private String prescriberCommNb1;

  @JsonProperty("prescriberCommNbCd1Id")
  private BigDecimal prescriberCommNbCd1Id;

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


public String getPrescriberId() {
	return prescriberId;
}


public void setPrescriberId(String prescriberId) {
	this.prescriberId = prescriberId;
}


public String getPrescriberCd() {
	return prescriberCd;
}


public void setPrescriberCd(String prescriberCd) {
	this.prescriberCd = prescriberCd;
}


public String getClinicOrgName() {
	return clinicOrgName;
}


public void setClinicOrgName(String clinicOrgName) {
	this.clinicOrgName = clinicOrgName;
}


public String getPrescriberRefNb1() {
	return prescriberRefNb1;
}


public void setPrescriberRefNb1(String prescriberRefNb1) {
	this.prescriberRefNb1 = prescriberRefNb1;
}


public String getPrescriberRefQual1() {
	return prescriberRefQual1;
}


public void setPrescriberRefQual1(String prescriberRefQual1) {
	this.prescriberRefQual1 = prescriberRefQual1;
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


public String getPrescriberCommNb1() {
	return prescriberCommNb1;
}


public void setPrescriberCommNb1(String prescriberCommNb1) {
	this.prescriberCommNb1 = prescriberCommNb1;
}


public BigDecimal getPrescriberCommNbCd1Id() {
	return prescriberCommNbCd1Id;
}


public void setPrescriberCommNbCd1Id(BigDecimal prescriberCommNbCd1Id) {
	this.prescriberCommNbCd1Id = prescriberCommNbCd1Id;
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
