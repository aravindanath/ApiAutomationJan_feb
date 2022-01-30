package day1;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthUI;

import static io.restassured.RestAssured.given;

public class GetRequest {
	

    @Test
    public void getRequest(){
        RestAssured.baseURI="http://127.0.0.1";
        RestAssured.port=8888;
        RestAssured.basePath="student/list";

       Response resp=  given().log().all().get();
       resp.prettyPrint();
       System.out.println(resp.getStatusCode());
    }
	
	

}
