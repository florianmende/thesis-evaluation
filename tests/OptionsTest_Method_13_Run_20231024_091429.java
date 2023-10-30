package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class OptionsTest_Method_13_Run_20231024_091429 {
    @Test
    public void testHasLongOption() {
        // Test case 1: named Option is a member of this Options
        Options options = new Options();
        Option option = new Option("a", "long-a", false, "This is option A");
        options.addOption(option);
        assertTrue(options.hasLongOption("long-a"));

        // Test case 2: named Option is not a member of this Options
        options = new Options();
        option = new Option("b", "long-b", false, "This is option B");
        options.addOption(option);
        assertFalse(options.hasLongOption("long-c"));

        // Test case 3: named Option is null
        options = new Options();
        option = new Option("c", "long-c", false, "This is option C");
        options.addOption(option);
        assertFalse(options.hasLongOption(null));
    }
}