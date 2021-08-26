package pojo;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErxTransDrugSegment {
	 @JsonProperty("createBy") 
	    public String getCreateBy() { 
			 return this.createBy; } 
	    public void setCreateBy(String createBy) { 
			 this.createBy = createBy; } 
	    String createBy;
	    @JsonProperty("createDate") 
	    public Date getCreateDate() { 
			 return this.createDate; } 
	    public void setCreateDate(Date createDate) { 
			 this.createDate = createDate; } 
	    Date createDate;
	    @JsonProperty("createByProcess") 
	    public String getCreateByProcess() { 
			 return this.createByProcess; } 
	    public void setCreateByProcess(String createByProcess) { 
			 this.createByProcess = createByProcess; } 
	    String createByProcess;
	    @JsonProperty("createBySystemId") 
	    public BigDecimal getCreateBySystemId() { 
			 return this.createBySystemId; } 
	    public void setCreateBySystemId(BigDecimal createBySystemId) { 
			 this.createBySystemId = createBySystemId; } 
	    BigDecimal createBySystemId;
	    @JsonProperty("druDawCode") 
	    public String getDruDawCode() { 
			 return this.druDawCode; } 
	    public void setDruDawCode(String druDawCode) { 
			 this.druDawCode = druDawCode; } 
	    String druDawCode;
	    @JsonProperty("druDescId") 
	    public String getDruDescId() { 
			 return this.druDescId; } 
	    public void setDruDescId(String druDescId) { 
			 this.druDescId = druDescId; } 
	    String druDescId;
	    @JsonProperty("druDosageText") 
	    public String getDruDosageText() { 
			 return this.druDosageText; } 
	    public void setDruDosageText(String druDosageText) { 
			 this.druDosageText = druDosageText; } 
	    String druDosageText;
	    @JsonProperty("druDrugAgency") 
	    public String getDruDrugAgency() { 
			 return this.druDrugAgency; } 
	    public void setDruDrugAgency(String druDrugAgency) { 
			 this.druDrugAgency = druDrugAgency; } 
	    String druDrugAgency;
	    @JsonProperty("druDrugLongName1") 
	    public String getDruDrugLongName1() { 
			 return this.druDrugLongName1; } 
	    public void setDruDrugLongName1(String druDrugLongName1) { 
			 this.druDrugLongName1 = druDrugLongName1; } 
	    String druDrugLongName1;
	    @JsonProperty("druDrugName") 
	    public String getDruDrugName() { 
			 return this.druDrugName; } 
	    public void setDruDrugName(String druDrugName) { 
			 this.druDrugName = druDrugName; } 
	    String druDrugName;
	    @JsonProperty("druDrugNbNdc") 
	    public String getDruDrugNbNdc() { 
			 return this.druDrugNbNdc; } 
	    public void setDruDrugNbNdc(String druDrugNbNdc) { 
			 this.druDrugNbNdc = druDrugNbNdc; } 
	    String druDrugNbNdc;
	    @JsonProperty("druDrugNumPkg") 
	    public String getDruDrugNumPkg() { 
			 return this.druDrugNumPkg; } 
	    public void setDruDrugNumPkg(String druDrugNumPkg) { 
			 this.druDrugNumPkg = druDrugNumPkg; } 
	    String druDrugNumPkg;
	    @JsonProperty("druDrugPotencyUnitCd1") 
	    public String getDruDrugPotencyUnitCd1() { 
			 return this.druDrugPotencyUnitCd1; } 
	    public void setDruDrugPotencyUnitCd1(String druDrugPotencyUnitCd1) { 
			 this.druDrugPotencyUnitCd1 = druDrugPotencyUnitCd1; } 
	    String druDrugPotencyUnitCd1;
	    @JsonProperty("druDrugQty1") 
	    public String getDruDrugQty1() { 
			 return this.druDrugQty1; } 
	    public void setDruDrugQty1(String druDrugQty1) { 
			 this.druDrugQty1 = druDrugQty1; } 
	    String druDrugQty1;
	    @JsonProperty("druDrugQtyCd1") 
	    public String getDruDrugQtyCd1() { 
			 return this.druDrugQtyCd1; } 
	    public void setDruDrugQtyCd1(String druDrugQtyCd1) { 
			 this.druDrugQtyCd1 = druDrugQtyCd1; } 
	    String druDrugQtyCd1;
	    @JsonProperty("druDrugQtySrcCd1") 
	    public String getDruDrugQtySrcCd1() { 
			 return this.druDrugQtySrcCd1; } 
	    public void setDruDrugQtySrcCd1(String druDrugQtySrcCd1) { 
			 this.druDrugQtySrcCd1 = druDrugQtySrcCd1; } 
	    String druDrugQtySrcCd1;
	    @JsonProperty("druFreeText1") 
	    public String getDruFreeText1() { 
			 return this.druFreeText1; } 
	    public void setDruFreeText1(String druFreeText1) { 
			 this.druFreeText1 = druFreeText1; } 
	    String druFreeText1;
	    @JsonProperty("druId") 
	    public String getDruId() { 
			 return this.druId; } 
	    public void setDruId(String druId) { 
			 this.druId = druId; } 
	    String druId;
	    @JsonProperty("druRefillQty") 
	    public String getDruRefillQty() { 
			 return this.druRefillQty; } 
	    public void setDruRefillQty(String druRefillQty) { 
			 this.druRefillQty = druRefillQty; } 
	    String druRefillQty;
	    @JsonProperty("druTimezoneQty") 
	    public String getDruTimezoneQty() { 
			 return this.druTimezoneQty; } 
	    public void setDruTimezoneQty(String druTimezoneQty) { 
			 this.druTimezoneQty = druTimezoneQty; } 
	    String druTimezoneQty;
	    @JsonProperty("erxTransCommonBufferId") 
	    public long getErxTransCommonBufferId() { 
			 return this.erxTransCommonBufferId; } 
	    public void setErxTransCommonBufferId(long erxTransCommonBufferId) { 
			 this.erxTransCommonBufferId = erxTransCommonBufferId; } 
	    long erxTransCommonBufferId;
	    @JsonProperty("erxTransDrugId") 
	    public long getErxTransDrugId() { 
			 return this.erxTransDrugId; } 
	    public void setErxTransDrugId(long erxTransDrugId) { 
			 this.erxTransDrugId = erxTransDrugId; } 
	    long erxTransDrugId;
	    @JsonProperty("rank") 
	    public BigDecimal getRank() { 
			 return this.rank; } 
	    public void setRank(BigDecimal rank) { 
			 this.rank = rank; } 
	   BigDecimal rank;
	
}
