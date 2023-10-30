package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.Assert;
import org.junit.Test;

public class HelpFormatterTest_Method_213_Run_20231024_151954 {

    @Test
    public void testSetOptPrefixValidString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        Assert.assertEquals("-", formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefixNullString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix(null);
        Assert.assertNull(formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("");
        Assert.assertEquals("", formatter.getOptPrefix());
    }
}