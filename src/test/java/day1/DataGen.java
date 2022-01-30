package day1;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGen {



    public static String getFirstName(){
        Faker faker = new Faker(new Locale("en-IND"));
        return  faker.name().firstName();
    }


    public static String getLastName(){
        Faker faker = new Faker(new Locale("en-IND"));
        return  faker.name().lastName();
    }


    public static String getEmail(){
        Faker faker = new Faker(new Locale("en-IND"));
        return  faker.name().fullName().replace(" ","").replace(".","")+"@test.com";
    }



    public static String getCourse(){
        Faker faker = new Faker(new Locale("en-IND"));
        return  faker.educator().course();
    }


}
