package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

class HelpFormatterTest_Method_206_Run_20231025_100630 {

    @Test
    void testSetArgNameValid() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("test");
        assertEquals("test", formatter.getArgName());
    }

    @Test
    void testSetArgNameInvalid() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName(null);
        assertNull(formatter.getArgName());
    }

    @Test
    void testSetArgNameNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("test");
        formatter.setArgName(null);
        assertNull(formatter.getArgName());
    }
}