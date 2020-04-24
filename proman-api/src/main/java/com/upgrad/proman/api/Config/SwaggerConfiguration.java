package com.upgrad.proman.api.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.nio.file.Path;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket swagger(){

        return  new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.upgrad.api.Controller"))
                .paths(PathSelectors.any()).build();
    }


}
