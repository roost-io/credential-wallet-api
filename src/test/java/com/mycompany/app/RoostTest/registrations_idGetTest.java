// Test generated by RoostGPT for test credential-wallet-rest-assured using AI Type Azure Open AI and AI Model roost-gpt4-32k


// Test generated for /registrations/{id}_get for http method type GET in rest-assured framework


// RoostTestHash=299c116110


package com.mycompany.app.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class registrations_idGetTest {
  
    @Test  
    public void registrations_id_get_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/mycompany/app/RoostTest/registrations_idGetTest.csv"))) {  
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
                .get("/registrations/{id}")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
  
            if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("reference") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("reference"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("reference").length(), lessThanOrEqualTo(100));
  
          }
  
            if (response.jsonPath().get("startDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("startDate"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("endDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("endDate"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("status") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("status"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("credentialUrl") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("credentialUrl"), matchesPattern("^\w+:(\/?\/?)[^\s]+$")); 

                MatcherAssert.assertThat(response.jsonPath().get("credentialUrl"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("suspendedUntil") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("suspendedUntil"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("issuedAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("issuedAt"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("createdAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("createdAt"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("updatedAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("updatedAt"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("recipient") != null) {  
            if (response.jsonPath().get("recipient.id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("recipient.id"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("recipient.name") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("recipient.name"), matchesPattern("^[\p{L} .'-]{1,100}$")); 

                MatcherAssert.assertThat(response.jsonPath().get("recipient.name"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("recipient.type") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("recipient.type"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("recipient.type"), anyOf(equalTo("branch"), equalTo("person"), equalTo("employee")));
  
          }
  
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
