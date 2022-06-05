package com.myepark.apartment.controller

import com.myepark.apartment.service.feignclient.ApartmentGovernmentClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class ApartmentController {

    @GetMapping("/health")
    @ResponseBody
    fun getHealth(): String {
        return "{health: up}";
    }

}