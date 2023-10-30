package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_184_Run_20231025_224954 {
    @Test
    public void testGetNewLine_NonNullValue() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("hello");
        assertEquals("hello", formatter.getNewLine());
    }

    @Test
    public void testGetNewLine_NullValue() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine(null);
        assertNull(formatter.getNewLine());
    }

    @Test
    public void testGetNewLine_NoValueSet() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
    }
}