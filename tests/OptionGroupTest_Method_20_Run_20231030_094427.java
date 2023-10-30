package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

class OptionGroupTest_Method_20_Run_20231030_094427 {
    @Test
    void testGetOptionsEmpty() {
        OptionGroup group = new OptionGroup();
        assertTrue(group.getOptions().isEmpty());
    }

    @Test
    void testGetOptionsOneOption() {
        Option option = new Option("a", "option a");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(option));
    }

    @Test
    void testGetOptionsMultipleOptions() {
        Option option1 = new Option("a", "option a");
        Option option2 = new Option("b", "option b");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getOptions().contains(option1));
        assertTrue(group.getOptions().contains(option2));
    }
}