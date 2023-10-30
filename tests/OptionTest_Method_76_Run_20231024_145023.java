package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class OptionTest_Method_76_Run_20231024_145023 {
    @Test
    public void testGetArgName() {
        // Create a mock Option instance
        Option option = Mockito.mock(Option.class);

        // Set up the mock behavior
        when(option.getArgName()).thenReturn("argName");

        // Verify the mock behavior
        assertEquals("argName", option.getArgName());
    }
}