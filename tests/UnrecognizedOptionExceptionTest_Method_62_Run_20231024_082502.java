package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231024_082502 {
    @Test
    public void testGetOption() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("test", "option");
        assertEquals("option", exception.getOption());
    }

    @Test
    public void testGetOptionNull() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("test");
        assertNull(exception.getOption());
    }

    @Test
    public void testGetOptionEmpty() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("test", "");
        assertNotNull(exception.getOption());
        assertEquals("", exception.getOption());
    }
}