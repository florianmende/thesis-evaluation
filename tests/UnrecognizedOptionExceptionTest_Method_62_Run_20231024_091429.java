package org.apache.commons.cli;

import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231024_091429 {

    @Test
    public void testGetOption() {
        // Case 1: The method returns the correct option when it is provided
        UnrecognizedOptionException exception = new UnrecognizedOptionException("--help", "help");
        assertEquals("help", exception.getOption());

        // Case 2: The method returns null or an empty string when no option is provided
        exception = new UnrecognizedOptionException("");
        assertNull(exception.getOption());

        // Case 3: The method returns the correct option when the option is provided with additional information
        exception = new UnrecognizedOptionException("--help", "help");
        assertEquals("help", exception.getOption());
    }
}