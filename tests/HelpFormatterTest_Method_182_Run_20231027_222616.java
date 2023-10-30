package org.apache.commons.cli;


import org.junit.Test;
import static org.junit.Assert.*;

public class HelpFormatterTest_Method_182_Run_20231027_222616 {
    @Test
    public void testGetLongOptPrefixNonNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultLongOptPrefix = "--";
        assertEquals("--", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetLongOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultLongOptPrefix = null;
        assertNull(formatter.getLongOptPrefix());
    }

    @Test
    public void testGetLongOptPrefixNotSet() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultLongOptPrefix = null;
        assertNull(formatter.getLongOptPrefix());
    }
}