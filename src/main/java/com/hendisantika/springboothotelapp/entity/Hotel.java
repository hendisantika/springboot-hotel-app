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

}
