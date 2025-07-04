package io.github.mihaimese;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MyGitHubApp {

    public static void main(String[] args) {
        SpringApplication.run(MyGitHubApp.class, args);
    }
}
