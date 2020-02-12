package com.hendisantika.springboothotelapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/02/20
 * Time: 07.21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRate {
    protected double rate;
    private Long id;
    private String fromCurrency;
    private String toCurrency;
    private Object rateType;
    private Date rateTime;
}
