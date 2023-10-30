package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.Assert;
import org.junit.Test;

public class OptionsTest_Method_8_Run_20231028_052637 {
    @Test
    public void testGetOptionShort() {
        Options options = new Options();
        options.addOption("h", "help", false, "Show help");
        Option option = options.getOption("h");
        Assert.assertEquals("h", option.getOpt());
        Assert.assertEquals("help", option.getLongOpt());
    }

    @Test
    public void testGetOptionLong() {
        Options options = new Options();
        options.addOption("h", "help", false, "Show help");
        Option option = options.getOption("help");
        Assert.assertEquals("h", option.getOpt());
        Assert.assertEquals("help", option.getLongOpt());
    }

    @Test
    public void testGetOptionInvalid() {
        Options options = new Options();
        options.addOption("h", "help", false, "Show help");
        Option option = options.getOption("invalid");
        Assert.assertNull(option);
    }
}