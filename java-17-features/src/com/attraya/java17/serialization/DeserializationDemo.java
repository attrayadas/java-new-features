package com.attraya.java17.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("/Users/Attraya/Documents/demo/Emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ObjectInputFilter filter1 = ObjectInputFilter.Config.createFilter("serialization.*;java.base/*;!*");

        ObjectInputFilter filter2 = ObjectInputFilter.allowFilter(cl -> cl.equals(Employee.class), ObjectInputFilter.Status.REJECTED);
        ObjectInputFilter mergedFilter = ObjectInputFilter.merge(filter1, filter2);

        ois.setObjectInputFilter(mergedFilter);

        Object obj = ois.readObject();
        Employee emp = (Employee) obj;

        System.out.println("Employee Id: " + emp.id);
        System.out.println("Employee Name: " + emp.name);
        System.out.println("Employee Salary: " + emp.salary);
        System.out.println("Employee SSN: " + emp.ssn);

    }

}

//Add jdk.serialFilter=!serialization.Employee to jdk-17\conf\security\java.security
