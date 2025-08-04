package com.example;
@RestController
@RequestMapping("/loan")

public class LoanController {
    @GetMapping("/status")
    public String status() {
        return "Loan Service is UP";
    }
}
