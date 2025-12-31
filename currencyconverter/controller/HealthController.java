package com.example.currencyconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*marks this class as a Spring-managed component by telling Spring that this class handles
HTTP requests , Methods inside return data not HTML pages 

Combines @controller and @ResponseBody

Everything returned from this class is sent directly back to the client as a response
What happens WITHOUT @RestController
.  Spring will not detect the class
.  Your endpoints will never exist
.  Requests to /api/health would return 404
*/

@RestController
@RequestMapping("/api")
public class HealthController {

    Public Spring health(){
        return "API is currently Running";
    }


}
