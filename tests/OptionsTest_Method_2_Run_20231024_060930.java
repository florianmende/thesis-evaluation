package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.junit.Test;

public class OptionsTest_Method_2_Run_20231024_060930 {
    @Test
    public void testAddOptionWithShortNameOnly() {
        Options options = new Options();
        Option option = new Option("a", false, "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
    }

    @Test
    public void testAddOptionWithLongNameOnly() {
        Options options = new Options();
        Option option = new Option("a", "long", false, "description");
        options.addOption(option);
        assertEquals(option, options.getOption("long"));
    }

    @Test
    public void testAddOptionWithBothShortAndLongNames() {
        Options options = new Options();
        Option option = new Option("a", "long", false, "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
        assertEquals(option, options.getOption("long"));
    }
}