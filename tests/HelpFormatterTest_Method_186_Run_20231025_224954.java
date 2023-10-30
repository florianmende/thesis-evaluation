package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_186_Run_20231025_224954 {
    @Test
    public void testGetOptPrefixNonEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        assertEquals("-", formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefixEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix(null);
        assertNull(formatter.getOptPrefix());
    }
}