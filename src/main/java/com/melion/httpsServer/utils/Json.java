package com.melion.httpsServer.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

public class Json {
    /*
       Util class to make sure that all the
         * Json to object,
         * object to Json,
         * String to Json,
         * Json to String
         And everything in between
     */

    private static ObjectMapper objectMapper = defaultObjectMapper();

    private static ObjectMapper defaultObjectMapper(){
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return om;
    }

    public static JsonNode parse(String jsonString) throws JsonProcessingException {
        return objectMapper.readTree(jsonString);
    }

    public static <T> T fromJson(JsonNode jsonNode, Class<T> claszz) throws JsonProcessingException {
        return objectMapper.treeToValue(jsonNode, claszz);
    }

    public static JsonNode toJson(Object o){
        return objectMapper.valueToTree(o);
    }

    public static String stringify(JsonNode node) throws JsonProcessingException {
        return generateJsonFromObject(node, false);
    }

    public static String stringifyPretty(JsonNode node) throws JsonProcessingException {
        return generateJsonFromObject(node, true);
    }

    private static String generateJsonFromObject(Object node, boolean isPretty) throws JsonProcessingException {
        ObjectWriter writer = objectMapper.writer();

        if(isPretty)
           writer = writer.with(SerializationFeature.INDENT_OUTPUT);

        return  writer.writeValueAsString(node);
    }
}
