package com.melion.http;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class HttpParserTest {
    private HttpParser httpParser;

    @Before
    public void init(){
        httpParser = new HttpParser();
    }

    @Test
    public void testParseHttpRequest() throws IOException {
        HttpRequest request = null;
        try {
            request = httpParser.parseHttpRequest(generateValidGETTestCase());
        } catch (HttpParsingExeption e) {
            Assert.fail(e.getMessage());
        }

        Assert.assertEquals(request.getMethod(), HTTPMethods.GET);
        Assert.assertEquals(request.getRequestTarget(), "/");
        Assert.assertEquals(request.getHttpVersion(), "HTTP/1.1");
    }

    @Test
    public void testInvalidMessageToParseHttpRequest() throws IOException {
        try {
            httpParser.parseHttpRequest(generateInvalidGETTestCase());
            Assert.fail();
        } catch (HttpParsingExeption e) {
            Assert.assertEquals(e.getStatusCode(), HttpStatusCode.NOT_IMPLEMENTED);
        }
    }


    //TODO Put into fixtures and create utils for File to Sting
    public InputStream generateValidGETTestCase(){
        try {
            FileReader reader = new FileReader("/Users/dardangjoka/Desktop/DesignPatternV2/Request.txt");
            StringBuffer buffer = new StringBuffer();

            int i = 0;
            while ((i = reader.read()) != -1){
                buffer.append((char) i);
            }

            String resultString = buffer.toString().replace("\n", "\r\n");

            return new ByteArrayInputStream(resultString.getBytes(StandardCharsets.US_ASCII));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public InputStream generateInvalidGETTestCase(){
        try {
            FileReader reader = new FileReader("/Users/dardangjoka/Desktop/DesignPatternV2/Request.txt");
            StringBuffer buffer = new StringBuffer();

            int i = 0;
            while ((i = reader.read()) != -1){
                buffer.append((char) i);
            }

            String resultString = buffer.toString().replace("\n", "\r\n").toLowerCase();

            return new ByteArrayInputStream(resultString.getBytes(StandardCharsets.US_ASCII));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}