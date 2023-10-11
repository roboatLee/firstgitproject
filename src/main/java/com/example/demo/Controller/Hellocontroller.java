package com.example.demo.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hellocontroller {
    @RequestMapping(value = "/Helloworld",method = RequestMethod.GET)

    public String hello(String nickname)
    {
        return "Hello "+nickname;
    }
}
