package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_219_Run_20231023_195751 {
    @Test
    public void testCreateClass() throws ParseException {
        TypeHandler typeHandler = new TypeHandler();
        String classname = "java.lang.String";
        Class<?> expectedClass = String.class;
        Class<?> actualClass = typeHandler.createClass(classname);
        Assertions.assertEquals(expectedClass, actualClass);
    }
}