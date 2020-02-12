package com.hendisantika.springboothotelapp.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/02/20
 * Time: 07.13
 */
@Component
public class CommonUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (CommonUtils.applicationContext == null) {
            CommonUtils.applicationContext = applicationContext;
        }
    }

}
