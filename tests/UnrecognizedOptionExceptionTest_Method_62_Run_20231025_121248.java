package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231025_121248 {

    @Test
    void testGetOption() throws Exception {
        // Create a mock UnrecognizedOptionException with a null option
        UnrecognizedOptionException mockException = Mockito.mock(UnrecognizedOptionException.class);
        Mockito.when(mockException.getOption()).thenReturn(null);

        // Test that the option is null
        assertNull(mockException.getOption());

        // Create a mock UnrecognizedOptionException with a non-null option
        mockException = Mockito.mock(UnrecognizedOptionException.class);
        Mockito.when(mockException.getOption()).thenReturn("test");

        // Test that the option is non-null
        assertEquals("test", mockException.getOption());
    }
}