package com.hendisantika.springboothotelapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/02/20
 * Time: 06.06
 */
@Component
public class WebserviceManager {

    private RestTemplate restTemplate;

    @Autowired
    private WebserviceProperties svcProperty;

    public WebserviceManager() {
        restTemplate = new RestTemplate();
    }

    /**
     * fetch supplier markup
     *
     * @return
     */
    public Map<String, Double> getSupplierMarkup() {
        Object markup = restTemplate.getForObject(svcProperty.getRootUrl() + "/customer/supplier-markup/0", Map.class);

        return (Map<String, Double>) markup;
    }
}
