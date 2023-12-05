// Test generated by RoostGPT for test credential-wallet-rest-assured using AI Type Azure Open AI and AI Model roost-gpt4-32k


// Test generated for /recipients/branches_put for http method type PUT in rest-assured framework


// RoostTestHash=63322ffb26


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

public class branchesPutTest {
  
    @Test  
    public void branches_put_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/mycompany/app/RoostTest/branchesPutTest.csv"))) {  
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
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"cocNumber\": \"" + map.get("cocNumber") + "\",\n" +
					"  \"cocBranchNumber\": \"" + map.get("cocBranchNumber") + "\",\n" +
					"  \"city\": \"" + map.get("city") + "\",\n" +
					"  \"tradeName\": \"" + map.get("tradeName") + "\",\n" +
					"  \"phone\": \"" + map.get("phone") + "\",\n" +
					"  \"email\": \"" + map.get("email") + "\n" +
 				"}")
                .when()
                .put("/recipients/branches")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation, existing branch returned");
  
            if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("email") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("email"), CoreMatchers.matchesPattern(^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$)); 

                MatcherAssert.assertThat(response.jsonPath().get("email"), instanceOf(String.class));
                MatcherAssert.assertThat(response.jsonPath().getString("email"),/^[^s@]+@[^s@]+.[^s@]+$/.test(
                  response.jsonPath().getString("email")
                )); 
  
          }
  
            if (response.jsonPath().get("phone") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("phone"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("cocNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("cocNumber"), CoreMatchers.matchesPattern(^\d{8}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("cocNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("cocBranchNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("cocBranchNumber"), CoreMatchers.matchesPattern(^\d{12}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("cocBranchNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("tradeName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("tradeName"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("tradeNames") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getList("tradeNames"), instanceOf(List.class));
  
          }
  
            if (response.jsonPath().get("eoriNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("eoriNumber"), CoreMatchers.matchesPattern(^NL\d{9}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("eoriNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("deregistrationDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("deregistrationDate"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("createdAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("createdAt"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("updatedAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("updatedAt"), instanceOf(String.class));  
          }
				}
if (response.statusCode() == 201) {
					System.out.println("Description: successful operation, branch created");
  
            if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("email") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("email"), CoreMatchers.matchesPattern(^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$)); 

                MatcherAssert.assertThat(response.jsonPath().get("email"), instanceOf(String.class));
                MatcherAssert.assertThat(response.jsonPath().getString("email"),/^[^s@]+@[^s@]+.[^s@]+$/.test(
                  response.jsonPath().getString("email")
                )); 
  
          }
  
            if (response.jsonPath().get("phone") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("phone"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("cocNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("cocNumber"), CoreMatchers.matchesPattern(^\d{8}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("cocNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("cocBranchNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("cocBranchNumber"), CoreMatchers.matchesPattern(^\d{12}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("cocBranchNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("tradeName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("tradeName"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("tradeNames") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getList("tradeNames"), instanceOf(List.class));
  
          }
  
            if (response.jsonPath().get("eoriNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("eoriNumber"), CoreMatchers.matchesPattern(^NL\d{9}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("eoriNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("deregistrationDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("deregistrationDate"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("createdAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("createdAt"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("updatedAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("updatedAt"), instanceOf(String.class));  
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
