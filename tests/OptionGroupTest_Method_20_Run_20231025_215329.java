package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_20_Run_20231025_215329 {
    @Test
    public void testGetOptionsWithEmptyMap() {
        OptionGroup group = new OptionGroup();
        assertTrue(group.getOptions().isEmpty());
    }

    @Test
    public void testGetOptionsWithOneOption() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("option1", "description1");
        group.addOption(option);
        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(option));
    }

    @Test
    public void testGetOptionsWithMultipleOptions() {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("option1", "description1");
        Option option2 = new Option("option2", "description2");
        group.addOption(option1);
        group.addOption(option2);
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getOptions().contains(option1));
        assertTrue(group.getOptions().contains(option2));
    }
}