package pojo.entity.v2;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Roots {

  public String createByProcess;
  public String createBySystemId;
  public int erxTransCommonBufferId;
  public ErxTransDrugSegment erxTransDrugSegment;
  public PrescriberInfo prescriberInfo;
  public StoreAddress storeAddress;
  public String erxTransTypeId;
  public String origTraceNb;
  public String pttCity;
  public int pttCommNbCdId1;
  public int pttCommNbCdId2;
  public String pttFirstName;
  public String pttGender;
  public String pttGestationalAge;
  public String pttId;
  public String pttIdNb1;
  public String pttIdNbQual1;
  public String pttLastName;
  public String pttState;
  public String pttStreet;
  public String pttZip;
  public String routingId;
  public String statusId;
  public int storeNumber;
  public String uibId;
  public String uibInitTime;
  public String uibReceiverIdLevel1;
  public String uibReceiverIdLevel3;
  public String uibReceiverLevel1Qual;
  public String uibSendIdLevel1;
  public String uibSendIdLevel3;
  public String uibSendLevel1Qual;
  public String uibSyntaxId;
  public String uibSyntaxVersion;
  public String uibTestInd;
  public String uibTxnCntlRef;
  public String uihId;
  public String uihInitDate;
  public String uihInitTime;
  public String pttDateOfBirth;
  public String uihInitiatorCtrlRef;
  public String uihMsgFunctionId;
  public String uihMsgRefNb;
  public String uihMsgReleaseNb;
  public String uihMsgType;
  public String uihMsgVersionNb;
  public String uihTestInd;
  public int uitNbOfSegments;
  public int uizItxCtrlCnt;
  public String unaId;
  public String workedInd;
}

