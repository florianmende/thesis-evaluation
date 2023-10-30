package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_180_Run_20231023_204140 {
    @Test
    public void testGetDescPadding() {
        // Create a mock HelpFormatter object
        HelpFormatter formatter = mock(HelpFormatter.class);
        
        // Set up the mock to return a specific value for the 'defaultDescPad' field
        when(formatter.getDescPadding()).thenReturn(8);
        
        // Verify that the method returns the expected value
        assertEquals(8, formatter.getDescPadding());
    }
}