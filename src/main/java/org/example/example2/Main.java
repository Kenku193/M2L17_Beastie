package org.example.example2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {

//        Employee employee = Employee.class.newInstance();
//        System.out.println("age is: " + employee.getAge());

//        try {
//            Class<?> aClass = Class.forName("org.example.example2.Employee");
//            System.out.println(Arrays.toString(aClass.getDeclaredFields()));
//        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        Employee employee = new Employee("Yura", "S", 999);
//        Class<? extends Employee> aClass = employee.getClass();
//        Employee employee1 = aClass.newInstance();

        Constructor[] constructors = Employee.class.getConstructors();
        Class[] parameterTypes = constructors[0].getParameterTypes();
        Employee o = (Employee) constructors[0].newInstance("A", "B", 9);

        System.out.println(o.getAge());


    }
}
