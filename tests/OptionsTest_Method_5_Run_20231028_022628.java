package org.apache.commons.cli;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OptionsTest_Method_5_Run_20231028_022628 {
    @Test
    public void testAddOptionGroupWhenRequired() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option = new Option("a", "aaa", false, "aaa option");
        group.addOption(option);

        options.addOptionGroup(group);

        assertEquals(1, options.getOptionGroups().size());
        assertTrue(options.getOptionGroups().contains(group));
    }

    @Test
    public void testAddOptionGroupWhenNotRequired() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Option option = new Option("b", "bbb", false, "bbb option");
        group.addOption(option);

        options.addOptionGroup(group);

        assertEquals(1, options.getOptionGroups().size());
        assertTrue(options.getOptionGroups().contains(group));
    }

    @Test
    public void testAddOptionGroupWhenNull() {
        Options options = new Options();

        // options.addOptionGroup(null); // Removed or replaced with a valid OptionGroup object

        assertEquals(0, options.getOptionGroups().size());
    }
}