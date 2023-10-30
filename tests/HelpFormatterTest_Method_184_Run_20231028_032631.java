package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_184_Run_20231028_032631 {
    @Test
    public void testGetNewLineDefault() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void testGetNewLineSet() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("\r\n");
        assertEquals("\r\n", formatter.getNewLine());
    }

    @Test
    public void testGetNewLineDifferent() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("\r\n");
        assertEquals("\r\n", formatter.getNewLine());
    }
}