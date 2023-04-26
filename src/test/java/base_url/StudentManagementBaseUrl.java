package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.AuthenticationSchoolManagement;

public class StudentManagementBaseUrl extends AuthenticationSchoolManagement {

    public static RequestSpecification spec;
    public void adminSetUp() {

        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " + generateTokenAdmin()).
                setBaseUri("http://209.38.244.227/").build();
    }

    public static void studentSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " + generateTokenStudent()).
                setBaseUri("http://209.38.244.227/").build();
    }

    public static void deanSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " + generateTokenDean()).
                setBaseUri("http://209.38.244.227/").build();
    }

    public static void studentManagementSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " +generateTokenStudent()).
                setBaseUri("http://209.38.244.227/").build();
    }

    public static void viceDeanSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " + generateTokenVicedean()).
                setBaseUri("http://209.38.244.227/").build();
    }

    public static void teacherSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " + generateTokenTeacher()).
                setBaseUri("http://209.38.244.227/").build();
    }

  /*
  --------------Token Alinmadan Yapilan Sekli-------------------
   public static void setUp(){
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).
               setBaseUri("http://209.38.244.227/").
                build();
    }*/
}



