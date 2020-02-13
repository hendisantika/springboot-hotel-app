package com.hendisantika.springboothotelapp.controller;

import com.hendisantika.springboothotelapp.service.WebserviceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/02/20
 * Time: 06.11
 */
@Controller
@RequestMapping("/hotel")
public class HotelController extends BaseController {

    // key for supplier markup
    private final String kMarkup = "markup";
    private final String kExchange = "exchange";

    @Autowired
    private WebserviceManager apiManager;
}
