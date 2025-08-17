package com.melion.httpsServer;

import com.melion.httpsServer.config.Configuration;
import com.melion.httpsServer.config.ConfigurationManager;
import com.melion.httpsServer.core.ServerListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class HttpDriver {
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpDriver.class);

    public static void main(String[] args)  {
        ConfigurationManager.getInstance().loadConfigFile("/Users/dardangjoka/Desktop/DesignPatternV2/designPatterns/src/main/resources/serverConfig.json");

        Configuration configuration = ConfigurationManager.getCurrentConfiguration();
        System.out.println(configuration.toString());

        ServerListener listener = null;
        try {
            listener = new ServerListener(configuration.getPort(), configuration.getWebRoot());
            LOGGER.info("Server Listening on port " + configuration.getPort());

        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            throw new RuntimeException(e);
        }
        listener.start();


    }
}
