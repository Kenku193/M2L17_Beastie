package org.example.example1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Field[] fields = Person.class.getDeclaredFields();
        List<Field> fieldList = List.of(fields);
        for (Field field : fieldList) {
            System.out.println(field);
        }

        System.out.println("-".repeat(100));
        System.out.println("По полям:");

        Field field = fieldList.get(0);
        Type genericType = field.getGenericType();
        System.out.println(genericType);

        System.out.println("-".repeat(100));
        System.out.println("По методам:");

        Method[] declaredMethods = Person.class.getMethods();
        Method declaredMethod = declaredMethods[0];
        System.out.println(declaredMethod);

        System.out.println(Arrays.toString(declaredMethod.getParameterTypes()));

    }
}
