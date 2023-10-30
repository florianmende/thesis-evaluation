package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class TypeHandlerTest_Method_216_Run_20231027_222616 {
    @Test
    public void testValidClassName() throws ParseException {
        String className = "java.lang.String";
        Class<?> expectedClass = String.class;
        Class<?> actualClass = TypeHandler.createClass(className);
        Assertions.assertEquals(expectedClass, actualClass);
    }

    @Test
    public void testInvalidClassName() {
        String className = "invalid.class.name";
        Assertions.assertThrows(ParseException.class, () -> {
            TypeHandler.createClass(className);
        });
    }

    @Test
    public void testNullClassName() {
        String className = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            TypeHandler.createClass(className);
        });
    }
}