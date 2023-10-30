package org.apache.commons.cli;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionsTest_Method_8_Run_20231028_012625 {
    @Test
    public void testGetOptionWithShortOpt() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
    }

    @Test
    public void testGetOptionWithLongOpt() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
    }

    @Test
    public void testGetOptionWithInvalidOpt() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        assertEquals(null, options.getOption("b"));
    }
}