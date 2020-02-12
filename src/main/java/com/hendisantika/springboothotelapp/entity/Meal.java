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
 * Time: 07.17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meal {
    private String mealCode;
    private String mealDescription;
    private String breakfast;
    private String breakfastCode;
    private String breakfastDescription;
}
