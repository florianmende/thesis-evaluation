package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_187_Run_20231028_022628 {
    @Test
    public void testGetSyntaxPrefix() {
        // Set up mock objects
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getSyntaxPrefix()).thenReturn("test");

        // Test case 1: defaultSyntaxPrefix is set to a non-null value
        assertEquals("test", formatter.getSyntaxPrefix());

        // Test case 2: defaultSyntaxPrefix is set to null
        Mockito.when(formatter.getSyntaxPrefix()).thenReturn(null);
        assertEquals(null, formatter.getSyntaxPrefix());

        // Test case 3: defaultSyntaxPrefix is not set (i.e., it is null by default)
        Mockito.when(formatter.getSyntaxPrefix()).thenCallRealMethod();
        assertEquals(null, formatter.getSyntaxPrefix());
    }
}