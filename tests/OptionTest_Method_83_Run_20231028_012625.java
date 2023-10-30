package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_83_Run_20231028_012625 {
    @Test
    public void testGetType() {
        // Create a mock Option instance with a specific type
        Option option = mock(Option.class);
        when(option.getType()).thenReturn(String.class);

        // Call the getType method and verify that it returns the correct type
        assertEquals(String.class, option.getType());
    }
}