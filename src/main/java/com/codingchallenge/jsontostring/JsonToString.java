
package com.codingchallenge.jsontostring;
import org.apache.tinkerpop.shaded.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class JsonToString {

        public static void main(String[] args) throws JSONException, IOException {
            StudentDto studentDto = new StudentDto();

            String string = "{\n" +
                    "    \"GoodTransactionReference\": [\n" +
                    "        \"RTC000922605247\"\n" +
                    "    ],\n" +
                    "    \"BadTransactionReference\": [],\n" +
                    "    \"ResponseCode\": 200,\n" +
                    "    \"ResponseDescription\": \"Successful.\"\n" +
                    "}";

            System.out.println(string);

            JSONObject json = new JSONObject(string);

            System.out.println(json.toString());
            System.out.println(json);

            String good = json.getString("GoodTransactionReference");
            String bad = json.getString("BadTransactionReference");
            String responseCode = json.getString("ResponseCode");
            String responseMessage = json.getString("ResponseDescription");

            if (Objects.equals("Successful.", responseMessage)) {
                System.out.println("yes");
            }

            System.out.println(good);
            System.out.println(bad);
            System.out.println(responseCode);
            System.out.println(responseMessage);

            String j = json.toString();
            System.out.println(j);

            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> respData = mapper.readValue(j, Map.class);
            if (Objects.equals("Successful.", respData.get("ResponseDescription"))) {
                System.out.println("yes2");
            }
            if (Objects.equals(200, respData.get("ResponseCode"))) {
                System.out.println("yes2");
            }
        }


    }

