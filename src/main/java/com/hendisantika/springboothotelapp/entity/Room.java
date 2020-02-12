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
 * Time: 07.17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private int id;
    private String referenceId;
    private String roomIndex;
    private int roomCount;
    private String currency;
    private String roomCode;

    private String roomName;
    private String roomType;
    private String roomTypeCode;
    private String roomRateId;
    private String roomRateCode;
    private String roomRateKey;

    private String sharingBedding;
    private String thirdParty;
    private double totalRate;
    private double totalOriginalRate;

    private Meal meal;
    private Policies policies;

    private String priceBreakdowns;
    private String messages;
    private String cancellationPolicyCode;
    private String allotment;
    private String group;
    private String occupancy;
    private String status;
}
