package com.melion.http;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class HttpRequest extends HttpMessage{

    @Getter
    private HTTPMethods method;

    @Getter
    @Setter
    private String requestTarget;

    @Getter
    @Setter
    private String httpVersion;

    public void setMethod(String methodValue) throws HttpParsingExeption {
        for(HTTPMethods methods: HTTPMethods.values())
            if(methodValue.equals(methods.name()))
                this.method = methods;
            else
                throw new HttpParsingExeption(HttpStatusCode.NOT_IMPLEMENTED);
    }
}
