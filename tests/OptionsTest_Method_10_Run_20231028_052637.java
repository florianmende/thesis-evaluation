package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_10_Run_20231028_052637 {

    @Test
    public void testGetOptionGroups_Empty() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertTrue(optionGroups.isEmpty());
    }

    @Test
    public void testGetOptionGroups_OneOptionGroup() {
        Options options = new Options();
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "aaa");
        optionGroup.addOption(option);
        options.addOptionGroup(optionGroup);
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertEquals(1, optionGroups.size());
        assertTrue(optionGroups.contains(optionGroup));
    }

    @Test
    public void testGetOptionGroups_MultipleOptionGroups() {
        Options options = new Options();
        OptionGroup optionGroup1 = new OptionGroup();
        Option option1 = new Option("a", "aaa");
        optionGroup1.addOption(option1);
        options.addOptionGroup(optionGroup1);
        OptionGroup optionGroup2 = new OptionGroup();
        Option option2 = new Option("b", "bbb");
        optionGroup2.addOption(option2);
        options.addOptionGroup(optionGroup2);
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertEquals(2, optionGroups.size());
        assertTrue(optionGroups.contains(optionGroup1));
        assertTrue(optionGroups.contains(optionGroup2));
    }
}