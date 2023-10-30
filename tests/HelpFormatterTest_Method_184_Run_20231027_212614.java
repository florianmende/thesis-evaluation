package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_184_Run_20231027_212614 {

    @Test
    void testGetNewLine_nonNull() {
        // Set up
        String defaultNewLine = "Test";
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getNewLine()).thenReturn(defaultNewLine);

        // Exercise
        String result = formatter.getNewLine();

        // Verify
        Assertions.assertEquals(defaultNewLine, result);
    }

    @Test
    void testGetNewLine_null() {
        // Set up
        String defaultNewLine = null;
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getNewLine()).thenReturn(defaultNewLine);

        // Exercise
        String result = formatter.getNewLine();

        // Verify
        Assertions.assertNull(result);
    }

    @Test
    void testGetNewLine_notSet() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();

        // Exercise
        String result = formatter.getNewLine();

        // Verify
        Assertions.assertEquals(System.getProperty("line.separator"), result);
    }
}