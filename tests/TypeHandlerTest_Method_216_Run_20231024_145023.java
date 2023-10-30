package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class TypeHandlerTest_Method_216_Run_20231024_145023 {

    @Mock
    private TypeHandler typeHandler;

    @Test
    public void testCreateClass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = typeHandler.getClass().getDeclaredMethod("createClass", String.class);
        method.setAccessible(true);

        // Test valid class name
        Class<?> result = (Class<?>) method.invoke(typeHandler, "java.lang.String");
        assertEquals(String.class, result);

        // Test invalid class name
        assertThrows(InvocationTargetException.class, () -> method.invoke(typeHandler, "invalid.class.name"));

        // Test non-existent class name
        assertThrows(InvocationTargetException.class, () -> method.invoke(typeHandler, "com.example.NonExistentClass"));
    }
}