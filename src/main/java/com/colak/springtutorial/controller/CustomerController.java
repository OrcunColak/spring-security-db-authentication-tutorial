package com.colak.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("portal")
public class CustomerController {

    // Everybody can access this
    // http://localhost:8080/portal
    @GetMapping("")
    public String getPortal(){
        return "Welcome To Your Portal";
    }

    // USER role
    // http://localhost:8080/portal/customer
    @GetMapping("customer")
    public String getCustomerPortal(){
        return "Welcome To The User Portal";
    }

    // ADMIN Role
    // http://localhost:8080/portal/admin
    @GetMapping("admin")
    public String getAdminPortal(){
        return "Welcome To The Admin Portal";
    }
}
