package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.cli.TypeHandler;
import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class TypeHandlerTest_Method_220_Run_20231026_105918 {
    @Test
    public void testCreateNumber() throws Exception {
        // Test case 1: Input string with decimal point
        String str1 = "123.456";
        Number number1 = TypeHandler.createNumber(str1);
        assertEquals(Double.class, number1.getClass());
        assertEquals(123.456, number1.doubleValue());

        // Test case 2: Input string without decimal point
        String str2 = "123456";
        Number number2 = TypeHandler.createNumber(str2);
        assertEquals(Long.class, number2.getClass());
        assertEquals(123456L, number2.longValue());

        // Test case 3: Input string with invalid number format
        String str3 = "abc";
        assertThrows(ParseException.class, () -> TypeHandler.createNumber(str3));
    }
}