package io.extr.odb;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import java.net.URI;
import java.net.URL;

import javax.ws.rs.core.UriBuilder;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.filter.log.RequestLoggingFilter;

@QuarkusTest
@Tag("UnitTest")
public class EchoResourceTests {
  @TestHTTPResource
  URI resourceUri;

  @Test
  public void whenGetOpenApiSpecThenReturnsSpecWithNonProductionSecurityScheme() throws Exception {
    URL specUrl = UriBuilder.fromUri(resourceUri).replacePath("/q/openapi").build().toURL();

    given().queryParam("format", "json").when().filter(new RequestLoggingFilter()).get(specUrl).then().statusCode(200)
        .body("components.securitySchemes.oauth2-example.description", containsString(" NON-PRODUCTION "));
  }
}
