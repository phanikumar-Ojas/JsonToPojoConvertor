package pojo.entity.v1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
import pojo.entity.ErxTransDrugSegment;
import pojo.entity.ErxTransProvider;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErxIntakeEnrollment {

	@JsonProperty("erxTransCommonBufferId")
	private long erxTransCommonBufferId;
	@JsonProperty("componentSeparator")
	private String componentSeparator;
	@JsonProperty("dataElementSeparator")
	private String dataElementSeparator;
	@JsonProperty("decimalNotation")
	private String decimalNotation;
	@JsonProperty("origTraceNb")
	private String origTraceNb;
	@JsonProperty("processTime")
	private String processTime;
	@JsonProperty("pttCity")
	private String pttCity;
	@JsonProperty("pttCommNb")
	private String pttCommNb;
	@JsonProperty("pttCommNb1")
	private String pttCommNb1;
	@JsonProperty("pttCommNb2")
	private String pttCommNb2;
	@JsonProperty("pttCommNbCdId1")
	private BigDecimal pttCommNbCdId1;
	@JsonProperty("pttCommNbCdId2")
	private BigDecimal pttCommNbCdId2;
	@JsonProperty("pttDateOfBirth")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "America/New_York")
	private Date pttDateOfBirth;
	@JsonProperty("pttFirstName")
	private String pttFirstName;
	@JsonProperty("pttGender")
	private String pttGender;
	@JsonProperty("pttId")
	private String pttId;
	@JsonProperty("pttIdNb1")
	private String pttIdNb1;
	@JsonProperty("pttIdNb2")
	private String pttIdNb2;
	@JsonProperty("pttIdNbQual1")
	private String pttIdNbQual1;
	@JsonProperty("pttIdNbQual2")
	private String pttIdNbQual2;
	@JsonProperty("pttLastName")
	private String pttLastName;
	@JsonProperty("pttLocation")
	private String pttLocation;
	@JsonProperty("pttLocationBed")
	private String pttLocationBed;
	@JsonProperty("pttLocationQual")
	private String pttLocationQual;
	@JsonProperty("pttLocationRoom")
	private String pttLocationRoom;
	@JsonProperty("pttLocationUnit")
	private String pttLocationUnit;
	@JsonProperty("erxTransTypeId")
	private String erxTransTypeId;
	@JsonProperty("releaseIndicator")
	private String releaseIndicator;
	@JsonProperty("storeNumber")
	private BigDecimal storeNumber;
	@JsonProperty("repetitionIndicator")
	private String repetitionIndicator;
	@JsonProperty("statusId")
	private String statusId;
	@JsonProperty("routingId")
	private String routingId;
	@JsonProperty("segmentSeparator")
	private String segmentSeparator;
	@JsonProperty("uibId")
	private String uibId;
	@JsonProperty("uibInitDate")
	private Date uibInitDate;
	@JsonProperty("uibInitRefId")
	private String uibInitRefId;
	@JsonProperty("uibInitTime")
	private String uibInitTime;
	@JsonProperty("uibReceiverIdLevel1")
	private String uibReceiverIdLevel1;
	@JsonProperty("uibReceiverIdLevel2")
	private String uibReceiverIdLevel2;
	@JsonProperty("uibReceiverIdLevel3")
	private String uibReceiverIdLevel3;
	@JsonProperty("uibReceiverLevel1Qual")
	private String uibReceiverLevel1Qual;
	@JsonProperty("uibSendIdLevel1")
	private String uibSendIdLevel1;
	@JsonProperty("uibSendcIdLevel2")
	private String uibSendcIdLevel2;
	@JsonProperty("uibSendIdLevel3")
	private String uibSendIdLevel3;
	@JsonProperty("uibSendLevel1Qual")
	private String uibSendLevel1Qual;
	@JsonProperty("uibSyntaxId")
	private String uibSyntaxId;
	@JsonProperty("uibSyntaxVersion")
	private String uibSyntaxVersion;
	@JsonProperty("uibTestInd")
	private String uibTestInd;
	@JsonProperty("uibTxnCntlRef")
	private String uibTxnCntlRef;
	@JsonProperty("uihAssocAsgnCd")
	private String uihAssocAsgnCd;
	@JsonProperty("uihCtrlAgency")
	private String uihCtrlAgency;
	@JsonProperty("uihId")
	private String uihId;
	@JsonProperty("uihInitDate")
	private String uihInitDate;
	@JsonProperty("uihInitTime")
	private String uihInitTime;
	@JsonProperty("uihInitiatorCtrlRef")
	private String uihInitiatorCtrlRef;
	@JsonProperty("uihInitiatorRefId")
	private String uihInitiatorRefId;
	@JsonProperty("uihMsgRefNb")
	private String uihMsgRefNb;
	@JsonProperty("uihMsgReleaseNb")
	private String uihMsgReleaseNb;
	@JsonProperty("uihMsgType")
	private String uihMsgType;
	@JsonProperty("uihMsgVersionNb")
	private String uihMsgVersionNb;
	@JsonProperty("uihResponderCtrlRef")
	private String uihResponderCtrlRef;
	@JsonProperty("uihTestInd")
	private String uihTestInd;
	@JsonProperty("uitId")
	private String uitId;
	@JsonProperty("uitMsgRefNb")
	private String uitMsgRefNb;
	@JsonProperty("uitNbOfSegments")
	private BigDecimal uitNbOfSegments;
	@JsonProperty("uizId")
	private String uizId;
	@JsonProperty("uizItxCtrlCnt")
	private BigDecimal uizItxCtrlCnt;
	@JsonProperty("unaId")
	private String unaId;
	@JsonProperty("updateBy")
	private String updateBy;
	@JsonProperty("updateByProcess")
	private String updateByProcess;
	@JsonProperty("updateDate")
	private Date updateDate;
	@JsonProperty("workedInd")
	private String workedInd;
	@JsonProperty("uihMsgFunctionId")
	private String uihMsgFunctionId;
	@JsonProperty("createBySystemId")
	private String createBySystemId;
	@JsonProperty("pttGestationalAge")
	private String pttGestationalAge;
	@JsonProperty("pttStreet")
	private String pttStreet;
	@JsonProperty("pttState")
	private String pttState;
	@JsonProperty("pttZip")
	private String pttZip;
	@JsonProperty("createByProcess")
	private String createByProcess;
	private ErxTransDrugSegment erxTransDrugSegment;
	private ErxTransProvider prescriberInfo;
	private StoreAddress storeAddress;

	public long getErxTransCommonBufferId() {
		return erxTransCommonBufferId;
	}

	public void setErxTransCommonBufferId(long erxTransCommonBufferId) {
		this.erxTransCommonBufferId = erxTransCommonBufferId;
	}

	public String getComponentSeparator() {
		return componentSeparator;
	}

	public void setComponentSeparator(String componentSeparator) {
		this.componentSeparator = componentSeparator;
	}

	public String getDataElementSeparator() {
		return dataElementSeparator;
	}

	public void setDataElementSeparator(String dataElementSeparator) {
		this.dataElementSeparator = dataElementSeparator;
	}

	public String getDecimalNotation() {
		return decimalNotation;
	}

	public void setDecimalNotation(String decimalNotation) {
		this.decimalNotation = decimalNotation;
	}

	public String getOrigTraceNb() {
		return origTraceNb;
	}

	public void setOrigTraceNb(String origTraceNb) {
		this.origTraceNb = origTraceNb;
	}

	public String getProcessTime() {
		return processTime;
	}

	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}

	public String getPttCity() {
		return pttCity;
	}

	public void setPttCity(String pttCity) {
		this.pttCity = pttCity;
	}

	public String getPttCommNb() {
		return pttCommNb;
	}

	public void setPttCommNb(String pttCommNb) {
		this.pttCommNb = pttCommNb;
	}

	public String getPttCommNb1() {
		return pttCommNb1;
	}

	public void setPttCommNb1(String pttCommNb1) {
		this.pttCommNb1 = pttCommNb1;
	}

	public String getPttCommNb2() {
		return pttCommNb2;
	}

	public void setPttCommNb2(String pttCommNb2) {
		this.pttCommNb2 = pttCommNb2;
	}

	public BigDecimal getPttCommNbCdId1() {
		return pttCommNbCdId1;
	}

	public void setPttCommNbCdId1(BigDecimal pttCommNbCdId1) {
		this.pttCommNbCdId1 = pttCommNbCdId1;
	}

	public BigDecimal getPttCommNbCdId2() {
		return pttCommNbCdId2;
	}

	public void setPttCommNbCdId2(BigDecimal pttCommNbCdId2) {
		this.pttCommNbCdId2 = pttCommNbCdId2;
	}

	public Date getPttDateOfBirth() {
		return pttDateOfBirth;
	}

	public void setPttDateOfBirth(Date pttDateOfBirth) {
		this.pttDateOfBirth = pttDateOfBirth;
	}

	public String getPttFirstName() {
		return pttFirstName;
	}

	public void setPttFirstName(String pttFirstName) {
		this.pttFirstName = pttFirstName;
	}

	public String getPttGender() {
		return pttGender;
	}

	public void setPttGender(String pttGender) {
		this.pttGender = pttGender;
	}

	public String getPttId() {
		return pttId;
	}

	public void setPttId(String pttId) {
		this.pttId = pttId;
	}

	public String getPttIdNb1() {
		return pttIdNb1;
	}

	public void setPttIdNb1(String pttIdNb1) {
		this.pttIdNb1 = pttIdNb1;
	}

	public String getPttIdNb2() {
		return pttIdNb2;
	}

	public void setPttIdNb2(String pttIdNb2) {
		this.pttIdNb2 = pttIdNb2;
	}

	public String getPttIdNbQual1() {
		return pttIdNbQual1;
	}

	public void setPttIdNbQual1(String pttIdNbQual1) {
		this.pttIdNbQual1 = pttIdNbQual1;
	}

	public String getPttIdNbQual2() {
		return pttIdNbQual2;
	}

	public void setPttIdNbQual2(String pttIdNbQual2) {
		this.pttIdNbQual2 = pttIdNbQual2;
	}

	public String getPttLastName() {
		return pttLastName;
	}

	public void setPttLastName(String pttLastName) {
		this.pttLastName = pttLastName;
	}

	public String getPttLocation() {
		return pttLocation;
	}

	public void setPttLocation(String pttLocation) {
		this.pttLocation = pttLocation;
	}

	public String getPttLocationBed() {
		return pttLocationBed;
	}

	public void setPttLocationBed(String pttLocationBed) {
		this.pttLocationBed = pttLocationBed;
	}

	public String getPttLocationQual() {
		return pttLocationQual;
	}

	public void setPttLocationQual(String pttLocationQual) {
		this.pttLocationQual = pttLocationQual;
	}

	public String getPttLocationRoom() {
		return pttLocationRoom;
	}

	public void setPttLocationRoom(String pttLocationRoom) {
		this.pttLocationRoom = pttLocationRoom;
	}

	public String getPttLocationUnit() {
		return pttLocationUnit;
	}

	public void setPttLocationUnit(String pttLocationUnit) {
		this.pttLocationUnit = pttLocationUnit;
	}

	public String getErxTransTypeId() {
		return erxTransTypeId;
	}

	public void setErxTransTypeId(String erxTransTypeId) {
		this.erxTransTypeId = erxTransTypeId;
	}

	public String getReleaseIndicator() {
		return releaseIndicator;
	}

	public void setReleaseIndicator(String releaseIndicator) {
		this.releaseIndicator = releaseIndicator;
	}

	public BigDecimal getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(BigDecimal storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getRepetitionIndicator() {
		return repetitionIndicator;
	}

	public void setRepetitionIndicator(String repetitionIndicator) {
		this.repetitionIndicator = repetitionIndicator;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getRoutingId() {
		return routingId;
	}

	public void setRoutingId(String routingId) {
		this.routingId = routingId;
	}

	public String getSegmentSeparator() {
		return segmentSeparator;
	}

	public void setSegmentSeparator(String segmentSeparator) {
		this.segmentSeparator = segmentSeparator;
	}

	public String getUibId() {
		return uibId;
	}

	public void setUibId(String uibId) {
		this.uibId = uibId;
	}

	public Date getUibInitDate() {
		return uibInitDate;
	}

	public void setUibInitDate(Date uibInitDate) {
		this.uibInitDate = uibInitDate;
	}

	public String getUibInitRefId() {
		return uibInitRefId;
	}

	public void setUibInitRefId(String uibInitRefId) {
		this.uibInitRefId = uibInitRefId;
	}

	public String getUibInitTime() {
		return uibInitTime;
	}

	public void setUibInitTime(String uibInitTime) {
		this.uibInitTime = uibInitTime;
	}

	public String getUibReceiverIdLevel1() {
		return uibReceiverIdLevel1;
	}

	public void setUibReceiverIdLevel1(String uibReceiverIdLevel1) {
		this.uibReceiverIdLevel1 = uibReceiverIdLevel1;
	}

	public String getUibReceiverIdLevel2() {
		return uibReceiverIdLevel2;
	}

	public void setUibReceiverIdLevel2(String uibReceiverIdLevel2) {
		this.uibReceiverIdLevel2 = uibReceiverIdLevel2;
	}

	public String getUibReceiverIdLevel3() {
		return uibReceiverIdLevel3;
	}

	public void setUibReceiverIdLevel3(String uibReceiverIdLevel3) {
		this.uibReceiverIdLevel3 = uibReceiverIdLevel3;
	}

	public String getUibReceiverLevel1Qual() {
		return uibReceiverLevel1Qual;
	}

	public void setUibReceiverLevel1Qual(String uibReceiverLevel1Qual) {
		this.uibReceiverLevel1Qual = uibReceiverLevel1Qual;
	}

	public String getUibSendIdLevel1() {
		return uibSendIdLevel1;
	}

	public void setUibSendIdLevel1(String uibSendIdLevel1) {
		this.uibSendIdLevel1 = uibSendIdLevel1;
	}

	public String getUibSendcIdLevel2() {
		return uibSendcIdLevel2;
	}

	public void setUibSendcIdLevel2(String uibSendcIdLevel2) {
		this.uibSendcIdLevel2 = uibSendcIdLevel2;
	}

	public String getUibSendIdLevel3() {
		return uibSendIdLevel3;
	}

	public void setUibSendIdLevel3(String uibSendIdLevel3) {
		this.uibSendIdLevel3 = uibSendIdLevel3;
	}

	public String getUibSendLevel1Qual() {
		return uibSendLevel1Qual;
	}

	public void setUibSendLevel1Qual(String uibSendLevel1Qual) {
		this.uibSendLevel1Qual = uibSendLevel1Qual;
	}

	public String getUibSyntaxId() {
		return uibSyntaxId;
	}

	public void setUibSyntaxId(String uibSyntaxId) {
		this.uibSyntaxId = uibSyntaxId;
	}

	public String getUibSyntaxVersion() {
		return uibSyntaxVersion;
	}

	public void setUibSyntaxVersion(String uibSyntaxVersion) {
		this.uibSyntaxVersion = uibSyntaxVersion;
	}

	public String getUibTestInd() {
		return uibTestInd;
	}

	public void setUibTestInd(String uibTestInd) {
		this.uibTestInd = uibTestInd;
	}

	public String getUibTxnCntlRef() {
		return uibTxnCntlRef;
	}

	public void setUibTxnCntlRef(String uibTxnCntlRef) {
		this.uibTxnCntlRef = uibTxnCntlRef;
	}

	public String getUihAssocAsgnCd() {
		return uihAssocAsgnCd;
	}

	public void setUihAssocAsgnCd(String uihAssocAsgnCd) {
		this.uihAssocAsgnCd = uihAssocAsgnCd;
	}

	public String getUihCtrlAgency() {
		return uihCtrlAgency;
	}

	public void setUihCtrlAgency(String uihCtrlAgency) {
		this.uihCtrlAgency = uihCtrlAgency;
	}

	public String getUihId() {
		return uihId;
	}

	public void setUihId(String uihId) {
		this.uihId = uihId;
	}

	public String getUihInitDate() {
		return uihInitDate;
	}

	public void setUihInitDate(String uihInitDate) {
		this.uihInitDate = uihInitDate;
	}

	public String getUihInitTime() {
		return uihInitTime;
	}

	public void setUihInitTime(String uihInitTime) {
		this.uihInitTime = uihInitTime;
	}

	public String getUihInitiatorCtrlRef() {
		return uihInitiatorCtrlRef;
	}

	public void setUihInitiatorCtrlRef(String uihInitiatorCtrlRef) {
		this.uihInitiatorCtrlRef = uihInitiatorCtrlRef;
	}

	public String getUihInitiatorRefId() {
		return uihInitiatorRefId;
	}

	public void setUihInitiatorRefId(String uihInitiatorRefId) {
		this.uihInitiatorRefId = uihInitiatorRefId;
	}

	public String getUihMsgRefNb() {
		return uihMsgRefNb;
	}

	public void setUihMsgRefNb(String uihMsgRefNb) {
		this.uihMsgRefNb = uihMsgRefNb;
	}

	public String getUihMsgReleaseNb() {
		return uihMsgReleaseNb;
	}

	public void setUihMsgReleaseNb(String uihMsgReleaseNb) {
		this.uihMsgReleaseNb = uihMsgReleaseNb;
	}

	public String getUihMsgType() {
		return uihMsgType;
	}

	public void setUihMsgType(String uihMsgType) {
		this.uihMsgType = uihMsgType;
	}

	public String getUihMsgVersionNb() {
		return uihMsgVersionNb;
	}

	public void setUihMsgVersionNb(String uihMsgVersionNb) {
		this.uihMsgVersionNb = uihMsgVersionNb;
	}

	public String getUihResponderCtrlRef() {
		return uihResponderCtrlRef;
	}

	public void setUihResponderCtrlRef(String uihResponderCtrlRef) {
		this.uihResponderCtrlRef = uihResponderCtrlRef;
	}

	public String getUihTestInd() {
		return uihTestInd;
	}

	public void setUihTestInd(String uihTestInd) {
		this.uihTestInd = uihTestInd;
	}

	public String getUitId() {
		return uitId;
	}

	public void setUitId(String uitId) {
		this.uitId = uitId;
	}

	public String getUitMsgRefNb() {
		return uitMsgRefNb;
	}

	public void setUitMsgRefNb(String uitMsgRefNb) {
		this.uitMsgRefNb = uitMsgRefNb;
	}

	public BigDecimal getUitNbOfSegments() {
		return uitNbOfSegments;
	}

	public void setUitNbOfSegments(BigDecimal uitNbOfSegments) {
		this.uitNbOfSegments = uitNbOfSegments;
	}

	public String getUizId() {
		return uizId;
	}

	public void setUizId(String uizId) {
		this.uizId = uizId;
	}

	public BigDecimal getUizItxCtrlCnt() {
		return uizItxCtrlCnt;
	}

	public void setUizItxCtrlCnt(BigDecimal uizItxCtrlCnt) {
		this.uizItxCtrlCnt = uizItxCtrlCnt;
	}

	public String getUnaId() {
		return unaId;
	}

	public void setUnaId(String unaId) {
		this.unaId = unaId;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateByProcess() {
		return updateByProcess;
	}

	public void setUpdateByProcess(String updateByProcess) {
		this.updateByProcess = updateByProcess;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getWorkedInd() {
		return workedInd;
	}

	public void setWorkedInd(String workedInd) {
		this.workedInd = workedInd;
	}

	public String getUihMsgFunctionId() {
		return uihMsgFunctionId;
	}

	public void setUihMsgFunctionId(String uihMsgFunctionId) {
		this.uihMsgFunctionId = uihMsgFunctionId;
	}

	public String getCreateBySystemId() {
		return createBySystemId;
	}

	public void setCreateBySystemId(String createBySystemId) {
		this.createBySystemId = createBySystemId;
	}

	public String getPttGestationalAge() {
		return pttGestationalAge;
	}

	public void setPttGestationalAge(String pttGestationalAge) {
		this.pttGestationalAge = pttGestationalAge;
	}

	public String getPttStreet() {
		return pttStreet;
	}

	public void setPttStreet(String pttStreet) {
		this.pttStreet = pttStreet;
	}

	public String getPttState() {
		return pttState;
	}

	public void setPttState(String pttState) {
		this.pttState = pttState;
	}

	public String getPttZip() {
		return pttZip;
	}

	public void setPttZip(String pttZip) {
		this.pttZip = pttZip;
	}

	public String getCreateByProcess() {
		return createByProcess;
	}

	public void setCreateByProcess(String createByProcess) {
		this.createByProcess = createByProcess;
	}

	public ErxTransDrugSegment getErxTransDrugSegment() {
		return erxTransDrugSegment;
	}

	public void setErxTransDrugSegment(ErxTransDrugSegment erxTransDrugSegment) {
		this.erxTransDrugSegment = erxTransDrugSegment;
	}

	public ErxTransProvider getPrescriberInfo() {
		return prescriberInfo;
	}

	public void setPrescriberInfo(ErxTransProvider prescriberInfo) {
		this.prescriberInfo = prescriberInfo;
	}

	public StoreAddress getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(StoreAddress storeAddress) {
		this.storeAddress = storeAddress;
	}

	@Override
	public String toString() {
		return "ErxIntakeEnrollment [erxTransCommonBufferId=" + erxTransCommonBufferId + ", componentSeparator="
				+ componentSeparator + ", dataElementSeparator=" + dataElementSeparator + ", decimalNotation="
				+ decimalNotation + ", origTraceNb=" + origTraceNb + ", processTime=" + processTime + ", pttCity="
				+ pttCity + ", pttCommNb=" + pttCommNb + ", pttCommNb1=" + pttCommNb1 + ", pttCommNb2=" + pttCommNb2
				+ ", pttCommNbCdId1=" + pttCommNbCdId1 + ", pttCommNbCdId2=" + pttCommNbCdId2 + ", pttDateOfBirth="
				+ pttDateOfBirth + ", pttFirstName=" + pttFirstName + ", pttGender=" + pttGender + ", pttId=" + pttId
				+ ", pttIdNb1=" + pttIdNb1 + ", pttIdNb2=" + pttIdNb2 + ", pttIdNbQual1=" + pttIdNbQual1
				+ ", pttIdNbQual2=" + pttIdNbQual2 + ", pttLastName=" + pttLastName + ", pttLocation=" + pttLocation
				+ ", pttLocationBed=" + pttLocationBed + ", pttLocationQual=" + pttLocationQual + ", pttLocationRoom="
				+ pttLocationRoom + ", pttLocationUnit=" + pttLocationUnit + ", erxTransTypeId=" + erxTransTypeId
				+ ", releaseIndicator=" + releaseIndicator + ", storeNumber=" + storeNumber + ", repetitionIndicator="
				+ repetitionIndicator + ", statusId=" + statusId + ", routingId=" + routingId + ", segmentSeparator="
				+ segmentSeparator + ", uibId=" + uibId + ", uibInitDate=" + uibInitDate + ", uibInitRefId="
				+ uibInitRefId + ", uibInitTime=" + uibInitTime + ", uibReceiverIdLevel1=" + uibReceiverIdLevel1
				+ ", uibReceiverIdLevel2=" + uibReceiverIdLevel2 + ", uibReceiverIdLevel3=" + uibReceiverIdLevel3
				+ ", uibReceiverLevel1Qual=" + uibReceiverLevel1Qual + ", uibSendIdLevel1=" + uibSendIdLevel1
				+ ", uibSendcIdLevel2=" + uibSendcIdLevel2 + ", uibSendIdLevel3=" + uibSendIdLevel3
				+ ", uibSendLevel1Qual=" + uibSendLevel1Qual + ", uibSyntaxId=" + uibSyntaxId + ", uibSyntaxVersion="
				+ uibSyntaxVersion + ", uibTestInd=" + uibTestInd + ", uibTxnCntlRef=" + uibTxnCntlRef
				+ ", uihAssocAsgnCd=" + uihAssocAsgnCd + ", uihCtrlAgency=" + uihCtrlAgency + ", uihId=" + uihId
				+ ", uihInitDate=" + uihInitDate + ", uihInitTime=" + uihInitTime + ", uihInitiatorCtrlRef="
				+ uihInitiatorCtrlRef + ", uihInitiatorRefId=" + uihInitiatorRefId + ", uihMsgRefNb=" + uihMsgRefNb
				+ ", uihMsgReleaseNb=" + uihMsgReleaseNb + ", uihMsgType=" + uihMsgType + ", uihMsgVersionNb="
				+ uihMsgVersionNb + ", uihResponderCtrlRef=" + uihResponderCtrlRef + ", uihTestInd=" + uihTestInd
				+ ", uitId=" + uitId + ", uitMsgRefNb=" + uitMsgRefNb + ", uitNbOfSegments=" + uitNbOfSegments
				+ ", uizId=" + uizId + ", uizItxCtrlCnt=" + uizItxCtrlCnt + ", unaId=" + unaId + ", updateBy="
				+ updateBy + ", updateByProcess=" + updateByProcess + ", updateDate=" + updateDate + ", workedInd="
				+ workedInd + ", uihMsgFunctionId=" + uihMsgFunctionId + ", createBySystemId=" + createBySystemId
				+ ", pttGestationalAge=" + pttGestationalAge + ", pttStreet=" + pttStreet + ", pttState=" + pttState
				+ ", pttZip=" + pttZip + ", createByProcess=" + createByProcess + ", erxTransDrugSegment="
				+ erxTransDrugSegment + ", prescriberInfo=" + prescriberInfo + ", storeAddress=" + storeAddress + "]";
	}

}