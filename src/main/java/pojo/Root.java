package pojo;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	@JsonProperty("createByProcess")
	public String getCreateByProcess() {
		return this.createByProcess;
	}

	public void setCreateByProcess(String createByProcess) {
		this.createByProcess = createByProcess;
	}

	String createByProcess;

	@JsonProperty("createBySystemId")
	public String getCreateBySystemId() {
		return this.createBySystemId;
	}

	public void setCreateBySystemId(String createBySystemId) {
		this.createBySystemId = createBySystemId;
	}

	String createBySystemId;

	@JsonProperty("erxTransCommonBufferId")
	public Long getErxTransCommonBufferId() {
		return this.erxTransCommonBufferId;
	}

	public void setErxTransCommonBufferId(Long erxTransCommonBufferId) {
		this.erxTransCommonBufferId = erxTransCommonBufferId;
	}

Long erxTransCommonBufferId;

	@JsonProperty("erxTransDrugSegment")
	public ErxTransDrugSegment getErxTransDrugSegment() {
		return this.erxTransDrugSegment;
	}

	public void setErxTransDrugSegment(ErxTransDrugSegment erxTransDrugSegment) {
		this.erxTransDrugSegment = erxTransDrugSegment;
	}

	ErxTransDrugSegment erxTransDrugSegment;

	@JsonProperty("prescriberInfo")
	public PrescriberInfo getPrescriberInfo() {
		return this.prescriberInfo;
	}

	public void setPrescriberInfo(PrescriberInfo prescriberInfo) {
		this.prescriberInfo = prescriberInfo;
	}

	PrescriberInfo prescriberInfo;

	@JsonProperty("storeAddress")
	public StoreAddress getStoreAddress() {
		return this.storeAddress;
	}

	public void setStoreAddress(StoreAddress storeAddress) {
		this.storeAddress = storeAddress;
	}

	StoreAddress storeAddress;

	@JsonProperty("erxTransTypeId")
	public String getErxTransTypeId() {
		return this.erxTransTypeId;
	}

	public void setErxTransTypeId(String erxTransTypeId) {
		this.erxTransTypeId = erxTransTypeId;
	}

	String erxTransTypeId;

	@JsonProperty("origTraceNb")
	public String getOrigTraceNb() {
		return this.origTraceNb;
	}

	public void setOrigTraceNb(String origTraceNb) {
		this.origTraceNb = origTraceNb;
	}

	String origTraceNb;

	@JsonProperty("pttCity")
	public String getPttCity() {
		return this.pttCity;
	}

	public void setPttCity(String pttCity) {
		this.pttCity = pttCity;
	}

	String pttCity;

	@JsonProperty("pttCommNbCdId1")
	public BigDecimal getPttCommNbCdId1() {
		return this.pttCommNbCdId1;
	}

	public void setPttCommNbCdId1(BigDecimal pttCommNbCdId1) {
		this.pttCommNbCdId1 = pttCommNbCdId1;
	}

	BigDecimal pttCommNbCdId1;

	@JsonProperty("pttCommNbCdId2")
	public BigDecimal getPttCommNbCdId2() {
		return this.pttCommNbCdId2;
	}

	public void setPttCommNbCdId2(BigDecimal pttCommNbCdId2) {
		this.pttCommNbCdId2 = pttCommNbCdId2;
	}

	BigDecimal pttCommNbCdId2;

	@JsonProperty("pttFirstName")
	public String getPttFirstName() {
		return this.pttFirstName;
	}

	public void setPttFirstName(String pttFirstName) {
		this.pttFirstName = pttFirstName;
	}

	String pttFirstName;

	@JsonProperty("pttGender")
	public String getPttGender() {
		return this.pttGender;
	}

	public void setPttGender(String pttGender) {
		this.pttGender = pttGender;
	}

	String pttGender;

	@JsonProperty("pttGestationalAge")
	public String getPttGestationalAge() {
		return this.pttGestationalAge;
	}

	public void setPttGestationalAge(String pttGestationalAge) {
		this.pttGestationalAge = pttGestationalAge;
	}

	String pttGestationalAge;

	@JsonProperty("pttId")
	public String getPttId() {
		return this.pttId;
	}

	public void setPttId(String pttId) {
		this.pttId = pttId;
	}

	String pttId;

	@JsonProperty("pttIdNb1")
	public String getPttIdNb1() {
		return this.pttIdNb1;
	}

	public void setPttIdNb1(String pttIdNb1) {
		this.pttIdNb1 = pttIdNb1;
	}

	String pttIdNb1;

	@JsonProperty("pttIdNbQual1")
	public String getPttIdNbQual1() {
		return this.pttIdNbQual1;
	}

	public void setPttIdNbQual1(String pttIdNbQual1) {
		this.pttIdNbQual1 = pttIdNbQual1;
	}

	String pttIdNbQual1;

	@JsonProperty("pttLastName")
	public String getPttLastName() {
		return this.pttLastName;
	}

	public void setPttLastName(String pttLastName) {
		this.pttLastName = pttLastName;
	}

	String pttLastName;

	@JsonProperty("pttState")
	public String getPttState() {
		return this.pttState;
	}

	public void setPttState(String pttState) {
		this.pttState = pttState;
	}

	String pttState;

	@JsonProperty("pttStreet")
	public String getPttStreet() {
		return this.pttStreet;
	}

	public void setPttStreet(String pttStreet) {
		this.pttStreet = pttStreet;
	}

	String pttStreet;

	@JsonProperty("pttZip")
	public String getPttZip() {
		return this.pttZip;
	}

	public void setPttZip(String pttZip) {
		this.pttZip = pttZip;
	}

	String pttZip;

	@JsonProperty("routingId")
	public String getRoutingId() {
		return this.routingId;
	}

	public void setRoutingId(String routingId) {
		this.routingId = routingId;
	}

	String routingId;

	@JsonProperty("statusId")
	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	String statusId;

	@JsonProperty("storeNumber")
	public BigDecimal getStoreNumber() {
		return this.storeNumber;
	}

	public void setStoreNumber(BigDecimal storeNumber) {
		this.storeNumber = storeNumber;
	}

	BigDecimal storeNumber;

	@JsonProperty("uibId")
	public String getUibId() {
		return this.uibId;
	}

	public void setUibId(String uibId) {
		this.uibId = uibId;
	}

	String uibId;

	@JsonProperty("uibInitTime")
	public String getUibInitTime() {
		return this.uibInitTime;
	}

	public void setUibInitTime(String uibInitTime) {
		this.uibInitTime = uibInitTime;
	}

	String uibInitTime;

	@JsonProperty("uibReceiverIdLevel1")
	public String getUibReceiverIdLevel1() {
		return this.uibReceiverIdLevel1;
	}

	public void setUibReceiverIdLevel1(String uibReceiverIdLevel1) {
		this.uibReceiverIdLevel1 = uibReceiverIdLevel1;
	}

	String uibReceiverIdLevel1;

	@JsonProperty("uibReceiverIdLevel3")
	public String getUibReceiverIdLevel3() {
		return this.uibReceiverIdLevel3;
	}

	public void setUibReceiverIdLevel3(String uibReceiverIdLevel3) {
		this.uibReceiverIdLevel3 = uibReceiverIdLevel3;
	}

	String uibReceiverIdLevel3;

	@JsonProperty("uibReceiverLevel1Qual")
	public String getUibReceiverLevel1Qual() {
		return this.uibReceiverLevel1Qual;
	}

	public void setUibReceiverLevel1Qual(String uibReceiverLevel1Qual) {
		this.uibReceiverLevel1Qual = uibReceiverLevel1Qual;
	}

	String uibReceiverLevel1Qual;

	@JsonProperty("uibSendIdLevel1")
	public String getUibSendIdLevel1() {
		return this.uibSendIdLevel1;
	}

	public void setUibSendIdLevel1(String uibSendIdLevel1) {
		this.uibSendIdLevel1 = uibSendIdLevel1;
	}

	String uibSendIdLevel1;

	@JsonProperty("uibSendIdLevel3")
	public String getUibSendIdLevel3() {
		return this.uibSendIdLevel3;
	}

	public void setUibSendIdLevel3(String uibSendIdLevel3) {
		this.uibSendIdLevel3 = uibSendIdLevel3;
	}

	String uibSendIdLevel3;

	@JsonProperty("uibSendLevel1Qual")
	public String getUibSendLevel1Qual() {
		return this.uibSendLevel1Qual;
	}

	public void setUibSendLevel1Qual(String uibSendLevel1Qual) {
		this.uibSendLevel1Qual = uibSendLevel1Qual;
	}

	String uibSendLevel1Qual;

	@JsonProperty("uibSyntaxId")
	public String getUibSyntaxId() {
		return this.uibSyntaxId;
	}

	public void setUibSyntaxId(String uibSyntaxId) {
		this.uibSyntaxId = uibSyntaxId;
	}

	String uibSyntaxId;

	@JsonProperty("uibSyntaxVersion")
	public String getUibSyntaxVersion() {
		return this.uibSyntaxVersion;
	}

	public void setUibSyntaxVersion(String uibSyntaxVersion) {
		this.uibSyntaxVersion = uibSyntaxVersion;
	}

	String uibSyntaxVersion;

	@JsonProperty("uibTestInd")
	public String getUibTestInd() {
		return this.uibTestInd;
	}

	public void setUibTestInd(String uibTestInd) {
		this.uibTestInd = uibTestInd;
	}

	String uibTestInd;

	@JsonProperty("uibTxnCntlRef")
	public String getUibTxnCntlRef() {
		return this.uibTxnCntlRef;
	}

	public void setUibTxnCntlRef(String uibTxnCntlRef) {
		this.uibTxnCntlRef = uibTxnCntlRef;
	}

	String uibTxnCntlRef;

	@JsonProperty("uihId")
	public String getUihId() {
		return this.uihId;
	}

	public void setUihId(String uihId) {
		this.uihId = uihId;
	}

	String uihId;

	@JsonProperty("uihInitDate")
	public String getUihInitDate() {
		return this.uihInitDate;
	}

	public void setUihInitDate(String uihInitDate) {
		this.uihInitDate = uihInitDate;
	}

	String uihInitDate;

	@JsonProperty("uihInitTime")
	public String getUihInitTime() {
		return this.uihInitTime;
	}

	public void setUihInitTime(String uihInitTime) {
		this.uihInitTime = uihInitTime;
	}

	String uihInitTime;

	@JsonProperty("pttDateOfBirth")
	public String getPttDateOfBirth() {
		return this.pttDateOfBirth;
	}

	public void setPttDateOfBirth(String pttDateOfBirth) {
		this.pttDateOfBirth = pttDateOfBirth;
	}

	String pttDateOfBirth;

	@JsonProperty("uihInitiatorCtrlRef")
	public String getUihInitiatorCtrlRef() {
		return this.uihInitiatorCtrlRef;
	}

	public void setUihInitiatorCtrlRef(String uihInitiatorCtrlRef) {
		this.uihInitiatorCtrlRef = uihInitiatorCtrlRef;
	}

	String uihInitiatorCtrlRef;

	@JsonProperty("uihMsgFunctionId")
	public String getUihMsgFunctionId() {
		return this.uihMsgFunctionId;
	}

	public void setUihMsgFunctionId(String uihMsgFunctionId) {
		this.uihMsgFunctionId = uihMsgFunctionId;
	}

	String uihMsgFunctionId;

	@JsonProperty("uihMsgRefNb")
	public String getUihMsgRefNb() {
		return this.uihMsgRefNb;
	}

	public void setUihMsgRefNb(String uihMsgRefNb) {
		this.uihMsgRefNb = uihMsgRefNb;
	}

	String uihMsgRefNb;

	@JsonProperty("uihMsgReleaseNb")
	public String getUihMsgReleaseNb() {
		return this.uihMsgReleaseNb;
	}

	public void setUihMsgReleaseNb(String uihMsgReleaseNb) {
		this.uihMsgReleaseNb = uihMsgReleaseNb;
	}

	String uihMsgReleaseNb;

	@JsonProperty("uihMsgType")
	public String getUihMsgType() {
		return this.uihMsgType;
	}

	public void setUihMsgType(String uihMsgType) {
		this.uihMsgType = uihMsgType;
	}

	String uihMsgType;

	@JsonProperty("uihMsgVersionNb")
	public String getUihMsgVersionNb() {
		return this.uihMsgVersionNb;
	}

	public void setUihMsgVersionNb(String uihMsgVersionNb) {
		this.uihMsgVersionNb = uihMsgVersionNb;
	}

	String uihMsgVersionNb;

	@JsonProperty("uihTestInd")
	public String getUihTestInd() {
		return this.uihTestInd;
	}

	public void setUihTestInd(String uihTestInd) {
		this.uihTestInd = uihTestInd;
	}

	String uihTestInd;

	@JsonProperty("uitNbOfSegments")
	public int getUitNbOfSegments() {
		return this.uitNbOfSegments;
	}

	public void setUitNbOfSegments(int uitNbOfSegments) {
		this.uitNbOfSegments = uitNbOfSegments;
	}

	int uitNbOfSegments;

	@JsonProperty("uizItxCtrlCnt")
	public int getUizItxCtrlCnt() {
		return this.uizItxCtrlCnt;
	}

	public void setUizItxCtrlCnt(int uizItxCtrlCnt) {
		this.uizItxCtrlCnt = uizItxCtrlCnt;
	}

	int uizItxCtrlCnt;

	@JsonProperty("unaId")
	public String getUnaId() {
		return this.unaId;
	}

	public void setUnaId(String unaId) {
		this.unaId = unaId;
	}

	String unaId;

	@JsonProperty("workedInd")
	public String getWorkedInd() {
		return this.workedInd;
	}

	public void setWorkedInd(String workedInd) {
		this.workedInd = workedInd;
	}

	String workedInd;

	@JsonProperty("componentSeparator")
	public String getComponentSeparator() {
		return componentSeparator;
	}

	public void setComponentSeparator(String componentSeparator) {
		this.componentSeparator = componentSeparator;
	}

	String componentSeparator;

	@JsonProperty("dataElementSeparator")
	public String getDataElementSeparator() {
		return dataElementSeparator;
	}

	public void setDataElementSeparator(String dataElementSeparator) {
		this.dataElementSeparator = dataElementSeparator;
	}

	String dataElementSeparator;

	@JsonProperty("decimalNotation")
	public String getDecimalNotation() {
		return decimalNotation;

	}

	public void setDecimalNotation(String decimalNotation) {
		this.decimalNotation = decimalNotation;
	}

	String decimalNotation;

	@JsonProperty("processTime ")
	public String getProcessTime() {
		return processTime;
	}

	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}

	String processTime;

	@JsonProperty("pttCommNb")
	public String getPttCommNb() {
		return pttCommNb;
	}

	public void setPttCommNb(String pttCommNb) {
		this.pttCommNb = pttCommNb;
	}

	String pttCommNb;

	@JsonProperty("pttCommNb1")
	public String getPttCommNb1() {
		return pttCommNb1;
	}

	public void setPttCommNb1(String pttCommNb1) {
		this.pttCommNb1 = pttCommNb1;
	}

	String pttCommNb1;

	@JsonProperty("pttCommNb2")
	public String getPttCommNb2() {
		return pttCommNb2;
	}

	public void setPttCommNb2(String pttCommNb2) {
		this.pttCommNb2 = pttCommNb2;
	}

	String pttCommNb2;

	@JsonProperty("pttIdNb2")
	public String getPttIdNb2() {
		return pttIdNb2;
	}

	public void setPttIdNb2(String pttIdNb2) {
		this.pttIdNb2 = pttIdNb2;
	}

	String pttIdNb2;

	@JsonProperty("pttIdNbQual2")
	public String getPttIdNbQual2() {
		return pttIdNbQual2;
	}

	public void setPttIdNbQual2(String pttIdNbQual2) {
		this.pttIdNbQual2 = pttIdNbQual2;
	}

	String pttIdNbQual2;

	@JsonProperty("pttLocation")
	public String getPttLocation() {
		return pttLocation;
	}

	public void setPttLocation(String pttLocation) {
		this.pttLocation = pttLocation;
	}

	String pttLocation;

	@JsonProperty("pttLocationBed")
	public String getPttLocationBed() {
		return pttLocationBed;
	}

	public void setPttLocationBed(String pttLocationBed) {
		this.pttLocationBed = pttLocationBed;
	}

	String pttLocationBed;

	@JsonProperty("pttLocationQual")
	public String getPttLocationQual() {
		return pttLocationQual;
	}

	public void setPttLocationQual(String pttLocationQual) {
		this.pttLocationQual = pttLocationQual;
	}

	String pttLocationQual;

	@JsonProperty("pttLocationRoom")
	public String getPttLocationRoom() {
		return pttLocationRoom;
	}

	public void setPttLocationRoom(String pttLocationRoom) {
		this.pttLocationRoom = pttLocationRoom;
	}

	String pttLocationRoom;

	@JsonProperty("pttLocationUnit")
	public String getPttLocationUnit() {
		return pttLocationUnit;
	}

	public void setPttLocationUnit(String pttLocationUnit) {
		this.pttLocationUnit = pttLocationUnit;
	}

	String pttLocationUnit;

	@JsonProperty("releaseIndicator")
	public String getReleaseIndicator() {
		return releaseIndicator;
	}

	public void setReleaseIndicator(String releaseIndicator) {
		this.releaseIndicator = releaseIndicator;
	}

	String releaseIndicator;

	@JsonProperty("repetitionIndicator")
	public String getRepetitionIndicator() {
		return repetitionIndicator;
	}

	public void setRepetitionIndicator(String repetitionIndicator) {
		this.repetitionIndicator = repetitionIndicator;
	}

	String repetitionIndicator;

	@JsonProperty("segmentSeparator")
	public String getSegmentSeparator() {
		return segmentSeparator;
	}

	public void setSegmentSeparator(String segmentSeparator) {
		this.segmentSeparator = segmentSeparator;
	}

	String segmentSeparator;

	@JsonProperty("uibInitDate")
	public Date getUibInitDate() {
		return uibInitDate;
	}

	public void setUibInitDate(Date uibInitDate) {
		this.uibInitDate = uibInitDate;
	}

	Date uibInitDate;

	@JsonProperty("uibInitRefId")
	public String getUibInitRefId() {
		return uibInitRefId;
	}

	public void setUibInitRefId(String uibInitRefId) {
		this.uibInitRefId = uibInitRefId;
	}

	String uibInitRefId;

	@JsonProperty("uibReceiverIdLevel2")
	public String getUibReceiverIdLevel2() {
		return uibReceiverIdLevel2;
	}

	public void setUibReceiverIdLevel2(String uibReceiverIdLevel2) {
		this.uibReceiverIdLevel2 = uibReceiverIdLevel2;
	}

	String uibReceiverIdLevel2;

}
