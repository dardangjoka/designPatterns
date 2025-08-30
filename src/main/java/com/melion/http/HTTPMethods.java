package com.melion.http;

public enum HTTPMethods {
    GET("GET"), HEAD("HEAD"), POST("POST"), PUT("PUT"), DELETE("DELETE");

    public final String methodName;
    HTTPMethods(String methodName) {
        this.methodName = methodName;
    }
}
