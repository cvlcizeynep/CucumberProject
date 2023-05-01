package utilities;

import com.github.javafaker.Faker;

public class FakerUtils {

    static Faker faker = new Faker();
    public static String phoneNumberFaker(){
        String phone=faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999);
        return phone;
    }

    public static String ssnFaker(){
        String ssn=faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999);
        return ssn;
    }

    public static String nameFaker(){
        String name = faker.name().firstName();
        return name;
    }
    public static String surnameFaker(){
        String surname = faker.name().lastName();
        return surname;
    }

    public static String usernameFaker(){
        String username = (faker.name().username()+"team20").substring(0,4);
        return username;
    }

    public static String emailFaker(){
        String email = faker.name().lastName().substring(0,2)+"@"+faker.name().name().substring(0,4);
        return email;
    }

    public static String passwordFaker(){
        String password = faker.internet().password();
        return password;
    }
    public static String birthPlaceFaker(){
        String birthPlace = faker.country().capital();
        return birthPlace;
    }


}
