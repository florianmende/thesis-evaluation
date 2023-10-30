package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_209_Run_20231025_100630 {

    @Test
    public void testSetLongOptPrefixValid() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("prefix");
        assertEquals("prefix", formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix(null);
        assertNull(formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptPrefixEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("");
        assertEquals("", formatter.getLongOptPrefix());
    }
}