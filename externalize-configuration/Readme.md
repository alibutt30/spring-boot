# Externalizing Spring-Boot Configuration [![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/dwyl/esta/issues)
This is a very minimal example of how you can externalize the configuration in Spring-Boot projects.
The main idea is to have a common `application.properties (application.yml)` file that contains 
all the common properties and properties specific to different profiles can be written in profile specific
`application-dev.yml`, `application-local.yml`,`application-prod.yml` files. 

### Getting Started

In order to run it locally:

1. Clone the repository
    ```
    $ git clone <repo>
    ```

2. Simply run: (Specify a profile of your choosing)

    ```
    $ mvn clean spring-boot:run -Dspring-boot.run.profiles=local
    ```

3. To verify:

    i. Use Postman to make a `GET` Request to: `http://127.0.0.1:9091/actuator/health` (use the port of the specified profile)
    
    OR
    
    ii. Use a curl command to verify that correct port is running.
    
        ```
        $ curl -i -H "Accept: application/json" -H "Content-Type: application/json" http://127.0.0.1:9091/actuator/health
        ```
        
The specific profile `yml` files can be used to override/include different properties for different profiles.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Spring Boot Documentation on Externalized Configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config)


