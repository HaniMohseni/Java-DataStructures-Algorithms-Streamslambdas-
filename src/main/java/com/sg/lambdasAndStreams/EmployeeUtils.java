package com.sg.lambdasAndStreams;

import java.util.function.Function;

public class EmployeeUtils {
    public String getFullName(Employee employee){
        Function<Employee,String> fullName=(Employee e)->e.getFirstName() + " "+ e.getLastName();
        return fullName.apply(employee);
    }

    public String getFirstName(Employee employee){
        Function<Employee,String> firstName=(Employee e)->e.getFirstName();
        return firstName.apply(employee);
    }

    public String getLastName(Employee employee){
        Function<Employee,String > lastName=(Employee e)->e.getLastName();
        return lastName.apply(employee);
    }

    public Boolean hasBeenEmployedLongerThan5Years (Employee employee){
        Function<Employee,Boolean> employedMorThan5Years =(Employee e)->(e.getYearOfService()>5);
        return  employedMorThan5Years.apply(employee);
    }

    public Boolean hasMoreThan3DirectMessage (Employee employee){
        Function<Employee,Boolean> directMessageMorThan3=(Employee e)->(e.getNumberOfDirectMessage()>3);
        return directMessageMorThan3.apply(employee);
    }

    public String getManagerLastName (Employee employee){
        Function<Employee,String>managerLastName = (Employee e)->e.getManager().getLastName();
        return managerLastName.apply(employee);
    }

    public Boolean hasEmployeeMorThan3YearsOfServiceAndLessThan2DirectReport(Employee employee){
        Function<Employee,Boolean> serviceMorThan3AndReportLessThan2 = (Employee e)->((e.getYearOfService()>3)&&(e.getNumberOfDirectMessage()<2));
        return serviceMorThan3AndReportLessThan2.apply(employee);
    }

}
