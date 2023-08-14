package com.nbk.news.config

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class Resttemplate {
    @Bean
    fun restTemplate(): RestTemplate = RestTemplate()
}