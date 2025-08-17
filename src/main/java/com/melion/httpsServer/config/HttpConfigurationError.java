package com.melion.httpsServer.config;

import java.io.IOException;

public class HttpConfigurationError extends RuntimeException {
    public HttpConfigurationError(String message) {
        super(message);
    }

    public HttpConfigurationError(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpConfigurationError(Throwable cause) {
        super(cause);
    }

    public HttpConfigurationError(RuntimeException e) {
    }
}
