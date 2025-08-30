package com.melion.httpsServer.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.melion.httpsServer.utils.Json;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConfigurationManager {
    private static ConfigurationManager manager;
    private static Configuration currentConfig;

    private ConfigurationManager(){
    }

    public static ConfigurationManager getInstance(){
        if(manager == null)
            manager = new ConfigurationManager();
        return manager;
    }

    public void loadConfigFile(String path) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);

        } catch (FileNotFoundException e) {
            throw new HttpConfigurationError(e);
        }

        StringBuilder buffer = new StringBuilder();

        int i = 0;
        try {
            while ((i = fileReader.read()) != -1)
                buffer.append((char) i);
        }
        catch (IOException e){
            throw new HttpConfigurationError("Could not file " + path, e);
        }

        JsonNode node = null;
        try {
            node = Json.parse(buffer.toString());
            currentConfig = Json.fromJson(node, Configuration.class);
        } catch (JsonProcessingException e) {
            throw new HttpConfigurationError("Could not parse Json",e);
        }
    }

    public static Configuration getCurrentConfiguration(){
        if(currentConfig == null)
            throw new HttpConfigurationError(" No current Configuration has ben set");
        return currentConfig;
    }
}
