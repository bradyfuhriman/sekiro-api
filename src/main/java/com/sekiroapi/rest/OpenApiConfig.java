package com.sekiroapi.rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
    info = @Info(
        description = "Sekiro API is a free API that provides information about the video game Sekiro: Shadows Die Twice. You can view the source code on our official [GitHub page](https://github.com/bradyfuhriman/sekiro-api).",
        title = "Sekiro API",
        version = "1.0.0",
        license = @License(
            name = "MIT License",
            url = "https://github.com/bradyfuhriman/sekiro-api/blob/main/LICENSE"
        )
    )
)
public class OpenApiConfig {
    
}
