package com.satya.studentdashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //@GetMapping("/")
    //public String home() {
    //    return "Student Dashboard Backend Running 🚀";
    //}
     @GetMapping("/secure")
    public String secure() {
        return "This is a secure page 🔐";
    }
}