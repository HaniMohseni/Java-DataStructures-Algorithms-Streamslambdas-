package com.sg.lambdas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeUtilsTest {

    private EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    void getFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Hani");
        employee.setLastName("Mohseni");

        String actual = employeeUtils.getFullName(employee);
        assertEquals(actual,"Hani Mohseni");
    }

    @Test
    void getFirstName() {
        Employee employee = new Employee();
        employee.setFirstName("Hani");

        String actual = employeeUtils.getFirstName(employee);
        assertEquals(actual,"Hani");
    }

    @Test
    void getLastName() {
        Employee employee = new Employee();
        employee.setLastName("Mohseni");

        String actual=employeeUtils.getLastName(employee);
        assertEquals(actual,"Mohseni");
    }

    @Test
    void hasBeenEmployedLongerThan5Years() {
        Employee employee = new Employee();
        employee.setYearOfService(6);

        boolean actual = employeeUtils.hasBeenEmployedLongerThan5Years(employee);
        assertEquals(true,actual);
    }

    @Test
    void hasMoreThan3DirectMessage() {
        Employee employee = new Employee();
        employee.setNumberOfDirectMessage(2);

        boolean actual = employeeUtils.hasMoreThan3DirectMessage(employee);
        assertEquals(false,actual);

    }

    @Test
    void getManagerLastName() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee2.setLastName("Mohseni");
        employee1.setManager(employee2);

        String actual = employeeUtils.getManagerLastName(employee1);
        assertEquals("Mohseni",actual);
    }

    @Test
    void hasEmployeeMorThan3YearsOfServiceAndLessThan2DirectReport() {
        Employee employee = new Employee();
        employee.setYearOfService(5);
        employee.setNumberOfDirectMessage(1);
        Boolean actual = employeeUtils.hasEmployeeMorThan3YearsOfServiceAndLessThan2DirectReport(employee);

       // assertEquals(true,actual);
        assertTrue(actual);
    }

}