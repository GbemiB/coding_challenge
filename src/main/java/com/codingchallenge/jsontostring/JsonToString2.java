package com.codingchallenge.jsontostring;

import org.apache.tinkerpop.shaded.jackson.core.JsonProcessingException;
import org.apache.tinkerpop.shaded.jackson.databind.ObjectMapper;
import org.json.JSONException;

import java.io.DataInput;
import java.io.IOException;
import java.util.Objects;


public class JsonToString2 {
    public static void main(String[] args) throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();

            String carJson =
                    "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
            try {
                Car car = objectMapper.readValue(carJson, Car.class);

                System.out.println(car.getBrand());
                System.out.println(car.getDoors());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

