package com.melion.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HttpParser {
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpParser.class);
    private static final int SP = 0x20; // 32 in ASCII, " "
    private static final int CR = 0x0D; // 13 in ASCII, \r
    private static final int LF = 0x0A; // 10 in ASCII, \n


    public HttpRequest parseHttpRequest(InputStream inputStream) throws IOException, HttpParsingExeption {

        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII);

        HttpRequest request = new HttpRequest();

        parseHttpRequestLine(streamReader, request);
        parseHttpRequestHeader(streamReader, request);
        parseHttpRequestBody(streamReader, request);

        return request;
    }

    private void parseHttpRequestBody(InputStreamReader streamReader, HttpRequest request) throws IOException {

    }

    private void parseHttpRequestHeader(InputStreamReader streamReader, HttpRequest request) {
    }

    private void parseHttpRequestLine(InputStreamReader streamReader, HttpRequest request) throws IOException, HttpParsingExeption {
        StringBuilder stringBuilder = new StringBuilder();

        Map<String, String> requestValues = new HashMap<>();

        boolean isMethodParsed = false;
        boolean isTargetParsed = false;

        int _byte;

        while ((_byte = streamReader.read()) >= 0){
            if(_byte == CR) {
                _byte = streamReader.read();
                if (_byte == LF) {
                    requestValues.put("VERSION", stringBuilder.toString());
                    request.setHttpVersion(requestValues.get("VERSION"));
                    LOGGER.debug("Version is {}", stringBuilder);
                    return;
                }
            }

            if (_byte == SP) {
                if(!isMethodParsed){
                    requestValues.put("METHOD", stringBuilder.toString());
                    request.setMethod(stringBuilder.toString());
                    LOGGER.debug("Method is {}", stringBuilder);
                    isMethodParsed = true;
                }else if (!isTargetParsed){
                    requestValues.put("TARGET", stringBuilder.toString());
                    request.setRequestTarget(stringBuilder.toString());
                    LOGGER.debug("Target is {}", stringBuilder);
                    isTargetParsed = true;
                }

            stringBuilder.delete(0, stringBuilder.length());
            }
            else {
                stringBuilder.append((char) _byte);
            }
        }

    }

}
