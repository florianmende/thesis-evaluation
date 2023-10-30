package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_187_Run_20231028_042634 {

    @Test
    public void testGetSyntaxPrefix() {
        HelpFormatter formatter = mock(HelpFormatter.class);

        // Case 1: defaultSyntaxPrefix is initialized with a non-empty string
        when(formatter.getSyntaxPrefix()).thenReturn("prefix");
        assertEquals("prefix", formatter.getSyntaxPrefix());

        // Case 2: defaultSyntaxPrefix is initialized with an empty string
        when(formatter.getSyntaxPrefix()).thenReturn("");
        assertEquals("", formatter.getSyntaxPrefix());

        // Case 3: defaultSyntaxPrefix is not initialized (i.e., it is null)
        when(formatter.getSyntaxPrefix()).thenReturn(null);
        assertEquals(null, formatter.getSyntaxPrefix());
    }
}