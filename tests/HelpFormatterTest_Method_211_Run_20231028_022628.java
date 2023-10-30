package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelpFormatterTest_Method_211_Run_20231028_022628 {
    @Test
    void testSetNewLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("newLine");
        assertEquals("newLine", formatter.getNewLine());
    }

    @Test
    void testSetNewLineNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine(null);
        assertNull(formatter.getNewLine());
    }

    @Test
    void testSetNewLineEmpty() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("");
        assertEquals("", formatter.getNewLine());
    }
}