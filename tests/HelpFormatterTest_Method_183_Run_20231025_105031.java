package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HelpFormatterTest_Method_183_Run_20231025_105031 {
    @Test
    public void testGetLongOptSeparator() {
        // Case 1: Test that the method returns the correct separator when it is set to a non-default value.
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        // Case 2: Test that the method returns the default separator when it is not set to a non-default value.
        formatter = new HelpFormatter();
        assertEquals(" ", formatter.getLongOptSeparator());

        // Case 3: Test that the method returns the correct separator when it is set to a non-default value using reflection.
        formatter = mock(HelpFormatter.class);
        when(formatter.getLongOptSeparator()).thenReturn("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }
}