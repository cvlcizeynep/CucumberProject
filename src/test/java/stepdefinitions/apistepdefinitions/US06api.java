package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.ViceDeanInnerPojo;
import pojos.ViceDeanOutherPojo;


import java.io.IOException;

import static base_url.StudentManagementBaseUrl.deanSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.FakerUtils.*;

public class US06api {
    Response response;
    Response response1;
    Response response2;
    Response response3;
    Response response4;
    Response response5;
    Response response6;
    ViceDeanInnerPojo object;
    ViceDeanOutherPojo expectedData;
    ViceDeanOutherPojo expectedData1;
    ViceDeanOutherPojo expectedData2;
    ViceDeanOutherPojo expectedData3;
    ViceDeanOutherPojo expectedData4;
    ViceDeanOutherPojo expectedData5;


    @Given("Dean butun gerekli alanlari doldurarak Vice Dean ekler")
    public void dean_butun_gerekli_alanlari_doldurarak_vice_dean_ekler() {
        deanSetUp();
        spec.pathParams("first","vicedean","second","save");
        usernameFaker();
        passwordFaker();
        birthPlaceFaker();
        surnameFaker();
        nameFaker();
        phoneNumberFaker();
        ssnFaker();
        object=new ViceDeanInnerPojo("1988-09-09",birthPlaceFaker(),"MALE",nameFaker(),passwordFaker(),
                phoneNumberFaker(),ssnFaker(),surnameFaker(),usernameFaker());
        expectedData=new ViceDeanOutherPojo(object,"Vice dean Saved","CREATED");
        response = given(spec).body(object).when().post("/{first}/{second}");
        response.prettyPrint();
      /*  ViceDeanOutherPojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), ViceDeanOutherPojo.class);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getObject().getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getName(), actualData.getObject().getName());
        assertEquals(expectedData.getObject().getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getObject().getUsername(), actualData.getObject().getUsername());
        assertEquals(expectedData.getObject().getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getObject().getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getObject().getPassword(), actualData.getObject().getPassword());*/
    }
    @Then("Eklenen vice deanin olustugunu test eder.")
    public void eklenen_vice_deanin_olustugunu_test_eder() throws IOException {
        //1 VALIDATION
        response.then().statusCode(200).body("object.name",equalTo(expectedData.getObject().getName()),
                "object.phoneNumber",equalTo(expectedData.getObject().getPhoneNumber()),
                "object.ssn",equalTo(expectedData.getObject().getSsn()),
                "object.username",equalTo(expectedData.getObject().getUsername()));
        //2VALIDATION
        ViceDeanOutherPojo  actualDataPojo = response.as(ViceDeanOutherPojo.class);
        assertEquals(expectedData.getMessage(), actualDataPojo.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualDataPojo.getHttpStatus());
        assertEquals(expectedData.getObject().getName(),actualDataPojo.getObject().getName());
        assertEquals(expectedData.getObject().getSurname(),actualDataPojo.getObject().getSurname());
       // assertEquals(expectedData.getObject().getPassword(),actualDataPojo.getObject().getPassword());
        assertEquals(expectedData.getObject().getSsn(),actualDataPojo.getObject().getSsn());
        assertEquals(expectedData.getObject().getGender(),actualDataPojo.getObject().getGender());
        assertEquals(expectedData.getObject().getPhoneNumber(),actualDataPojo.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getBirthDay(),actualDataPojo.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getBirthPlace(),actualDataPojo.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getUsername(),actualDataPojo.getObject().getUsername());

        //3 Validation
     /*   ViceDeanOutherPojo actualDataObjectMapper = new ObjectMapper().readValue(response.asString(), ViceDeanOutherPojo.class);
        assertEquals(expectedData.getMessage(),actualDataObjectMapper .getMessage());
        assertEquals(expectedData.getHttpStatus(), actualDataObjectMapper.getHttpStatus());
        assertEquals(expectedData.getObject().getName(),actualDataObjectMapper.getObject().getName());
        assertEquals(expectedData.getObject().getSurname(),actualDataObjectMapper.getObject().getSurname());
        assertEquals(expectedData.getObject().getPassword(),actualDataObjectMapper.getObject().getPassword());
        assertEquals(expectedData.getObject().getSsn(),actualDataObjectMapper.getObject().getSsn());
        assertEquals(expectedData.getObject().getGender(),actualDataObjectMapper.getObject().getGender());
        assertEquals(expectedData.getObject().getPhoneNumber(),actualDataObjectMapper.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getBirthDay(),actualDataObjectMapper.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getBirthPlace(),actualDataObjectMapper.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getUsername(),actualDataObjectMapper.getObject().getUsername());*/



    }
    @Given("Dean name kismi bos bir body ile post request yapar")
    public void dean_name_kismi_bos_bir_body_ile_post_request_yapar() {
        deanSetUp();
        spec.pathParams("first","vicedean","second","save");
        usernameFaker();
        passwordFaker();
        birthPlaceFaker();
        surnameFaker();
        nameFaker();
        phoneNumberFaker();
        ssnFaker();
        object=new ViceDeanInnerPojo("1988-09-09",birthPlaceFaker(),"MALE","",passwordFaker(),
                phoneNumberFaker(),ssnFaker(),surnameFaker(),usernameFaker());
        response1= given(spec).body(object).when().post("/{first}/{second}");
        response1.prettyPrint();
    }
    @Then("Name kismi bos birakilinca post yapilamadigini dogrular")
    public void name_kismi_bos_birakilinca_post_yapilamadigini_dogrular() {
        response1.then().statusCode(400);
        ViceDeanOutherPojo  actualDataPojo = response1.as(ViceDeanOutherPojo.class);
        assertEquals("Validation failed for object='viceDeanRequest'. Error count: 2", actualDataPojo.getMessage());

    }
    @Given("Kullanici Dean tokeniyle surname ve birt place bos birakilarak post yapar")
    public void kullanici_dean_tokeniyle_surname_ve_birt_place_bos_birakilarak_post_yapar() {
        deanSetUp();
        spec.pathParams("first","vicedean","second","save");
        usernameFaker();
        passwordFaker();
        birthPlaceFaker();
        surnameFaker();
        nameFaker();
        phoneNumberFaker();
        ssnFaker();
        object=new ViceDeanInnerPojo("1988-09-09","","MALE",nameFaker(),passwordFaker(),
                phoneNumberFaker(),ssnFaker(),"",usernameFaker());
        response2= given(spec).body(object).when().post("/{first}/{second}");
        response2.prettyPrint();
    }
    @Then("Surname ve birth place bosken post yapilamadigini dogrular")
    public void surname_ve_birth_place_bosken_post_yapilamadigini_dogrular() {
        response2.then().statusCode(400);
        ViceDeanOutherPojo  actualDataPojo = response2.as(ViceDeanOutherPojo.class);
        assertEquals("Validation failed for object='viceDeanRequest'. Error count: 4", actualDataPojo.getMessage());
    }


