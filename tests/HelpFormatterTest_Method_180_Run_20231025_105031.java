package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.Test;
import org.junit.Assert;

public class HelpFormatterTest_Method_180_Run_20231025_105031 {
    @Test
    public void testGetDescPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        Assert.assertEquals(10, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(-10);
        Assert.assertEquals(-10, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(0);
        Assert.assertEquals(0, formatter.getDescPadding());
    }
}