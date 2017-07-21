package com.cardinal.factory.util;

import com.cardinal.factory.interfaces.PizzaStore;
import com.cardinal.factory.interfaces.Store;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by maperez on 21/7/2017.
 */
public class ClassScanner {

    public static List<PizzaStore> getAvailableStores() {

        Reflections reflections = new Reflections("com.cardinal.factory.factory");
        Set<Class<?>> storeClasses = reflections.getTypesAnnotatedWith(Store.class);

        return retrieveClasses(storeClasses);
    }

    private static List<PizzaStore> retrieveClasses(Set<Class<?>> storeClasses) {

        List<PizzaStore> apiList = new ArrayList<>();

        storeClasses.forEach(annotatedClass -> {
            Store annotated = getAnnotation(annotatedClass);
            if(annotated.enabled()) {
                try {
                    apiList.add((PizzaStore) annotatedClass
                            .getClassLoader()
                            .loadClass(annotatedClass.getName())
                            .newInstance());
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        return apiList;
    }

    private static Store getAnnotation(Class apiClass) {
        Annotation annotation = apiClass.getAnnotation(Store.class);
        return (Store) annotation;
    }
}
