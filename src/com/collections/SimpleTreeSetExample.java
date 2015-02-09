package com.collections;

import com.dto.Employee;

import java.util.TreeSet;

/**
 * Created by vinay.pawar on 2/9/14.
 */
public class SimpleTreeSetExample {

    public static void main(String args[]) {
        TreeSet<Employee> employees = new TreeSet<Employee>();
        employees.add(new Employee(1,"One","One"));
        employees.add(new Employee(1,"Two","Two"));
    }
}
