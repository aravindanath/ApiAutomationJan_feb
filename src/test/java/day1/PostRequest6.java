package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class PostRequest6 {
	

    @Test
    public void getRequest(){


        RestAssured.baseURI="http://127.0.0.1";
        RestAssured.port=8888;
        RestAssured.basePath="student";

        ArrayList<String>course = new ArrayList<>();
        course.add("Java");
        course.add("pyhton");


        Courses courses = new Courses(course);

        Students students = new Students(DataGen.getFirstName(),DataGen.getLastName(),DataGen.getEmail(),DataGen.getCourse());

        students.setCourse(courses);


       Response resp=  given().contentType(ContentType.JSON).body(students).log().all().post();
       resp.prettyPrint();
       System.out.println(resp.getStatusCode());
    }
	
	

}
