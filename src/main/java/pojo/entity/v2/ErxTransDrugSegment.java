package pojo.entity.v2;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErxTransDrugSegment{
  public String createBy;
  public Date createDate;
  public String createByProcess;
  public int createBySystemId;
  public String druDawCode;
  public String druDescId;
  public String druDosageText;
  public String druDrugAgency;
  public String druDrugLongName1;
  public String druDrugName;
  public String druDrugNbNdc;
  public String druDrugNumPkg;
  public String druDrugPotencyUnitCd1;
  public String druDrugQty1;
  public String druDrugQtyCd1;
  public String druDrugQtySrcCd1;
  public String druFreeText1;
  public String druId;
  public String druRefillQty;
  public String druTimezoneQty;
  public int erxTransCommonBufferId;
  public int erxTransDrugId;
  public int rank;
}
