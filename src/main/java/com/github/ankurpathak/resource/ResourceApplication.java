package com.github.ankurpathak.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class ResourceApplication {


    @RequestMapping("/")
    //@CrossOrigin(origins="*", maxAge=3600, allowedHeaders={"X-Auth-Token", "X-Requested-With", "X-Xsrf-Token"})
    public Message home() {
        return new Message("Hello World");
    }


    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }
}


class Message {
    private String id = UUID.randomUUID().toString();
    private String content;
    public Message(String content) {
        this.content = content;
    }
    // ... getters and setters and default constructor


    public Message() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

