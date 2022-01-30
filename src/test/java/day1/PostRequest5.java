package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest5 {
	

    @Test
    public void getRequest(){

        for(int i=1; i<=10;i++){
        RestAssured.baseURI="http://127.0.0.1";
        RestAssured.port=8888;
        RestAssured.basePath="student";
        JSONObject student = new JSONObject();
        student.put("firstName",DataGen.getFirstName());
        student.put("lastName",DataGen.getLastName());
        student.put("email",DataGen.getEmail());
        student.put("programme",DataGen.getCourse());

        JSONArray  course = new JSONArray();
        course.put("Java");
        course.put("Python");
        course.put("Java Script");

        student.put("courses",course);

       Response resp=  given().contentType(ContentType.JSON).body(student.toString()).log().all().post();
       resp.prettyPrint();
       System.out.println(resp.getStatusCode());
    }}
	
	

}
