package org.apache.commons.cli;

import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231030_094427 {

    @Test
    public void testGetOption() {
        // Case 1: The method returns the correct option when it is provided.
        UnrecognizedOptionException exception = new UnrecognizedOptionException("message", "option");
        assertEquals("option", exception.getOption());

        // Case 2: The method returns null when no option is provided.
        exception = new UnrecognizedOptionException("message");
        assertNull(exception.getOption());

        // Case 3: The method returns the correct option even when the option is not recognized.
        exception = new UnrecognizedOptionException("message", "option");
        assertEquals("option", exception.getOption());
    }
}