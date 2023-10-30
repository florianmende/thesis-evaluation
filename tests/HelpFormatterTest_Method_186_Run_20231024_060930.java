package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_186_Run_20231024_060930 {
    private HelpFormatter formatter = new HelpFormatter();

    @Test
    public void testGetOptPrefixValid() {
        formatter.setOptPrefix("-");
        String optPrefix = formatter.getOptPrefix();
        assertEquals("-", optPrefix);
    }

    @Test
    public void testGetOptPrefixEmpty() {
        formatter.setOptPrefix("");
        String optPrefix = formatter.getOptPrefix();
        assertEquals("", optPrefix);
    }

    @Test
    public void testGetOptPrefixNull() {
        formatter.setOptPrefix(null);
        String optPrefix = formatter.getOptPrefix();
        assertEquals(null, optPrefix);
    }
}