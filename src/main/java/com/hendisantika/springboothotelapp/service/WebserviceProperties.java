package com.hendisantika.springboothotelapp.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/02/20
 * Time: 06.06
 */
@ConfigurationProperties(prefix = "webservice")
public class WebserviceProperties {
    // root url of web service
    private String rooturl;

    public String getRootUrl() {
        return rooturl;
    }

    public void setRooturl(String rooturl) {
        this.rooturl = rooturl;
    }
}