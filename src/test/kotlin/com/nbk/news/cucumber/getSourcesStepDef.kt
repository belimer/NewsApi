package com.nbk.news.cucumber
import com.nbk.news.dto.SourceResponse
import io.cucumber.java.en.When
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate


class getSourcesStepDef {
    private val restTemplate: RestTemplate = RestTemplate()
    lateinit var sourceResponse: SourceResponse
    @When("When I send a GET request to {string}")
    fun when_i_send_a_get_request_to(string: String?) {
        sourceResponse = restTemplate.exchange(
            string,
            HttpMethod.GET,
            null,
            SourceResponse::class.java
        ).body as SourceResponse
    }
}