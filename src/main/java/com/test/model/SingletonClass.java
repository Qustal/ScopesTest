package com.test.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class SingletonClass {
 
    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void post() {
        log.error("Создется бин SingletonClass...");
    }

    @PreDestroy
    public void destroy(){
        log.error("Уничтожается бин SingletonClass...");
    }
}