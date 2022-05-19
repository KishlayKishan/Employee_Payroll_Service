package com.bridgelabz.employeepayrollapp;

import org.apache.juli.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayrollApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll App !!!!!");
		ApplicationContext context = SpringApplication.run(EmployeePayrollApplication.class, args);
		Log.info("Employee Payroll App Started in {} Environment");
	}

}