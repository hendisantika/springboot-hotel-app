package com.hendisantika.springboothotelapp.entity;

import com.sun.corba.se.impl.oa.poa.Policies;
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
 * Time: 07.16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRoom {
    private long id;
    private String currency;

    private double totalRate;
    private double totalOriginalRate;

    private String thirdParty;

    private Meal meal;
    private Policies policies;

    private String messages;

    private Room[] rooms;
    private String group;

    private boolean matched;
    private String indexRoomType;

}
