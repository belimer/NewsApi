import com.nbk.news.dto.ArticleResponse
import io.cucumber.java.PendingException
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.Assert
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate

class GetCountryStepDefs

lateinit var response:ArticleResponse;
private val restTemplate: RestTemplate = RestTemplate()

@When("When I send a valid GET request to {string}")
fun when_i_send_a_valid_get_request_to(string: String?) {
        response = restTemplate.exchange(
        string,
        HttpMethod.GET,
        null,
        ArticleResponse::class.java
    ).body as ArticleResponse
}

@Then("I should receive a success response with data")
fun i_should_receive_a_success_response_with_data() {
    // Write code here that turns the phrase above into concrete actions
        Assert.assertNotEquals(response.totalResults, 0)
}

@When("When I send a an invalidGET request to {string}")
fun when_i_send_a_an_invalid_get_request_to(string: String?) {
    response = restTemplate.exchange(
        string,
        HttpMethod.GET,
        null,
        ArticleResponse::class.java
    ).body as ArticleResponse
}

@Then("I should receive a success response without data")
fun i_should_receive_a_success_response_without_data() {
    // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(response.totalResults, 0)
}

