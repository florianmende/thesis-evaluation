package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_5_Run_20231023_214133 {
    @Test
    void testAddOptionGroup() {
        // Create an Options instance
        Options options = new Options();

        // Create an OptionGroup instance
        OptionGroup group = new OptionGroup();

        // Create some Option instances
        Option option1 = new Option("a", "aaa", false, "Option 1");
        Option option2 = new Option("b", "bbb", false, "Option 2");
        Option option3 = new Option("c", "ccc", false, "Option 3");

        // Add the Option instances to the OptionGroup instance
        group.addOption(option1);
        group.addOption(option2);
        group.addOption(option3);

        // Add the OptionGroup instance to the Options instance
        options.addOptionGroup(group);

        // Check that the Options instance contains the OptionGroup instance and its Option instances
        assertTrue(options.getOptionGroups().contains(group));
        assertTrue(options.getOptions().contains(option1));
        assertTrue(options.getOptions().contains(option2));
        assertTrue(options.getOptions().contains(option3));
    }
}