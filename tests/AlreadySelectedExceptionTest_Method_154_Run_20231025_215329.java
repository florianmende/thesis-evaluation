package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class AlreadySelectedExceptionTest_Method_154_Run_20231025_215329 {

    @Test
    void testGetOptionGroup() {
        // Set up the mock objects
        OptionGroup group = mock(OptionGroup.class);
        Option option = mock(Option.class);
        when(group.getSelected()).thenReturn("option");

        // Create the exception object
        AlreadySelectedException exception = new AlreadySelectedException(group, option);

        // Test the getOptionGroup() method
        assertEquals(group, exception.getOptionGroup());
    }
}