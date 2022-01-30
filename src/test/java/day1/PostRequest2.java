package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostRequest2 {
	

    @Test
    public void getRequest(){
        RestAssured.baseURI="http://127.0.0.1";
        RestAssured.port=8888;
        RestAssured.basePath="student";


        HashMap<String, Object> student = new HashMap<>();
        student.put("firstName","Rakshita");
        student.put("lastName","Gowda");
        student.put("email","rg@gmail.com");
        student.put("programme","Computer Science");

        ArrayList<String> course = new ArrayList<>();
        course.add("Java");
        course.add("Python");
        course.add("Java Script");

        student.put("courses",course);

       Response resp=  given().contentType(ContentType.JSON).body(student).log().all().post();
       resp.prettyPrint();
       System.out.println(resp.getStatusCode());
    }
	
	

}
