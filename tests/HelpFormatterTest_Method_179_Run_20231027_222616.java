package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_179_Run_20231027_222616 {
    @Test
    public void testGetArgName() {
        // Create a mock HelpFormatter object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Set the value of the defaultArgName field to "argName"
        Mockito.when(formatter.getArgName()).thenReturn("argName");

        // Test that the method returns the correct value
        Assertions.assertEquals("argName", formatter.getArgName());
    }

    @Test
    public void testGetArgNameNull() {
        // Create a mock HelpFormatter object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Set the value of the defaultArgName field to null
        Mockito.when(formatter.getArgName()).thenReturn(null);

        // Test that the method returns the correct value
        Assertions.assertEquals(null, formatter.getArgName());
    }

    @Test
    public void testGetArgNameEmptyString() {
        // Create a mock HelpFormatter object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Set the value of the defaultArgName field to an empty string
        Mockito.when(formatter.getArgName()).thenReturn("");

        // Test that the method returns the correct value
        Assertions.assertEquals("", formatter.getArgName());
    }
}