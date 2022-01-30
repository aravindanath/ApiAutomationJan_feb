package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class PostRequest3 {
	

    @Test
    public void getRequest(){
        RestAssured.baseURI="http://127.0.0.1";
        RestAssured.port=8888;
        RestAssured.basePath="student";

        String filepath = System.getProperty("user.dir")+ File.separator+"Data"+File.separator+"student.json";

        File file = new File(filepath);

       Response resp=  given().contentType(ContentType.JSON).body(file).log().all().post();
       resp.prettyPrint();
       System.out.println(resp.getStatusCode());
    }
	
	

}
