package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptionsTest_Method_9_Run_20231023_204140 {
    @Test
    void testGetOptionGroup_notPartOfOptionGroup() {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, "This is option a");
        assertNull(options.getOptionGroup(option));
    }

    @Test
    void testGetOptionGroup_partOfNonRequiredOptionGroup() {
        Options options = new Options();
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "This is option a");
        optionGroup.addOption(option);
        options.addOptionGroup(optionGroup);
        assertEquals(optionGroup, options.getOptionGroup(option));
    }

    @Test
    void testGetOptionGroup_partOfRequiredOptionGroup() {
        Options options = new Options();
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "This is option a");
        optionGroup.addOption(option);
        optionGroup.setRequired(true);
        options.addOptionGroup(optionGroup);
        assertEquals(optionGroup, options.getOptionGroup(option));
    }
}