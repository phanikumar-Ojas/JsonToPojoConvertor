package pojo.entity.v2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PrescriberInfo{
  public String city;
  public String clinicOrgName;
  public String createByProcess;
  public int createBySystemId;
  public String prescriberCd;
  public String createBy;
  public String prescriberCommNb1;
  public int prescriberCommNbCd1Id;
  public String prescriberId;
  public String prescriberRefNb1;
  public String prescriberRefQual1;
  public String street;
  public String zip;
}
