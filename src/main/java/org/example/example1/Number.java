package org.example.example1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE_USE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Number {
}
