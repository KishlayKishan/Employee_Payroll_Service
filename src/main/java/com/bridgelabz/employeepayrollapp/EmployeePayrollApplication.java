package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;

import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
Use Lombok Library for Logging i.e Slf4j
 */

@SpringBootApplication
@Slf4j

public class EmployeePayrollApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll App !!!!!");
        SpringApplication.run(EmployeePayrollApplication.class, args);
        Log.info("employee payroll app started");
    }

}

