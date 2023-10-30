package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingArgumentExceptionTest_Method_32_Run_20231024_091429 {
    @Test
    public void testGetOption() throws Exception {
        // Set up mock option
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("testOption");

        // Create a new MissingArgumentException with the mock option
        MissingArgumentException exception = new MissingArgumentException(option);

        // Verify that the option returned by getOption is the same as the mock option
        assertEquals(option, exception.getOption());
    }
}