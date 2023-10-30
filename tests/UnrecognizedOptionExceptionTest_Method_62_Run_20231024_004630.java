package org.apache.commons.cli;


import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class UnrecognizedOptionExceptionTest_Method_62_Run_20231024_004630 {

    @Test
    void testGetOption() {
        // Case 1: Test that the method retrieves the correct option when the exception is constructed with the option.
        UnrecognizedOptionException exception = new UnrecognizedOptionException("test", "option");
        assertEquals("option", exception.getOption());

        // Case 2: Test that the method returns null when the exception is constructed without the option.
        exception = new UnrecognizedOptionException("test");
        assertNull(exception.getOption());

        // Case 3: Test that the method does not throw an UnrecognizedOptionException when the exception is constructed with a null option.
        assertDoesNotThrow(() -> new UnrecognizedOptionException("test", null));
    }
}