package com.managementsystem.classes;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final int employeeID;
    private final String address1;
    private final String address2;
    private final String city;
    private final String state;
    private final String zipcode;
    private final String phone1;
    private final String phone2;
    private final String hireDate;
    private final boolean isCurrentEmployee;
    private final int departmentNumber;

    public static class Builder
    {
        private final String firstName;
        private final String lastName;
        private final int employeeID;
        private final int departmentNumber;

        // optional parms
        private String address1 = "";
        private String address2 = "";
        private String city = "";
        private String state = "";
        private String zipcode = "";
        private String phone1 = "";
        private String phone2 = "";
        private String hireDate = "";
        private boolean isCurrentEmployee = true;

        public Builder(String firstName, String lastName, int employeeID, int departmentNumber)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.employeeID = employeeID;
            this.departmentNumber = departmentNumber;
        }

        public Builder address1(String value) { address1 = value; return this; }
        public Builder address2(String value) { address2 = value; return this; }
        public Builder city(String value) { city = value; return this; }
        public Builder state(String value) { state = value; return this; }
        public Builder zipcode(String value) { zipcode = value; return this; }
        public Builder phone1(String value) { phone1 = value; return this; }
        public Builder phone2(String value) { phone2 = value; return this; }
        public Builder hireDate(String value) { hireDate = value; return this; }
        public Builder isCurrentEmployee(boolean value) { isCurrentEmployee = value; return this; }

        public Employee build()
        {
            return new Employee(this);
        }
    }

    private Employee(Builder builder)
    {
        firstName = builder.firstName;
        lastName = builder.lastName;
        employeeID = builder.employeeID;
        departmentNumber = builder.departmentNumber;
        address1 = builder.address1;
        address2 = builder.address2;
        city = builder.city;
        state = builder.state;
        zipcode = builder.zipcode;
        phone1 = builder.phone1;
        phone2 = builder.phone2;
        hireDate = builder.hireDate;
        isCurrentEmployee = builder.isCurrentEmployee;
    }
}
