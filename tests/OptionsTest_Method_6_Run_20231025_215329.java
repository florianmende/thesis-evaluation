package org.apache.commons.cli;


import org.junit.Assert;
import org.junit.Test;

public class OptionsTest_Method_6_Run_20231025_215329 {
    @Test
    public void testAddRequiredOption() {
        Options options = new Options();

        // Test adding a required option with a short name and a long name
        options.addRequiredOption("a", "arg", false, "description");
        Assert.assertTrue(options.hasOption("a"));
        Assert.assertTrue(options.hasLongOption("arg"));
        Assert.assertTrue(options.getOption("a").isRequired());

        // Test adding a required option with a short name only
        options.addRequiredOption("b", null, false, "description");
        Assert.assertTrue(options.hasOption("b"));
        Assert.assertTrue(options.getOption("b").isRequired());

        // Test adding a required option with a long name only
        options.addRequiredOption(null, "long-arg", false, "description");
        Assert.assertTrue(options.hasLongOption("long-arg"));
        Assert.assertTrue(options.getOption("long-arg").isRequired());
    }
}