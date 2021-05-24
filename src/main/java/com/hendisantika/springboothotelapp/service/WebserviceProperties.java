package com.hendisantika.springboothotelapp.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/02/20
 * Time: 06.06
 */
@Configuration
@ConfigurationProperties(prefix = "webservice")
@Data
public class WebserviceProperties {
    // root url of web service
    private String rootUrl;
}
