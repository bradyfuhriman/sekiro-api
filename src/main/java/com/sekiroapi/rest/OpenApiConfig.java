package com.sekiroapi.rest;

import java.util.ArrayList;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        description = "Sekiro API is a free API that provides information about the video game Sekiro: Shadows Die Twice. You can view the source code on [GitHub](https://github.com/bradyfuhriman/sekiro-api).",
        title = "Sekiro API",
        version = "1.0.0",
        license = @License(
            name = "MIT License",
            url = "https://github.com/bradyfuhriman/sekiro-api/blob/main/LICENSE"
        )
    ),
    servers = {
        @Server(
            url = "",
            description = "foo"
        )
    }
)
public class OpenApiConfig {
    
    @Bean
    public OpenApiCustomizer hideServers() {
        return openApi -> {
            openApi.setServers(new ArrayList<>());
        };
    }
}
