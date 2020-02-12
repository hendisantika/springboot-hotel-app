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
 * Time: 06.04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policies {
    private String refundable;
    private String optionDate;
    private int safeDay;
    private String safeOptionDate;
    private String amendable;
    private String changeName;
    private String policies;

    public String getDescription() {
        String strResult = "Non-refundable";

        if ("true".equalsIgnoreCase(refundable)) {
            strResult = "Refundable";
        }

        return strResult;
    }
}
