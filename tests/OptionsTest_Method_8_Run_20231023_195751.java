package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptionsTest_Method_8_Run_20231023_195751 {

    @Test
    public void testGetOptionWithShortName() {
        Options options = new Options();
        Option option = new Option("a", "aaa", false, "This is option a");
        options.addOption(option);

        Option result = options.getOption("a");
        assertEquals(option, result);
    }

    @Test
    public void testGetOptionWithLongName() {
        Options options = new Options();
        Option option = new Option("aaa", "aaa", false, "This is option aaa");
        options.addOption(option);

        Option result = options.getOption("aaa");
        assertEquals(option, result);
    }

    @Test
    public void testGetOptionWithInvalidName() {
        Options options = new Options();
        Option option = new Option("a", "aaa", false, "This is option a");
        options.addOption(option);

        Option result = options.getOption("b");
        assertEquals(null, result);
    }
}