    @Given("Kullanici dean tokeniyle telefon ve SSN  kismina tekrarli veri ile post yapar")
    public void kullanici_dean_tokeniyle_telefon_ve_ssn_kismina_tekrarli_veri_ile_post_yapar() {
        deanSetUp();
        spec.pathParams("first","vicedean","second","save");
        usernameFaker();
        passwordFaker();
        birthPlaceFaker();
        surnameFaker();
        nameFaker();
        phoneNumberFaker();
        ssnFaker();
        object=new ViceDeanInnerPojo("1988-09-09",birthPlaceFaker(),"MALE",nameFaker(),passwordFaker(),
                "240-640-1805","890-96-3848",surnameFaker(),usernameFaker());
        response3= given(spec).body(object).when().post("/{first}/{second}");
        response3.prettyPrint();    }
    @Then("SSN ve telefon tekrarli olunca post yapilamadigini dogrular")
    public void ssn_ve_telefon_tekrarli_olunca_post_yapilamadigini_dogrular() {
        response3.then().statusCode(409);
        ViceDeanOutherPojo  actualDataPojo = response3.as(ViceDeanOutherPojo.class);
        assertEquals("Error: User with ssn 890-96-3848 already register", actualDataPojo.getMessage());
    }
    @Given("Kullanici dean tokeniyle username  kismina tekrarli veri ile post yapar")
    public void kullanici_dean_tokeniyle_username_kismina_tekrarli_veri_ile_post_yapar() {
        deanSetUp();
        spec.pathParams("first","vicedean","second","save");
        usernameFaker();
        passwordFaker();
        birthPlaceFaker();
        surnameFaker();
        nameFaker();
        phoneNumberFaker();
        ssnFaker();
        object=new ViceDeanInnerPojo("1988-09-09",birthPlaceFaker(),"MALE",nameFaker(),passwordFaker(),
                phoneNumberFaker(),ssnFaker(),surnameFaker(),"Kiel.Gislason");
               response4 = given(spec).body(object).when().post("/{first}/{second}");
        response4.prettyPrint();    }
    @Then("Kullanici tekrarli username ile post yapilamadigini dogrular")
    public void kullanici_tekrarli_username_ile_post_yapilamadigini_dogrular() {
        response4.then().statusCode(409);
        ViceDeanOutherPojo  actualDataPojo = response4.as(ViceDeanOutherPojo.class);
        assertEquals("Error: User with username Kiel.Gislason already register", actualDataPojo.getMessage());
    }
    @Given("Kullanici dean tokeniyle bos body gondererek post yapar")
    public void kullanici_dean_tokeniyle_bos_body_gondererek_post_yapar() {
        deanSetUp();
        spec.pathParams("first","vicedean","second","save");
        object=new ViceDeanInnerPojo("","","","","","","","","");
        response5 = given(spec).body(object).when().post("/{first}/{second}");
        response5.prettyPrint();

    }
    @Then("Kullanici bos body ile post yapilmadigini dogrular")
    public void kullanici_bos_body_ile_post_yapilmadigini_dogrular() {
        response5.then().statusCode(400);
        ViceDeanOutherPojo  actualDataPojo = response5.as(ViceDeanOutherPojo.class);
        assertTrue( actualDataPojo.getMessage().contains("Cannot coerce empty String"));

    }
    @Given("Kullanici post bodysine invalid degerler girer")
    public void kullanici_post_bodysine_invalid_degerler_girer() {
        deanSetUp();
        spec.pathParams("first","vicedean","second","save");
        object=new ViceDeanInnerPojo("987654","8908765","NKJ","098","MNBVCCX","MNBVCXFG","POIUYTREWAB","  ","NMNMJJBT");
        response6 = given(spec).body(object).when().post("/{first}/{second}");
        response6.prettyPrint();



    }
    @Then("Kulanici invalid degerlerle post yapilmadigini dogrular.")
    public void kulanici_invalid_degerlerle_post_yapilmadigini_dogrular() {
        response6.then().statusCode(400);
        ViceDeanOutherPojo  actualDataPojo = response6.as(ViceDeanOutherPojo.class);
        assertTrue( actualDataPojo.getMessage().contains("InvalidFormatException"));


    }



}
