package com.hendisantika.springboothotelapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/02/20
 * Time: 07.15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Availability {
    private String supplierId;
    private String currency;

    private String checkIn;
    private String checkOut;

    private String countryId;
    private String countryCode;

    private String cityId;
    private String cityCode;

    private String hotelId;
    private String hotelCode;

    private String nationality;
    private String matched;

    private double totalRate;
    private double totalOriginalRate;

    private String request;

    private HotelRoom hotelRooms;

    private String reminder;
    private String promoOriginalRate;
    private String updateTime;

}
