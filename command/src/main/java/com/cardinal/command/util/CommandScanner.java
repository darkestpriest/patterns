package com.cardinal.command.util;

import com.cardinal.command.enums.CommandType;
import com.cardinal.command.interfaces.Command;
import com.cardinal.command.interfaces.Configuration;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.*;

import static com.cardinal.command.enums.CommandType.OFF;
import static com.cardinal.command.enums.CommandType.ON;

public class CommandScanner {

    public static Map<CommandType,List<Command>> getAvailableCommands() {

        Reflections reflections = new Reflections("com.cardinal.command.command");
        Set<Class<?>> commandClasses = reflections.getTypesAnnotatedWith(Configuration.class);

        return retrieveClasses(commandClasses);
    }

    private static Map<CommandType,List<Command>> retrieveClasses(Set<Class<?>> commandClasses) {

        Map<CommandType,List<Command>> availableMap = new HashMap<>();
        List<Command> onCommands = new ArrayList<>();
        List<Command> offCommands = new ArrayList<>();

        commandClasses.forEach(annotatedClass -> {
            Configuration annotated = getAnnotation(annotatedClass);
            if(annotated.enabled()) {
                try {
                    switch (annotated.commandType()) {
                        case OFF:
                            offCommands.add((Command) annotatedClass
                                    .getClassLoader()
                                    .loadClass(annotatedClass.getName())
                                    .newInstance());
                            break;
                        case ON:
                            onCommands.add((Command) annotatedClass
                                    .getClassLoader()
                                    .loadClass(annotatedClass.getName())
                                    .newInstance());
                            break;
                    }

                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        availableMap.put(OFF, offCommands);
        availableMap.put(ON, onCommands);
        return availableMap;
    }

    private static Configuration getAnnotation(Class apiClass) {
        Annotation annotation = apiClass.getAnnotation(Configuration.class);
        return (Configuration) annotation;
    }
}
