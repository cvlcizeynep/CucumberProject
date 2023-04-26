package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationSchoolManagement {
    static   String url="https://school-management-v1.herokuapp.com/auth/login";
    //--------------------------ADMİN----------------------------
    public static String generateTokenAdmin(){
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password","12345678");
        bodyMap.put("rememberMe",true);
        bodyMap.put("username","Team20_N");
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return  response.jsonPath().getString("token");
    }
    //-------------------------STUDENT------------------------------
    public static String generateTokenStudent(){
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password","Lev12345");
        bodyMap.put("rememberMe",true);
        bodyMap.put("username","Lev Nikolayeviç");
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return  response.jsonPath().getString("token");
    }
    //--------------------------DEAN--------------------------------
    public static String generateTokenDean(){
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password","qwer5678");
        bodyMap.put("rememberMe",true);
        bodyMap.put("username","ZeynepBetul");
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return  response.jsonPath().getString("token");
    }
    //-----------------------VICE DEAN----------------------
    public static String generateTokenVicedean() {
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password", "12345678");
        bodyMap.put("rememberMe", true);
        bodyMap.put("username", "dekan555");
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return response.jsonPath().getString("token");
    }
    //------------TEACHER--------------------
    public static String generateTokenTeacher() {
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password", "Team20**");
        bodyMap.put("rememberMe", true);
        bodyMap.put("username", "Team20_");
        Response response = given().contentType(ContentType.JSON).body(bodyMap).post(url);
        return response.jsonPath().getString("token");
    }

    public static void main(String[] args) {
        System.out.println("generateTokenAdmin() = " + generateTokenAdmin());
        System.out.println("generateTokenTeacher() = " + generateTokenTeacher());
        System.out.println("generateTokenDean() = " + generateTokenDean());
        System.out.println("generateTokenStudent() = " + generateTokenStudent());
    }
}
