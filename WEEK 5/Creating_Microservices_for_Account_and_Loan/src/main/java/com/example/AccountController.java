package com.example;
@RestController
@RequestMapping("/account")

public class AccountController {
    @GetMapping("/status")
    public String status() {
        return "Account Service is UP";
    }


}
