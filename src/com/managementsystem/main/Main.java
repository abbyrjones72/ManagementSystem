package com.managementsystem.main;

import com.managementsystem.classes.Employee.Builder;

public class Main {

    public static void main(String[] args)
    {
        Builder newEmp = new Employee.Builder("Abby", "Jones", 2231, 14)
                .address1("3701 S. Rogers St.")
                .city("Bloomington")
                .state("Indiana")
                .zipcode("47403")
                .phone1("812-340-8815");
    }
}
