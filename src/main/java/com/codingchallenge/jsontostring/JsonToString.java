
package com.codingchallenge.jsontostring;
import org.apache.tinkerpop.shaded.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class JsonToString {

        public static void main(String[] args) throws JSONException, IOException {

            String stringValue = "{\n" +
                    "    \"GoodTransactionReference\": [\n" +
                    "        \"RTC000922605247\"\n" +
                    "    ],\n" +
                    "    \"BadTransactionReference\": [],\n" +
                    "    \"ResponseCode\": 200,\n" +
                    "    \"ResponseDescription\": \"Successful.\"\n" +
                    "}";

            System.out.println(stringValue);

            JSONObject json = new JSONObject(stringValue);

            System.out.println(json.toString());

            System.out.println(json);

            String good = json.getString("GoodTransactionReference");
            String bad = json.getString("BadTransactionReference");
            String responseCode = json.getString("ResponseCode");
            String responseMessage = json.getString("ResponseDescription");

            if (Objects.equals("Successful.", responseMessage)) {
                System.out.println("yes");
            }



            // TO GET THE JSON DATA OUT. IT HAS TO BE STRINGIFIES: TAKING THE JSON BACK TO STRING
            String j = json.toString();
            System.out.println(j);

            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> respData = mapper.readValue(j, Map.class);
            if (Objects.equals("Successful.", respData.get("ResponseDescription"))) {
                System.out.println("SUCCESSFUL TRANSACTION");
            }
            if (Objects.equals(200, respData.get("ResponseCode"))) {
                System.out.println(" SUCCESSFUL TRANSACTION");
            }


            // OR LET'S CALL THE INITIAL STRING VALUE

            String stringValue2 = "{\n" +
                    "    \"GoodTransactionReference\": [\n" +
                    "        \"RTC000922605247\"\n" +
                    "    ],\n" +
                    "    \"BadTransactionReference\": [],\n" +
                    "    \"ResponseCode\": 200,\n" +
                    "    \"ResponseDescription\": \"Successful.\"\n" +
                    "}";

            ObjectMapper mapper2 = new ObjectMapper();
            Map<String, Object> respData2 = mapper.readValue(stringValue2, Map.class);
            if (Objects.equals("Successful.", respData.get("ResponseDescription"))) {
                System.out.println("SUCCESSFUL TRANSACTION AGAIN");
            }
            if (Objects.equals(200, respData.get("ResponseCode"))) {
                System.out.println(" SUCCESSFUL TRANSACTION AGAIN");
            }
        }


    }

