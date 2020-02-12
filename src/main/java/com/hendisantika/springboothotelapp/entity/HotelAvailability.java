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
 * Date: 13/02/20
 * Time: 06.02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelAvailability {
    private Hotel hotel;
    private double lowestRate;
    private Availability[] availabilities;
    private Availability[] supplierAvailabilities;
}
