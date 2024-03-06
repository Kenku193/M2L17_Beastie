package org.example.example1;

import java.util.List;

public class Person {

    public List<Integer> integerList;

    private String name;
    private int age;

    @Name(name ="JRU My anno")
    public boolean isMale;

    protected String address = "0";

    public static final int MAX_AGE = 120;
    public static final int MIN_AGE = 0;


    public String getName(int x, String a) {
        return name;
    }
}
