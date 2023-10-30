package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231026_155023 {

    @Test
    void testGetOption() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("test", "foo");
        assertEquals("foo", exception.getOption());
    }

    @Test
    void testGetOptionWithNullOption() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("test", null);
        assertEquals(null, exception.getOption());
    }

    @Test
    void testGetOptionWithEmptyOption() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("test", "");
        assertEquals("", exception.getOption());
    }
}