package com.hendisantika.springboothotelapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-hotel-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/02/20
 * Time: 06.21
 */
@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
//    public String index(HttpSession session, Map<String, Object> model) {
    public String index(Model model) {
        model.addAttribute("page", "index");
        return "index";
    }

//    @GetMapping("/home")
//    public String home(HttpSession session, Map<String, Object> model) {
//        model.put("page", "index");
//        return "home";
//    }

    @GetMapping("/about")
    public String about(Map<String, Object> model) {
        model.put("page", "about");
        return "aboutus";
    }

    @GetMapping("/contact")
    public String contact(Map<String, Object> model) {
        model.put("page", "contact");
        return "contactus";
    }

    @RequestMapping("/term")
    public String term(Map<String, Object> model) {
        model.put("page", "index");
        return "term";
    }

    @GetMapping("/privacy")
    public String privacy(Map<String, Object> model) {
        model.put("page", "index");
        return "privacy";
    }
}
