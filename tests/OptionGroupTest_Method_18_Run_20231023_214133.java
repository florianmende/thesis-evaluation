package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptionGroupTest_Method_18_Run_20231023_214133 {
    @Test
    void testAddOption() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("name", "description");
        optionGroup.addOption(option);
        assertEquals(1, optionGroup.getOptions().size());
    }

    @Test
    void testAddOptionWhenOptionGroupIsNotEmpty() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("name1", "description1");
        Option option2 = new Option("name2", "description2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        assertEquals(2, optionGroup.getOptions().size());
    }

    @Test
    void testAddOptionWhenOptionIsNull() {
        OptionGroup optionGroup = new OptionGroup();
        assertThrows(NullPointerException.class, () -> optionGroup.addOption(null));
    }
}