// Test generated by RoostGPT for test credential-wallet-rest-assured using AI Type Azure Open AI and AI Model roost-gpt4-32k


// Test generated for /recipients/branches_get for http method type GET in rest-assured framework


// RoostTestHash=74a40da00e


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

public class branchesGetTest {
  
    @Test  
    public void branches_get_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/mycompany/app/RoostTest/branchesGetTest.csv"))) {  
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
				.pathParam("coc-number", map.get("coc-number"))
				.pathParam("coc-branch-number", map.get("coc-branch-number"))
				.pathParam("trade-name", map.get("trade-name"))
				.pathParam("size", map.get("size"))
				.pathParam("offset", map.get("offset"))
                .when()
                .get("/recipients/branches")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
  
            if (response.jsonPath().get("total") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("total"), instanceOf(Integer.class));  
          }
  
            if (response.jsonPath().get("branches") != null) {  
              for (int i = 0; i < response.jsonPath().getList("branches").size(); i++) {  
            if (response.jsonPath().get("branches[`"+ i +"`].id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].id"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].email") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("branches[`"+ i +"`].email"), CoreMatchers.matchesPattern(^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$)); 

                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].email"), instanceOf(String.class));
                MatcherAssert.assertThat(response.jsonPath().getString("branches[`"+ i +"`].email"),/^[^s@]+@[^s@]+.[^s@]+$/.test(
                  response.jsonPath().getString("branches[`"+ i +"`].email")
                )); 
  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].phone") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].phone"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].cocNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("branches[`"+ i +"`].cocNumber"), CoreMatchers.matchesPattern(^\d{8}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].cocNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].cocBranchNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("branches[`"+ i +"`].cocBranchNumber"), CoreMatchers.matchesPattern(^\d{12}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].cocBranchNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].tradeName") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].tradeName"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].tradeNames") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getList("branches[`"+ i +"`].tradeNames"), instanceOf(List.class));
  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].eoriNumber") != null) {  
                MatcherAssert.assertThat(response.jsonPath().getString("branches[`"+ i +"`].eoriNumber"), CoreMatchers.matchesPattern(^NL\d{9}$)); 

                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].eoriNumber"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].deregistrationDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].deregistrationDate"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].createdAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].createdAt"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("branches[`"+ i +"`].updatedAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("branches[`"+ i +"`].updatedAt"), instanceOf(String.class));  
          }
  
                }  
                MatcherAssert.assertThat(response.jsonPath().getList("branches"), instanceOf(List.class));
  
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
