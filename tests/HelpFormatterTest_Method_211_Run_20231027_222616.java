package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_211_Run_20231027_222616 {

    @Test
    public void testSetNewLineValidString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("test");
        assertEquals("test", formatter.getNewLine());
    }

    @Test
    public void testSetNewLineEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("");
        assertEquals("", formatter.getNewLine());
    }

    @Test
    public void testSetNewLineNullString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine(null);
        assertEquals(null, formatter.getNewLine());
    }
}