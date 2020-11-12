package com.test.configuration;

import com.test.model.GlobalSessionClass;
import com.test.model.PrototypeClass;
import com.test.model.RequestClass;
import com.test.model.SessionClass;
import com.test.model.SingletonClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class AppConfig {

    @Bean(name="singletonClass")
    public SingletonClass getHelloWorld() {
        SingletonClass singletonClass = new SingletonClass();
        singletonClass.setMessage("I am singleton!");
        return singletonClass;
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(name="prototypeClass")
    public PrototypeClass getPrototype() {
        PrototypeClass prototypeClass = new PrototypeClass();
        prototypeClass.setMessage("I am prototype!");
        return prototypeClass;
    }
    @RequestScope
    @Bean(name="requestClass")
    public RequestClass getRequest() {
        RequestClass requestClass = new RequestClass();
        requestClass.setMessage("I am request!");
        return requestClass;
    }
    @SessionScope
    @Bean(name="sessionClass")
    public SessionClass getSession() {
        SessionClass sessionClass = new SessionClass();
        sessionClass.setMessage("I am session bean!");
        return sessionClass;
    }
    @ApplicationScope
    @Bean(name="globalSessionClass")
    public GlobalSessionClass getGlobal() {
        GlobalSessionClass globalSessionClass = new GlobalSessionClass();
        globalSessionClass.setMessage("I am global session bean!");
        return globalSessionClass;
    }

}