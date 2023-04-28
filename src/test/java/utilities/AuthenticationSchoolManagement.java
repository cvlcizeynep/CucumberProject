package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationSchoolManagement {
    static   String url= ConfigReader.getProperty("AuthenticationURL");
    //--------------------------ADMİN----------------------------
    public static String generateTokenAdmin(){
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password","485424698");
        bodyMap.put("rememberMe",true);
        bodyMap.put("username","Admin");
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return  response.jsonPath().getString("token");
    }
    //-------------------------STUDENT------------------------------
    public static String generateTokenStudent(){
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password",ConfigReader.getProperty("studentPassword"));
        bodyMap.put("rememberMe",true);
        bodyMap.put("username",ConfigReader.getProperty("studentName"));
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return  response.jsonPath().getString("token");
    }
    //--------------------------DEAN--------------------------------
    public static String generateTokenDean(){
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password",ConfigReader.getProperty("deanPassword"));
        bodyMap.put("rememberMe",true);
        bodyMap.put("username",ConfigReader.getProperty("deanUserName"));
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return  response.jsonPath().getString("token");
    }
    //-----------------------VICE DEAN----------------------
    public static String generateTokenVicedean() {
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password", ConfigReader.getProperty("viceDeanPassword"));
        bodyMap.put("rememberMe", true);
        bodyMap.put("username", ConfigReader.getProperty("viceDeanUserName"));
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return response.jsonPath().getString("token");
    }
    //------------TEACHER--------------------
    public static String generateTokenTeacher() {
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password", ConfigReader.getProperty("teacherPassword"));
        bodyMap.put("rememberMe", true);
        bodyMap.put("username", ConfigReader.getProperty("teacherUserName"));
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return response.jsonPath().getString("token");
    }

   public static void main(String[] args) {
        System.out.println("generateTokenAdmin() = " + generateTokenAdmin());
        System.out.println("generateTokenTeacher() = " + generateTokenTeacher());
        System.out.println("generateTokenDean() = " + generateTokenDean());
        System.out.println("generateTokenViceDean() = " + generateTokenDean());
        System.out.println("generateTokenStudent() = " + generateTokenStudent());
    }
}