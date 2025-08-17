package com.melion.httpsServer.config;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Configuration {
    @Getter
    @Setter
    private int port;
    @Getter
    @Setter
    private String webRoot;
}
