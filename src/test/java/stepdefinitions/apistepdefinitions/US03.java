package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.MessageObjectPojo;
import pojos.MessagePojo;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;



public class US03 {

    Response response;
    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    String name = faker.name().firstName();
    MessageObjectPojo object;
    MessagePojo expectedData;

    @Given("kullanici Contact kismindan mesaj gonderir")
    public void kullaniciContactKismindanMesajGonderir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo(email,"kaliteli egitim",name,"Java");
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();

    }


    @Then("mesaj basarili sekilde gonderilir")
    public void mesajBasariliSekildeGonderilir() {

        response.then().statusCode(200).
                body("object.name",equalTo(expectedData.getObject().getName()),
                        "object.message",equalTo(expectedData.getObject().getMessage()),
                        "object.email",equalTo(expectedData.getObject().getEmail()),
                        "object.subject",equalTo(expectedData.getObject().getSubject()),
                        "message",equalTo(expectedData.getMessage()),
                        "httpStatus",equalTo(expectedData.getHttpStatus()));

    }




    @Given("kullanici name alanini bos birakarak mesaj gonderir")
    public void kullaniciNameAlaniniBosBirakarakMesajGonderir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo(email,"kaliteli egitim",null,"Java");
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("name alani hata mesaji aldigini dogrular")
    public void nameAlaniHataMesajiAldiginiDogrular() {
        response.then().statusCode(400).
                body("validations.name",equalTo("Please enter name"));

    }


    @Given("kullanici mail alanina invalid deger girerek mesaj gonderir")
    public void kullaniciMailAlaninaInvalidDegerGirerekMesajGonderir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo("fat","kaliteli egitim",name,"Java");
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();

    }

    @Then("email alani hata mesaji aldigini dogrular")
    public void emailAlaniHataMesajiAldiginiDogrular() {
        response.then().statusCode(400).
                body("validations.email",equalTo("Your email should be at least 5 characters"));
    }




    @Given("kullanici email alanini bos birakarak mesaj gonderir")
    public void kullaniciEmailAlaniniBosBirakarakMesajGonderir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo(null,"kaliteli egitim",name,"Java");
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();


    }

    @Then("email alani bos hata mesajini gordugunu dogrular")
    public void emailAlaniBosHataMesajiniGordugunuDogrular() {

        response.then().statusCode(400).
                body("validations.email",equalTo("Please enter your email"));
    }



    @Given("kullanici subject alanini bos birakarak mesaj gonderir")
    public void kullaniciSubjectAlaniniBosBirakarakMesajGonderir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo(email,"kaliteli egitim",name,null);
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();

    }

    @Then("subject alani hata mesaji aldigini dogrular")
    public void subjectAlaniHataMesajiAldiginiDogrular() {
        response.then().statusCode(400).
                body("validations.subject",equalTo("Please enter subject"));
    }




    @Given("kullanici subject alanina invalid deger girerek mesaj gonderir")
    public void kullaniciSubjectAlaninaInvalidDegerGirerekMesajGonderir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo(email,"kaliteli egitim",name,"2");
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("subject alani invalid deger hata mesajini goruntuler")
    public void subjectAlaniInvalidDegerHataMesajiniGoruntuler() {
        response.then().statusCode(400).
                body("validations.subject",equalTo("Your subject should be at least 4 characters"));
    }




    @Given("kullanici message alanini bos birakarak mesaj gonderir")
    public void kullaniciMessageAlaniniBosBirakarakMesajGonderir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo(email,null,name,"Resim");
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("mesaj alani hata mesajini gordugunu dogrular")
    public void mesajAlaniHataMesajiniGordugunuDogrular() {
        response.then().statusCode(400).
                body("validations.message",equalTo("Please enter message "));
    }




    @Given("kullanici message alanina invalid \\(a) deger girerek mesaj gonderir")
    public void kullaniciMessageAlaninaInvalidADegerGirerekMesajGonderir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo(email,"a",name,"Resim");
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("subject alani invalid deger hata mesajini goruntuledigini dogrular")
    public void subjectAlaniInvalidDegerHataMesajiniGoruntulediginiDogrular() {
        response.then().statusCode(400).
                body("validations.message",equalTo("Your subject should be at least 16 characters"));
    }


    @Given("kullanici gun icinde ayni maille mesaj gondermeye calisir")
    public void kullaniciGunIcindeAyniMailleMesajGondermeyeCalisir() {
        adminSetUp();

        //Set the url--> school-management-v1.herokuapp.com/contactMessages/save
        spec.pathParams("first","contactMessages","second","save");

        //Set the expected data
        object = new MessageObjectPojo(email,"kaliteli egitim",name,"Java");
        expectedData = new MessagePojo(object,"Contact Message Created Successfully","CREATED");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).body(object).post("/{first}/{second}");
        response.prettyPrint();

    }

    @Then("ayni maille ikinci mesaj gondermez mesajini goruntuledigini dogrular")
    public void ayniMailleIkinciMesajGondermezMesajiniGoruntulediginiDogrular() {
        response.then().statusCode(409).
                body("message",equalTo("Error: You already sent a message with this e-mail address today"));
    }
}
