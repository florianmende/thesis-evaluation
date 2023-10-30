package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_206_Run_20231025_125643 {

    @Test
    public void testSetArgName() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("test");
        assertEquals("test", formatter.getArgName());
    }

    @Test
    public void testSetArgNameNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName(null);
        assertNull(formatter.getArgName());
    }

    @Test
    public void testSetArgNameEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("");
        assertEquals("", formatter.getArgName());
    }
}