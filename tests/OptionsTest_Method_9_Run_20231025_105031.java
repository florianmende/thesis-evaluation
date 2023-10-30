package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionsTest_Method_9_Run_20231025_105031 {
    @Test
    public void testGetOptionGroup() {
        // Create an Options instance with an OptionGroup
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha");
        group.addOption(option);
        options.addOptionGroup(group);

        // Test case 1: The OptionGroup is found for an Option that exists in the Options instance
        assertEquals(group, options.getOptionGroup(option));

        // Test case 2: The OptionGroup is not found for an Option that does not exist in the Options instance
        Option option2 = new Option("b", "beta");
        assertNull(options.getOptionGroup(option2));

        // Test case 3: The OptionGroup is not found for an Option that is not part of any OptionGroup
        Option option3 = new Option("c", "gamma");
        options.addOption(option3);
        assertNull(options.getOptionGroup(option3));
    }
}