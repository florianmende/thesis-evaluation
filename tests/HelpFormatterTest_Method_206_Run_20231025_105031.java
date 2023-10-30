package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class HelpFormatterTest_Method_206_Run_20231025_105031 {

    @Test
    void testSetArgNameValidString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("test");
        assertEquals("test", formatter.getArgName());
    }

    @Test
    void testSetArgNameNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName(null);
        assertNull(formatter.getArgName());
    }

    @Test
    void testSetArgNameEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("");
        assertEquals("", formatter.getArgName());
    }
}