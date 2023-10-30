package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.Serializable;

public class HelpFormatterTest_Method_211_Run_20231025_105031 {

    @Test
    public void testSetNewLine_notNullOrEmpty() {
        // Setup
        HelpFormatter formatter = new HelpFormatter();
        String newline = "test";

        // Exercise
        formatter.setNewLine(newline);

        // Verify
        Assertions.assertEquals(newline, formatter.getNewLine());
    }

    @Test
    public void testSetNewLine_nullOrEmpty() {
        // Setup
        HelpFormatter formatter = new HelpFormatter();
        String newline = "";

        // Exercise
        formatter.setNewLine(newline);

        // Verify
        Assertions.assertEquals("", formatter.getNewLine());
    }

    @Test
    public void testSetNewLine_validLineSeparator() {
        // Setup
        HelpFormatter formatter = new HelpFormatter();
        String newline = "\n";

        // Exercise
        formatter.setNewLine(newline);

        // Verify
        Assertions.assertEquals(newline, formatter.getNewLine());
    }
}