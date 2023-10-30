package org.apache.commons.cli;

import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231027_232619 {

    @Test
    void testGetOptionNull() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Test message", null);
        assertNull(exception.getOption());
    }

    @Test
    void testGetOptionValid() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Test message", "testOption");
        assertEquals("testOption", exception.getOption());
    }

    @Test
    void testGetOptionEmpty() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Test message", "");
        assertEquals("", exception.getOption());
    }
}