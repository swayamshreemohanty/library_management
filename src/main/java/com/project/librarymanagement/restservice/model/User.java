package com.project.librarymanagement.restservice.model;

import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    };

    public String toMap() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("name", name);

        ObjectMapper objectMapper = new ObjectMapper();
        String json;
        try {
            json = objectMapper.writeValueAsString(myMap);
        } catch (JsonProcessingException e) {
            json=e.toString();
            e.printStackTrace();
        }
        return json;
    }
}
