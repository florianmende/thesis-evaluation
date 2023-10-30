package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class TypeHandlerTest_Method_220_Run_20231024_145023 {
    @Test
    public void testCreateNumber_ValidDouble() throws ParseException {
        String input = "1.23";
        Number expected = Double.valueOf(input);
        Number actual = TypeHandler.createNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNumber_ValidLong() throws ParseException {
        String input = "123";
        Number expected = Long.valueOf(input);
        Number actual = TypeHandler.createNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNumber_InvalidNumber() throws ParseException {
        String input = "abc";
        assertThrows(ParseException.class, () -> {
            TypeHandler.createNumber(input);
        });
    }
}