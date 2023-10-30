package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_16_Run_20231025_105031 {

    @Test
    public void testHelpOptionsWithNoOptions() {
        Options options = new Options();
        List<Option> actual = options.helpOptions();
        List<Option> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void testHelpOptionsWithOneOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        List<Option> actual = options.helpOptions();
        List<Option> expected = new ArrayList<>();
        expected.add(new Option("a", "alpha", false, "Alpha option"));
        assertEquals(expected, actual);
    }

    @Test
    public void testHelpOptionsWithMultipleOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        options.addOption("c", "gamma", false, "Gamma option");
        List<Option> actual = options.helpOptions();
        List<Option> expected = new ArrayList<>();
        expected.add(new Option("a", "alpha", false, "Alpha option"));
        expected.add(new Option("b", "beta", false, "Beta option"));
        expected.add(new Option("c", "gamma", false, "Gamma option"));
        assertEquals(expected, actual);
    }
}