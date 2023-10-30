package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_213_Run_20231030_094427 {
    @Test
    public void testSetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        Assertions.assertEquals("-", formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefixInvalidPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("--");
        Assertions.assertEquals("--", formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefixNullPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix(null);
        Assertions.assertEquals(null, formatter.getOptPrefix());
    }
}