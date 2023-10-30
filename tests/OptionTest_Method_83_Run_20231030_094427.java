package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class OptionTest_Method_83_Run_20231030_094427 {

    @Mock
    private Option option;

    @Test
    void testGetType() {
        // Initialize the option field
        option = mock(Option.class);

        // Create a mock Option object with the "type" field set to "String.class"
        when(option.getType()).thenReturn(String.class);

        // Check that the "getType" method returns the correct value
        assertEquals(String.class, option.getType());
    }
}