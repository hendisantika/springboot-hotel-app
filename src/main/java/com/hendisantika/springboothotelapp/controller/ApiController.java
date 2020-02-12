package com.hendisantika.springboothotelapp.controller;

import com.hendisantika.springboothotelapp.entity.Nationality;
import com.hendisantika.springboothotelapp.service.WebserviceManager;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/02/20
 * Time: 06.20
 */
@RestController
@RequestMapping("/api")
public class ApiController extends BaseController {
    @Autowired
    private WebserviceManager apiManager;

    @RequestMapping("/suggestion/nationality")
    public String suggestNationality(@RequestParam("key") String key) {

        // call rest api for fetching nationality suggestions
        Nationality[] nationalities = apiManager.getNationality(key);
        context.setAttribute(kNationality, nationalities);

        JSONArray jsonArray = JSONArray.fromObject(nationalities);

        return jsonArray.toString();
    }
}
