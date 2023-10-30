package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionsTest_Method_8_Run_20231028_022628 {
    @Test
    public void testGetOptionWithShortName() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
    }

    @Test
    public void testGetOptionWithLongName() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        assertEquals(option, options.getOption("--a"));
    }

    @Test
    public void testGetOptionWithUnknownName() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        assertEquals(null, options.getOption("--b"));
    }
}