// ********RoostGPT********
/*
Test generated by RoostGPT for test credential-integration-artillery using AI Type Azure Open AI and AI Model roost-gpt4-32k

{
  background: 'Given the base URL is "http://localhost:8080"',
  rule: null,
  scenario: 'Delete authorization\r\n' +
    '    Given authorization ID\r\n' +
    '    When the client sends a DELETE request to "/authorizations/ID"\r\n' +
    '    Then the response status code should be 200 for a successful delete\r\n' +
    '    And the authorizations should not appear in GET request for "/authorizations"',
  title: 'Delete authorization'
}

*/

// ********RoostGPT********
package com.mycompany.app.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.is;
import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class scenario87771cdd6dTest {

    String baseURI = System.getenv("API_HOST");
    BufferedReader br;
    ArrayList<HashMap<String, String>> apiData = new ArrayList<>();

    @BeforeClass
    public void readData() throws IOException {
        br = new BufferedReader(new FileReader("./src/test/java/com/mycompany/app/RoostTest/scenario-87771cdd6d-Test.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split("\\^\\|\\^");

            HashMap<String, String> data = new HashMap<>();
            data.put("Method", values[0].replaceAll("\"", ""));
            data.put("URL", values[1].replaceAll("\"", ""));
            data.put("REQ_HEADERS", values[2].replaceAll("\"", ""));
            data.put("REQ_BODY", values[3].replaceAll("\"", ""));
            data.put("RESPONSE_CODE", values[4].replaceAll("\"", ""));
            data.put("RESPONSE_BODY", values[5].replaceAll("\"", ""));

            apiData.add(data);
        }
        br.close();
    }

    @Test
    public void deleteAuthorization() {
        RestAssured.baseURI = baseURI;

        for (HashMap<String, String> data : apiData) {
            String method = data.get("Method");
            String url = data.get("URL");
            JSONObject headers = new JSONObject(data.get("REQ_HEADERS"));
            JSONObject body = new JSONObject(data.get("REQ_BODY"));
            int expectedResponseCode = Integer.parseInt(data.get("RESPONSE_CODE"));
            JSONObject expectedResponseBody = new JSONObject(data.get("RESPONSE_BODY"));

            Response response = null;

            if (method.equals("DELETE")) {
                response = given().header("Token", headers.getString("Token")).when().delete(url);
            } else if (method.equals("GET")) {
                response = given().header("Token", headers.getString("Token")).when().get(url);
            }

            if (response != null) {
                Assert.assertEquals(response.getStatusCode(), expectedResponseCode);

                if (expectedResponseCode == 200) {
                    Assert.assertEquals(new JSONObject(response.getBody().asString()).toString(), expectedResponseBody.toString());
                }
            }
        }
    }
}
