package pojo.entity.v2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoreAddress{
  public String city;
  public String createByProcess;
  public int createBySystemId;
  public String firstName;
  public String lastName;
  public String providerCd;
  public String providerCommNb1;
  public int providerCommNbCd1Id;
  public String providerId;
  public String providerRefNb1;
  public String providerRefQual1;
  public String providerSpecialtyCd;
  public String state;
  public String street;
  public String zip;
}
