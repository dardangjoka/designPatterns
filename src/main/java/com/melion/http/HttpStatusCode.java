package com.melion.http;

import lombok.Getter;

@Getter
public enum HttpStatusCode {
    OK(200 , "OK"),
    CREATED(201, "CREATED"),
    DELETED(204, "DELETED"),
    BAD_REQUEST(400, "BAD REQUEST"),
    NOT_ALLOWED(404, "NOT ALLOWED"),
    FILE_NOT_FOUND(404, "NOT FOUND"),
    SERVER_ERROR(500, "SERVER ERROR"),
    NOT_IMPLEMENTED(501, "NOT IMPLEMENTED");


    private final int statusCode;
    private final String message;

    HttpStatusCode(int i, String message) {
        this.statusCode = i;
        this.message = message;
    }
}
