package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_16_Run_20231028_012625 {

    @Test
    public void testHelpOptions_Size() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "option a");
        options.addOption("b", "beta", false, "option b");
        options.addOption("c", "gamma", false, "option c");

        List<Option> helpOptions = options.helpOptions();
        assertEquals(3, helpOptions.size());
    }

    @Test
    public void testHelpOptions_Elements() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "option a");
        options.addOption("b", "beta", false, "option b");
        options.addOption("c", "gamma", false, "option c");

        List<Option> helpOptions = options.helpOptions();
        assertTrue(helpOptions.contains(new Option("a", "alpha", false, "option a")));
        assertTrue(helpOptions.contains(new Option("b", "beta", false, "option b")));
        assertTrue(helpOptions.contains(new Option("c", "gamma", false, "option c")));
    }

    @Test
    public void testHelpOptions_Order() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "option a");
        options.addOption("b", "beta", false, "option b");
        options.addOption("c", "gamma", false, "option c");

        List<Option> helpOptions = options.helpOptions();
        assertEquals("a", helpOptions.get(0).getOpt());
        assertEquals("alpha", helpOptions.get(0).getLongOpt());
        assertEquals("b", helpOptions.get(1).getOpt());
        assertEquals("beta", helpOptions.get(1).getLongOpt());
        assertEquals("c", helpOptions.get(2).getOpt());
        assertEquals("gamma", helpOptions.get(2).getLongOpt());
    }
}