package com.melion.http;

public class HttpParsingExeption extends Exception{
    private final HttpStatusCode statusCode;

    public HttpParsingExeption(HttpStatusCode statusCode) {
        super(statusCode.getMessage());
        this.statusCode = statusCode;
    }

    public HttpStatusCode getStatusCode(){
        return statusCode;
    }
}
