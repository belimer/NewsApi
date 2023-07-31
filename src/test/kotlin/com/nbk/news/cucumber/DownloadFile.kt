package com.nbk.news.cucumber

import io.cucumber.java.PendingException
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.Assert
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate


class DownloadFile {
    private val restTemplate: RestTemplate = RestTemplate()
    lateinit var res: ByteArray;
    @When("When I send a valid download request to {string}")
    fun when_i_send_a_valid_download_request_to(string: String?) {
        res = restTemplate.exchange(
            string,
            HttpMethod.GET,
            null,
            ByteArray::class.java
        ).body as ByteArray
    }

    @Then("I should receive byteArray data")
    fun i_should_receive_byte_array_data() {
        // Write code here that turns the phrase above into concrete actions
       Assert.assertNotNull(res)
    }

    @When("When I send an invalid download request to {string} with invalid data")
    fun when_i_send_an_invalid_download_request_to_with_invalid_data(string: String?) {
        // Write code here that turns the phrase above into concrete actions
        res = restTemplate.exchange(
            string,
            HttpMethod.GET,
            null,
            ByteArray::class.java
        ).body as ByteArray

    }

    @Then("I should receive an a string value of the file url {string}")
    fun i_should_receive_an_a_string_value_of_the_file_url(string: String?) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertNotEquals(res,string);
    }




}