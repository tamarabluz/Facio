package tamara.facio.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("TECHNICAL ASSESSMENT")
                        .description("Technical assessment for Facio")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Tamara Luz")
                                .url("https://github.com/tamarabluz")));
    }

}