package com.test.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class GlobalSessionClass {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void post() {
        log.error("Создется бин GlobalSessionClass...");
    }

    @PreDestroy
    public void destroy(){
        log.error("Уничтожается бин GlobalSessionClass...");
    }
}
