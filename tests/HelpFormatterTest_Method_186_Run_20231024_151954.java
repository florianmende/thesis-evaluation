package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_186_Run_20231024_151954 {
    @Test
    public void testGetOptPrefix() {
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