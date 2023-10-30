package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class OptionsTest_Method_16_Run_20231030_094427 {

    @Test
    void testHelpOptionsEmpty() {
        Options options = new Options();
        List<Option> actual = options.helpOptions();
        assertTrue(actual.isEmpty());
    }

    @Test
    void testHelpOptionsOneOption() {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, "Alpha option");
        options.addOption(option);
        List<Option> actual = options.helpOptions();
        List<Option> expected = new ArrayList<>();
        expected.add(option);
        assertEquals(expected, actual);
    }

    @Test
    void testHelpOptionsMultipleOptions() {
        Options options = new Options();
        Option option1 = new Option("a", "alpha", false, "Alpha option");
        Option option2 = new Option("b", "beta", false, "Beta option");
        Option option3 = new Option("c", "gamma", false, "Gamma option");
        options.addOption(option1);
        options.addOption(option2);
        options.addOption(option3);
        List<Option> actual = options.helpOptions();
        List<Option> expected = new ArrayList<>();
        expected.add(option1);
        expected.add(option2);
        expected.add(option3);
        assertEquals(expected, actual);
    }

}