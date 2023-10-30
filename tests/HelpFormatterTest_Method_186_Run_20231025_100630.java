package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_186_Run_20231025_100630 {
    @Test
    public void testGetOptPrefix_NonEmpty() {
        // Set up the mock HelpFormatter object with a non-empty defaultOptPrefix
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getOptPrefix()).thenReturn("-");

        // Call the method and check the result
        String result = formatter.getOptPrefix();
        assertEquals("-", result);
    }

    @Test
    public void testGetOptPrefix_Empty() {
        // Set up the mock HelpFormatter object with an empty defaultOptPrefix
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getOptPrefix()).thenReturn("");

        // Call the method and check the result
        String result = formatter.getOptPrefix();
        assertEquals("", result);
    }

    @Test
    public void testGetOptPrefix_Null() {
        // Set up the mock HelpFormatter object with a null defaultOptPrefix
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getOptPrefix()).thenReturn(null);

        // Call the method and check the result
        String result = formatter.getOptPrefix();
        assertEquals(null, result);
    }
}