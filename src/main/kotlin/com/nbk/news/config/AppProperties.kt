package com.nbk.news.config

import lombok.Data
import lombok.Getter
import lombok.Setter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


@Component
@Data
class AppProperties {
    @Value("\${apiKey}")
    public lateinit var apiKey: String

    @Value("\${apiUrl}")
    public lateinit var apiEndpoint: String
}