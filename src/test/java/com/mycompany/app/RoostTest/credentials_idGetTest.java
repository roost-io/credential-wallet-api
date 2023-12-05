// Test generated by RoostGPT for test credential-wallet-rest-assured using AI Type Azure Open AI and AI Model roost-gpt4-32k


// Test generated for /credentials/{id}_get for http method type GET in rest-assured framework


// RoostTestHash=018c225aea


package com.mycompany.app.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;

public class credentials_idGetTest {
  
    @Test  
    public void credentials_id_get_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/mycompany/app/RoostTest/credentials_idGetTest.csv"))) {  
            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] data = line.split(",");  
  
                // Create a map of header to data  
                Map<String, String> map = new HashMap<>();  
                for (int i = 0; i < headers.length; i++) {  
                    map.put(headers[i], data[i]);  
                }  
                
  
                Response response = given()
				.pathParam("id", map.get("id"))
                .when()
                .get("/credentials/{id}")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
  
            if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("format") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("format"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("format"), anyOf(equalTo("jwt_vc_json"), equalTo("jwt_vc_json-ld"), equalTo("ldp_vc")));
  
          }
  
            if (response.jsonPath().get("credential") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("credential"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("status") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("status"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("status"), anyOf(equalTo("active"), equalTo("suspended"), equalTo("revoked"), equalTo("expired"), equalTo("pending")));
  
          }
  
            if (response.jsonPath().get("statusUpdatedAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("statusUpdatedAt"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("createdAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("createdAt"), instanceOf(String.class));  
          }
				}
if (response.statusCode() == 400) {
					System.out.println("Description: Bad Request");
				}
if (response.statusCode() == 401) {
					System.out.println("Description: Authentication Required");
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}