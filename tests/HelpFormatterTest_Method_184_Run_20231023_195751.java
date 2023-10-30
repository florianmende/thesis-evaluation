package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

class HelpFormatterTest_Method_184_Run_20231023_195751 {
    @Test
    void testGetNewLine() {
        // Set up mock HelpFormatter object
        HelpFormatter helpFormatter = Mockito.mock(HelpFormatter.class);

        // Case 1: defaultNewLine is set to a non-empty string
        Mockito.when(helpFormatter.getNewLine()).thenReturn("foo");
        Assertions.assertEquals("foo", helpFormatter.getNewLine());

        // Case 2: defaultNewLine is set to an empty string
        Mockito.when(helpFormatter.getNewLine()).thenReturn("");
        Assertions.assertEquals("", helpFormatter.getNewLine());

        // Case 3: defaultNewLine is set to null
        Mockito.when(helpFormatter.getNewLine()).thenReturn(null);
        Assertions.assertEquals(null, helpFormatter.getNewLine());
    }
}