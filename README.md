# swagger-ready
Including this component in your application will make your application swagger ready.

#### Add the below dependency to your project.

    <dependency>
      <groupId>io.github.snmaddula-components</groupId>
      <artifactId>swagger-ready</artifactId>
      <version>0.0.1</version>
    </dependency>

#### In your main Application class, add `@SwaggerReady` annotation
    @SwaggerReady
    @SpringBootApplication
    public class MyMicroserviceApp {
      
      public static void main(String[] args) {
        SpringApplication.run(LimitServiceApp.class, args);
      }
      
    }

With just this, Swagger was added into your application.

#### Adding swagger config in application.yml
To customize the swagger (or) provide your app-specific configuration

    swagger: 
      title: My Microservice REST API
      version: 1.0
      description: My microservice does something amazing!
      base-package: com.mydomain.controller
      contact: 
        name: snmaddula
        url: http://github.com
        email: myemail@domain.com
      

To access swagger, start your application and visit the below url: <br>
http://localhost:PORT/context-path/swagger-ui.html

In case, if you do not have any `context-path` for your application, you can access it with below url: <br>
http://localhost:PORT/swagger-ui.html
