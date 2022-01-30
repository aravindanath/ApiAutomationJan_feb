package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostRequest4 {
	

    @Test
    public void getRequest(){
        RestAssured.baseURI="http://127.0.0.1";
        RestAssured.port=8888;
        RestAssured.basePath="student";


        JSONObject student = new JSONObject();
        student.put("firstName","Rakshita");
        student.put("lastName","Gowda");
        student.put("email","rg@gmail.com");
        student.put("programme","Computer Science");

        JSONArray  course = new JSONArray();
        course.put("Java");
        course.put("Python");
        course.put("Java Script");

        student.put("courses",course);

       Response resp=  given().contentType(ContentType.JSON).body(student.toString()).log().all().post();
       resp.prettyPrint();
       System.out.println(resp.getStatusCode());
    }
	
	

}
