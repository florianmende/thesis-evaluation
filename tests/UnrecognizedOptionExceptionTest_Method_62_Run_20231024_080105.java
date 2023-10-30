package org.apache.commons.cli;

import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231024_080105 {
    @Test
    public void testGetOption() {
        // Test case 1: option is null
        UnrecognizedOptionException exception = new UnrecognizedOptionException("message", null);
        assertNull(exception.getOption());

        // Test case 2: option is not null
        exception = new UnrecognizedOptionException("message", "option");
        assertEquals("option", exception.getOption());

        // Test case 3: option is not null and contains spaces
        exception = new UnrecognizedOptionException("message", "option with spaces");
        assertEquals("option with spaces", exception.getOption());
    }
}