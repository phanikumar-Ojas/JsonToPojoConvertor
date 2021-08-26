package pojo.entity.v2.main;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import pojo.entity.v1.ErxIntakeEnrollment;
import pojo.entity.v2.Roots;

public class main {

  public static void main(String[] args) throws FileNotFoundException {

    Gson gson = new Gson();
    Roots roots = gson.fromJson(new FileReader("./Pojo.json"), Roots.class);

    System.out.println(roots);


  }


}
