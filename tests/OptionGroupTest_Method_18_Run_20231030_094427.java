package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionGroupTest_Method_18_Run_20231030_094427 {
    @Test
    public void testAddOptionToEmptyGroup() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("test", false, "description");
        group.addOption(option);
        assertEquals(1, group.getOptions().size());
        assertEquals(option, group.getOptions().iterator().next());
    }

    @Test
    public void testAddOptionToNonEmptyGroup() {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("test1", false, "description");
        Option option2 = new Option("test2", false, "description");
        group.addOption(option1);
        group.addOption(option2);
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getOptions().contains(option1));
        assertTrue(group.getOptions().contains(option2));
    }

    @Test
    public void testAddOptionWithDuplicateName() {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("test", false, "description");
        Option option2 = new Option("test", false, "description");
        group.addOption(option1);
        group.addOption(option2);
        assertEquals(1, group.getOptions().size());
        assertEquals(option1, group.getOptions().iterator().next());
    }
}