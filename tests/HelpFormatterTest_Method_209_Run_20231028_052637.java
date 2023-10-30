package org.apache.commons.cli;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelpFormatterTest_Method_209_Run_20231028_052637 {
    private HelpFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = new HelpFormatter();
    }

    @Test
    void testSetLongOptPrefixNonNull() {
        String prefix = "prefix";
        formatter.setLongOptPrefix(prefix);
        assertEquals(prefix, formatter.getLongOptPrefix());
    }

    @Test
    void testSetLongOptPrefixNull() {
        formatter.setLongOptPrefix(null);
        assertNull(formatter.getLongOptPrefix());
    }

    @Test
    void testSetLongOptPrefixEmptyString() {
        String prefix = "";
        formatter.setLongOptPrefix(prefix);
        assertEquals(prefix, formatter.getLongOptPrefix());
    }
}