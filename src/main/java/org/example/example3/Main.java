package org.example.example3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Person person = new Person(99, "Neo");
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);

        int age = (int) field.get(person);
        System.out.println(age);

        field.set(person, 876564);
        age = (int) field.get(person);
        System.out.println(age);


        Field[] declaredFields = Person.class.getDeclaredFields();
        List<String> actualFieldNames = getFieldNames(declaredFields);
        actualFieldNames.forEach(System.out::println);

        System.out.println("-".repeat(100));

        System.out.println(person.nickName);
        declaredFields[1].set(person, "Oreo");
        System.out.println(person.nickName);



    }

    static List<String> getFieldNames(Field[] fields){
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields) {
            fieldNames.add(Modifier.toString(field.getModifiers()) + " " + field.getName());
        }
        return fieldNames;
    }
}
