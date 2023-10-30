package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class UnrecognizedOptionExceptionTest_Method_62_Run_20231023_214133 {

    @Test
    public void testGetOption() {
        // Case 1: option is not null
        UnrecognizedOptionException exception = new UnrecognizedOptionException("message", "option");
        assertEquals("option", exception.getOption());

        // Case 2: option is null
        exception = new UnrecognizedOptionException("message", null);
        assertNull(exception.getOption());

        // Case 3: option is empty string
        exception = new UnrecognizedOptionException("message", "");
        assertEquals("", exception.getOption());
    }
}