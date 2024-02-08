package org.bhekumuzi.guessnumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // defines class as a rest api
public class GuessNumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuessNumberApplication.class, args);
    }

    @GetMapping ()// sets it as a get endpoint url
    public String apiRoute(){
        return "<h1>Hello World</h1>";
    }

}
