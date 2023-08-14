package com.nbk.news.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean

class SwaggerConfig {
    @Bean
    fun transAPIDocumentation(): OpenAPI? {
        return OpenAPI().info(
                Info()
                    .description("News API Documentation")
                    .contact(
                        Contact()
                            .email("chessbelimer@gmail.com")
                            .name("Mercy Chepkoech")
                    )
                    .version("1.0")
                    .title("News Api")
            )
    }

}