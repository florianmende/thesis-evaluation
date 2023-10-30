package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import org.apache.commons.cli.HelpFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_179_Run_20231025_193245 {

    @Test
    public void testGetArgNameWhenNotNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("argName");
        assertEquals("argName", formatter.getArgName());
    }

    @Test
    public void testGetArgNameWhenNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName(null);
        assertNull(formatter.getArgName());
    }

    @Test
    public void testGetArgNameWhenEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("");
        assertEquals("", formatter.getArgName());
    }
}