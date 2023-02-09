package com.sg.lambdasAndStreams;

public class Employee {
    private String firstName;
    private String lastName;
    private Employee manager;
    private int yearOfService;
    private int numberOfDirectMessage;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public int getNumberOfDirectMessage() {
        return numberOfDirectMessage;
    }

    public void setNumberOfDirectMessage(int numberOfDirectMessage) {
        this.numberOfDirectMessage = numberOfDirectMessage;
    }


}
