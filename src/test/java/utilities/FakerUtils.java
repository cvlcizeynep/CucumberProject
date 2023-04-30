package utilities;

import com.github.javafaker.Faker;

public class FakerUtils {

    static Faker faker = new Faker();
    public static String phoneNumberFaker(){
        String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        String formattedPhoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10)
        );

        return formattedPhoneNumber;
    }

    public static String ssnFaker(){
        String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
        String formattedSSN = ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9);
        return formattedSSN;
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
        String username = faker.name().username();
        return username;
    }

    public static String emailFaker(){
        String email = faker.internet().emailAddress();
        return email;
    }

    public static String passwordFaker(){
        String password = faker.internet().password();
        return password;
    }



}
