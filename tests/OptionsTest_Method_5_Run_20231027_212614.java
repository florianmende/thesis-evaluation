package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionsTest_Method_5_Run_20231027_212614 {
    @Test
    public void testAddOptionGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option = new Option("test", "test option");
        group.addOption(option);

        options.addOptionGroup(group);

        Assertions.assertEquals(1, options.getOptionGroups().size());
        Assertions.assertTrue(options.getOptionGroups().contains(group));
    }

    @Test
    public void testAddOptionGroupRequired() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option = new Option("test", "test option");
        group.addOption(option);

        options.addOptionGroup(group);

        Assertions.assertEquals(1, options.getOptionGroups().size());
        Assertions.assertTrue(options.getOptionGroups().contains(group));
        Assertions.assertTrue(options.getRequiredOptions().contains(group));
    }

    @Test
    public void testAddOptionGroupSetsRequiredToFalse() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option = new Option("test", "test option");
        option.setRequired(true);
        group.addOption(option);

        options.addOptionGroup(group);

        Assertions.assertFalse(option.isRequired());
    }
}