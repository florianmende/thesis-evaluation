package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_183_Run_20231025_224954 {
    @Test
    public void testGetLongOptSeparator() {
        // Set up a mock HelpFormatter object with a non-empty longOptSeparator field
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLongOptSeparator()).thenReturn("=");

        // Test that the method returns the expected value when the field is set to a non-empty value
        Assertions.assertEquals("=", formatter.getLongOptSeparator());

        // Set up a mock HelpFormatter object with an empty longOptSeparator field
        formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLongOptSeparator()).thenReturn("");

        // Test that the method returns the expected value when the field is set to an empty value
        Assertions.assertEquals("", formatter.getLongOptSeparator());

        // Set up a mock HelpFormatter object with a null longOptSeparator field
        formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLongOptSeparator()).thenReturn(null);

        // Test that the method returns the expected value when the field is not set (i.e., it is null)
        Assertions.assertNull(formatter.getLongOptSeparator());
    }
}