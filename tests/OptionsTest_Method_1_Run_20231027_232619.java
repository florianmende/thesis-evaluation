package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OptionsTest_Method_1_Run_20231027_232619 {
    @Test
    public void testAddOptionWithLongName() {
        Options options = new Options();
        Option option = new Option("a", "long-name", false, "description");
        options.addOption(option);
        assertTrue(options.getOptions().contains(option));
    }

    @Test
    public void testAddOptionWithRequired() {
        Options options = new Options();
        Option option = new Option("a", "long-name", true, "description");
        options.addOption(option);
        assertTrue(options.getOptions().contains(option));
    }

    @Test
    public void testAddOptionWithShortName() {
        Options options = new Options();
        Option option = new Option("a", "long-name", false, "description");
        options.addOption(option);
        assertTrue(options.getOptions().contains(option));
    }
}