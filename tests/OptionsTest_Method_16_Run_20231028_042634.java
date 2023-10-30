package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_16_Run_20231028_042634 {
    @Test
    void testHelpOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description");
        options.addOption("b", "beta", false, "description");
        options.addOption("c", "charlie", false, "description");

        List<Option> expectedOptions = new ArrayList<>();
        expectedOptions.add(new Option("a", "alpha", false, "description"));
        expectedOptions.add(new Option("b", "beta", false, "description"));
        expectedOptions.add(new Option("c", "charlie", false, "description"));

        List<Option> actualOptions = options.helpOptions();

        assertEquals(expectedOptions.size(), actualOptions.size());
        for (int i = 0; i < expectedOptions.size(); i++) {
            assertEquals(expectedOptions.get(i), actualOptions.get(i));
        }
    }

    @Test
    void testHelpOptionsEmpty() {
        Options options = new Options();

        List<Option> actualOptions = options.helpOptions();

        assertTrue(actualOptions.isEmpty());
    }
}