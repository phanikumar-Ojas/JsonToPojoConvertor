package pojo.entity.v1.main;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import pojo.entity.v1.ErxIntakeEnrollment;

public class TextFormatter {

  public static void main(String[] args) throws FileNotFoundException {

    Gson gson = new Gson();
    ErxIntakeEnrollment erxIntakeEnrollment = gson.fromJson(new FileReader("./Pojo.json"),
        ErxIntakeEnrollment.class);

    System.out.println(erxIntakeEnrollment);


  }

}