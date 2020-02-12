package com.hendisantika.springboothotelapp.controller;

import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/02/20
 * Time: 06.19
 */
public class BaseController implements ServletContextAware {
    // key for nationality suggestion
    protected final String kNationality = "nationality";
    // key for destination suggestion
    protected final String kDestination = "destination";
    // servlet context to store global data
    ServletContext context;

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }
}