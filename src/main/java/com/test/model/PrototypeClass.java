package com.test.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class PrototypeClass {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void post() {
        log.error("Создется бин PrototypeClass...");
    }

    @PreDestroy
    public void destroy(){
        log.error("Уничтожается бин PrototypeClass...");
    }
}
