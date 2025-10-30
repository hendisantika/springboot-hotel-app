package com.hendisantika.springboothotelapp.config;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/10/25
 * Time: 08.24
 */
@Configuration
public class VelocityConfig {

    @Bean
    public VelocityEngine velocityEngine() {
        Properties properties = new Properties();
        properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "class");
        properties.setProperty("class.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        properties.setProperty(RuntimeConstants.INPUT_ENCODING, "UTF-8");
        properties.setProperty(RuntimeConstants.OUTPUT_ENCODING, "UTF-8");

        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init(properties);
        return velocityEngine;
    }

    @Bean
    public ViewResolver velocityViewResolver() {
        VelocityLayoutViewResolver resolver = new VelocityLayoutViewResolver(velocityEngine());
        resolver.setCache(false);
        resolver.setPrefix("velocity/");
        resolver.setSuffix(".vm");
        resolver.setContentType("text/html;charset=UTF-8");
        return resolver;
    }
}
