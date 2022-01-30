package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest1 {
	

    @Test
    public void getRequest(){
        RestAssured.baseURI="http://127.0.0.1";
        RestAssured.port=8888;
        RestAssured.basePath="student";

       Response resp=  given().contentType(ContentType.JSON).body("{\n" +
               "   \n" +
               "    \"firstName\": \"Arvind\",\n" +
               "    \"lastName\": \"sharma\",\n" +
               "    \"email\": \"arvind@gmail.com\",\n" +
               "    \"programme\": \"Mechanical Engineering\",\n" +
               "    \"courses\": [\n" +
               "        \"Machine Element Design\",\n" +
               "        \"Engineering Analysis I\",\n" +
               "        \"Calculus & Linear Algebra I \",\n" +
               "        \"Design pattern\"\n" +
               "    ]\n" +
               "}").log().all().post();
       resp.prettyPrint();
       System.out.println(resp.getStatusCode());
    }
	
	

}
