package io.extr.odb;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

@OpenAPIDefinition(
  info = @Info(
    title = "Echo",
    description = "Echo microservice for testing",
    version = "0.0.1-SNAPSHOT",
    license = @License(
      name = "Apache 2.0",
      url = "https://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class EchoApplication extends Application {

}
