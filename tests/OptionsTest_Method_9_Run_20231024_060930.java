package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class OptionsTest_Method_9_Run_20231024_060930 {
    @Test
    void testGetOptionGroup() {
        Options options = new Options();
        Option option = new Option("a", "aaa");
        options.addOption(option);

        // Case 1: The OptionGroup is not null
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        options.addOptionGroup(group);
        assertEquals(group, options.getOptionGroup(option));

        // Case 2: The OptionGroup is null
        options = new Options();
        option = new Option("b", "bbb");
        options.addOption(option);
        assertNull(options.getOptionGroup(option));

        // Case 3: The Option is not part of any OptionGroup
        options = new Options();
        option = new Option("c", "ccc");
        options.addOption(option);
        assertNull(options.getOptionGroup(option));
    }
}