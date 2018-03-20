package Rozdzial3.Zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Company {

    public ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {

        this.employees = employees;
    }

    public Employee getBestPaidEmployee(){

        Collections.sort(employees, (emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()));
        return employees.get(0);
    }

    double average(Measurable[] objects){
        double average = 0.0;
        for(Measurable object : objects){
            average += object.getMeasure();
        }
        return average;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }


}