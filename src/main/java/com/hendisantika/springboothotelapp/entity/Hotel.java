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
 * Time: 07.22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private Long id;
    private String hotelId;
    private String hotelName;
    private String hotelCnName;
    private String bookingUrl;

    private int starRating;
    private double latitude;
    private double longitude;
    private String pictureId;

    private int score;
    private int reviews;
    private String scoreDetail;
    private String brand;

    private String location;
    private String cityId;
    private String countryId;
    private String postCode;
    private String address;

    private int rooms;
    private String facilities;
    private String roomFacilities;
    private String policies;
    private String description;

}
