package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_183_Run_20231025_193245 {
    @Test
    public void testGetLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparatorEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("");
        assertEquals("", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparatorNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator(null);
        assertNull(formatter.getLongOptSeparator());
    }
}