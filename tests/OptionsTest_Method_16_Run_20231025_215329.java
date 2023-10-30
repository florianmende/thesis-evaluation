package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class OptionsTest_Method_16_Run_20231025_215329 {

    @Test
    public void testHelpOptions_empty() {
        Options options = new Options();
        List<Option> expected = new ArrayList<>();
        Assert.assertEquals(expected, options.helpOptions());
    }

    @Test
    public void testHelpOptions_someOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        options.addOption("c", "charlie", false, "Charlie option");
        List<Option> expected = new ArrayList<>();
        expected.add(options.getOption("a"));
        expected.add(options.getOption("b"));
        expected.add(options.getOption("c"));
        Assert.assertEquals(expected, options.helpOptions());
    }

    @Test
    public void testHelpOptions_duplicateKeys() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        options.addOption("c", "charlie", false, "Charlie option");
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        options.addOption("c", "charlie", false, "Charlie option");
        List<Option> expected = new ArrayList<>();
        expected.add(options.getOption("a"));
        expected.add(options.getOption("b"));
        expected.add(options.getOption("c"));
        Assert.assertEquals(expected, options.helpOptions());
    }
}