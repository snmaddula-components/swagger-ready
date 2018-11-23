package snmaddula.components.swaggerready;

import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Setter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring & Swagger bean configuration to make the application swagger ready.
 * 
 * @author snmaddula
 *
 */
@Setter
@Configuration
@EnableSwagger2
@ConfigurationProperties(prefix = "swagger")
class SwaggerContext {

    private String title;
    private String version;
    private String description;
    private String basePackage;
    private String contactName;
    private String contactUrl;
    private String contactEmail;

    @Bean
    public Docket swaggerApi() {
    	return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage(Objects.toString(basePackage, "")))
                    .build()
                    .useDefaultResponseMessages(false)
                    .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
    	return new ApiInfoBuilder()
                    .title(title)
                    .version(version)
                    .description(description)
                    .contact(new Contact(contactName, contactUrl, contactEmail))
                    .build();
    }

}
