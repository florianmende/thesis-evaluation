package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TypeHandlerTest_Method_220_Run_20231024_082502 {
    private TypeHandler handler;

    @BeforeEach
    void setUp() {
        handler = new TypeHandler();
    }

    @Test
    void testCreateNumberDouble() {
        String str = "1.5";
        Number expected = 1.5;
        try {
            Number actual = handler.createNumber(str);
            assertEquals(expected, actual);
        } catch (ParseException e) {
            fail("Unexpected ParseException");
        }
    }

    @Test
    void testCreateNumberLong() {
        String str = "100";
        Number expected = 100L;
        try {
            Number actual = handler.createNumber(str);
            assertEquals(expected, actual);
        } catch (ParseException e) {
            fail("Unexpected ParseException");
        }
    }

    @Test
    void testCreateNumberInvalid() {
        String str = "abc";
        assertThrows(ParseException.class, () -> handler.createNumber(str));
    }
}