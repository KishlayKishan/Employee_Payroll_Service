package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

@Data
public class EmployeePayrollData {
	private Long Salary;
	private String name;
	private int employeeID;

	public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		this.employeeID = empId;
		this.name = employeePayrollDTO.name;
		this.Salary = employeePayrollDTO.salary;
	}

	public EmployeePayrollData() {
	}

	public Long getSalary() {
		return Salary;
	}

	public void setSalary(Long salary) {
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
}