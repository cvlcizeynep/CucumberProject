package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.AuthenticationSchoolManagement;
import utilities.ConfigReader;

import static utilities.AuthenticationSchoolManagement.*;

public class StudentManagementBaseUrl  {

    public static RequestSpecification spec;
    static public void adminSetUp() {


        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", generateTokenAdmin()).
                setBaseUri(ConfigReader.getProperty("APIURL")).build();
    }

    public static void studentSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", generateTokenStudent()).
                setBaseUri(ConfigReader.getProperty("APIURL")).build();
    }

    public static void deanSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization",  generateTokenDean()).
                setBaseUri(ConfigReader.getProperty("APIURL")).build();
    }

    public static void studentManagementSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", generateTokenStudent()).
                setBaseUri(ConfigReader.getProperty("APIURL")).build();
    }

    public static void viceDeanSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization",  generateTokenVicedean()).
                setBaseUri(ConfigReader.getProperty("APIURL")).build();
    }

    public static void teacherSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization",  generateTokenTeacher()).
                setBaseUri(ConfigReader.getProperty("APIURL")).build();
    }

  /*
  --------------Token Alinmadan Yapilan Sekli-------------------
   public static void setUp(){
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).
                setBaseUri(ConfigReader.getProperty("APIURL")).build();
    }*/
}

