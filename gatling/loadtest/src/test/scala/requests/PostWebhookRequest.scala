package requests

import config.Configuration.baseUrl
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder



class PostWebhookRequest {

  var get_postcodes: HttpRequestBuilder = http("get postcodes")
    .post(baseUrl + "/postcodes")
    .body(RawFileBody("./src/test/resources/GetPostcodes.json"))
    .check(status is 200)
}
