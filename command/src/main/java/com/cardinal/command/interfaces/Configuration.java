package com.cardinal.command.interfaces;

import com.cardinal.command.enums.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Configuration {
    boolean enabled() default false;
    CommandType commandType();
}
