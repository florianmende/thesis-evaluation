package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_184_Run_20231024_091429 {
    @Test
    public void testGetNewLineDefault() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(System.lineSeparator(), formatter.getNewLine());
    }

    @Test
    public void testGetNewLineSet() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void testGetNewLineDifferent() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("\r\n");
        assertEquals("\r\n", formatter.getNewLine());
    }
}