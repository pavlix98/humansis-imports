package com.krauspavel.himport;

import com.krauspavel.himport.application.Consumer;
import com.krauspavel.himport.application.Web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class Entrypoint
{
    public static void main(String[] args) {

        if (args.length > 0 && args[0].equals("--consumer")) {
            SpringApplicationBuilder app = new SpringApplicationBuilder(Consumer.class);
            app.web(WebApplicationType.NONE);

            app.run(args);
        } else {
            SpringApplication.run(Web.class, args);
        }
    }
}
