package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class HelpFormatterTest_Method_183_Run_20231028_032631 {

    @Test
    public void testGetLongOptSeparator() throws Exception {
        // Case 1: Check that the method returns the correct separator when it is set to a valid value.
        HelpFormatter formatter = new HelpFormatter();
        Field field = formatter.getClass().getDeclaredField("longOptSeparator");
        field.setAccessible(true);
        field.set(formatter, "=");
        assertEquals("=", formatter.getLongOptSeparator());

        // Case 2: Check that the method returns the correct separator when it is set to a null value.
        formatter = new HelpFormatter();
        field = formatter.getClass().getDeclaredField("longOptSeparator");
        field.setAccessible(true);
        field.set(formatter, null);
        assertEquals(null, formatter.getLongOptSeparator());

        // Case 3: Check that the method returns the correct separator when it is set to an empty string.
        formatter = new HelpFormatter();
        field = formatter.getClass().getDeclaredField("longOptSeparator");
        field.setAccessible(true);
        field.set(formatter, "");
        assertEquals("", formatter.getLongOptSeparator());
    }

    private void assertEquals(Object expected, Object actual) {
        if (expected == null && actual == null) {
            return;
        }
        if (expected != null && expected.equals(actual)) {
            return;
        }
        throw new AssertionError("Expected " + expected + ", but got " + actual);
    }
}