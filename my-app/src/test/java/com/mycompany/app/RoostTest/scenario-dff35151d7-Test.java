// ********RoostGPT********
/*
Test generated by RoostGPT for test credential-integration-artillery using AI Type Azure Open AI and AI Model roost-gpt4-32k

{
  background: 'Given the base URL is "http://localhost:8080"',
  rule: null,
  scenario: 'Create my account \r\n' +
    '    When the client sends a POST request "/accounts" with the accounts_body payload\r\n' +
    '    Then create an account with the specified informatio\r\n' +
    '    And verify the account created using GET request for "/me"',
  title: 'Create my account'
}

*/

// ********RoostGPT********
package com.mycompany.app.RoostTest;

import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.nio.file.*;
import java.io.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.json.JSONObject;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.Map;

public class scenario_dff35151d7_Test {

    private static final String FILE_NAME = "src/test/java/com/mycompany/app/RoostTest/scenario-dff35151d7-Test.csv";
    private static ArrayList<String[]> PAYLOAD_DATA = new ArrayList<>();

    @BeforeAll
    public static void setup() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

        String line;
        while((line = br.readLine()) != null) {
            if(line.isEmpty()) continue;
            String[] rowData = line.split("\\^\\|\\^");
            PAYLOAD_DATA.add(rowData);
        }

        br.close();
    }

    @Test
    public void AccountCreationTest() {
        for (int i = 1; i < PAYLOAD_DATA.size(); i++) {
            String[] rowData = PAYLOAD_DATA.get(i);
            String httpMethod = rowData[0];
            String url = rowData[1];
            String reqHeaders = rowData[2];
            String reqBody = rowData[3];
            int responseCode = Integer.parseInt(rowData[4]);
            String respBody = rowData[5];

            JSONObject headersJsonObj = new JSONObject(reqHeaders);
            Map<String, String> headersMap = headersJsonObj.toMap();

            RestAssured.baseURI = url;
            Response response = null;

            if(httpMethod.toLowerCase().equals("post")) {
                response = given()
                        .headers(headersMap)
                        .body(new JSONObject(reqBody).toMap())
                        .when()
                        .post()
                        .then()
                        .extract()
                        .response();
            }
            else if(httpMethod.toLowerCase().equals("get")){
                response = given()
                        .headers(headersMap)
                        .when()
                        .get()
                        .then()
                        .extract()
                        .response();
            }

            assertEquals(responseCode, response.getStatusCode());

            JsonPath jsonResp = new JsonPath(response.getBody().print());
            JSONObject respJsonObj = new JSONObject(respBody);
            for(String key: respJsonObj.keySet()){
                assertEquals(respJsonObj.get(key), jsonResp.get(key));
            }
        }
    }
}