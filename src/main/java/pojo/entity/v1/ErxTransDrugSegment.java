package pojo.entity.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErxTransDrugSegment {

  @JsonProperty("erxTransDrugId")
  private long erxTransDrugId;

  @JsonProperty("erxTransCommonBufferId")
  private long erxTransCommonBufferId;

  @JsonProperty("rank")
  private BigDecimal rank;

  @JsonProperty("druId")
  private String druId;

  @JsonProperty("druDescId")
  private String druDescId;

  @JsonProperty("druDrugNbNdc")
  private String druDrugNbNdc;

  @JsonProperty("druDrugName")
  private String druDrugName;

  @JsonProperty("druDrugAgency")
  private String druDrugAgency;

  @JsonProperty("druDrugLongName1")
  private String druDrugLongName1;

  @JsonProperty("druDrugQty1")
  private String druDrugQty1;

  @JsonProperty("druDrugQtyCd1")
  private String druDrugQtyCd1;

  @JsonProperty("druDawCode")
  private String druDawCode;

  @JsonProperty("druRefillQty")
  private String druRefillQty;

  @JsonProperty("druFreeText1")
  private String druFreeText1;

  @JsonProperty("druDosageText")
  private String druDosageText;

  @JsonProperty("createBy")
  private String createBy;


  @JsonProperty("createByProcess")
  private String createByProcess;


  @JsonProperty("createBySystemId")
  private BigDecimal createBySystemId;


  @JsonProperty("createDate")
  private Date createDate;

  @JsonProperty("druDrugQtySrcCd1")
  private String druDrugQtySrcCd1;

  @JsonProperty("druDrugPotencyUnitCd1")
  private String druDrugPotencyUnitCd1;

  @JsonProperty("druTimezoneQty")
  private String druTimezoneQty;

  @JsonProperty("druDrugNumPkg")
  private String druDrugNumPkg;

public long getErxTransDrugId() {
	return erxTransDrugId;
}

public void setErxTransDrugId(long erxTransDrugId) {
	this.erxTransDrugId = erxTransDrugId;
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

public String getDruId() {
	return druId;
}

public void setDruId(String druId) {
	this.druId = druId;
}

public String getDruDescId() {
	return druDescId;
}

public void setDruDescId(String druDescId) {
	this.druDescId = druDescId;
}

public String getDruDrugNbNdc() {
	return druDrugNbNdc;
}

public void setDruDrugNbNdc(String druDrugNbNdc) {
	this.druDrugNbNdc = druDrugNbNdc;
}

public String getDruDrugName() {
	return druDrugName;
}

public void setDruDrugName(String druDrugName) {
	this.druDrugName = druDrugName;
}

public String getDruDrugAgency() {
	return druDrugAgency;
}

public void setDruDrugAgency(String druDrugAgency) {
	this.druDrugAgency = druDrugAgency;
}

public String getDruDrugLongName1() {
	return druDrugLongName1;
}

public void setDruDrugLongName1(String druDrugLongName1) {
	this.druDrugLongName1 = druDrugLongName1;
}

public String getDruDrugQty1() {
	return druDrugQty1;
}

public void setDruDrugQty1(String druDrugQty1) {
	this.druDrugQty1 = druDrugQty1;
}

public String getDruDrugQtyCd1() {
	return druDrugQtyCd1;
}

public void setDruDrugQtyCd1(String druDrugQtyCd1) {
	this.druDrugQtyCd1 = druDrugQtyCd1;
}

public String getDruDawCode() {
	return druDawCode;
}

public void setDruDawCode(String druDawCode) {
	this.druDawCode = druDawCode;
}

public String getDruRefillQty() {
	return druRefillQty;
}

public void setDruRefillQty(String druRefillQty) {
	this.druRefillQty = druRefillQty;
}

public String getDruFreeText1() {
	return druFreeText1;
}

public void setDruFreeText1(String druFreeText1) {
	this.druFreeText1 = druFreeText1;
}

public String getDruDosageText() {
	return druDosageText;
}

public void setDruDosageText(String druDosageText) {
	this.druDosageText = druDosageText;
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

public String getDruDrugQtySrcCd1() {
	return druDrugQtySrcCd1;
}

public void setDruDrugQtySrcCd1(String druDrugQtySrcCd1) {
	this.druDrugQtySrcCd1 = druDrugQtySrcCd1;
}

public String getDruDrugPotencyUnitCd1() {
	return druDrugPotencyUnitCd1;
}

public void setDruDrugPotencyUnitCd1(String druDrugPotencyUnitCd1) {
	this.druDrugPotencyUnitCd1 = druDrugPotencyUnitCd1;
}

public String getDruTimezoneQty() {
	return druTimezoneQty;
}

public void setDruTimezoneQty(String druTimezoneQty) {
	this.druTimezoneQty = druTimezoneQty;
}

public String getDruDrugNumPkg() {
	return druDrugNumPkg;
}

public void setDruDrugNumPkg(String druDrugNumPkg) {
	this.druDrugNumPkg = druDrugNumPkg;
}

  
  

}
