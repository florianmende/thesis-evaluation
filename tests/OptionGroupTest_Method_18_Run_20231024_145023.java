package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_18_Run_20231024_145023 {
    private OptionGroup optionGroup;

    @Test
    public void testAddOptionToEmptyGroup() {
        // Create an empty option group
        optionGroup = new OptionGroup();

        // Create a mock option
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("testOption");

        // Add the option to the group
        optionGroup.addOption(option);

        // Verify that the option was added to the group
        assertEquals(1, optionGroup.getOptions().size());
        assertTrue(optionGroup.getOptions().contains(option));
    }

    @Test
    public void testAddOptionToNonEmptyGroup() {
        // Create a non-empty option group
        optionGroup = new OptionGroup();
        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("testOption1");
        optionGroup.addOption(option1);

        // Create a mock option
        Option option2 = mock(Option.class);
        when(option2.getKey()).thenReturn("testOption2");

        // Add the option to the group
        optionGroup.addOption(option2);

        // Verify that the option was added to the group
        assertEquals(2, optionGroup.getOptions().size());
        assertTrue(optionGroup.getOptions().contains(option1));
        assertTrue(optionGroup.getOptions().contains(option2));
    }

    @Test
    public void testAddDuplicateOption() {
        // Create an empty option group
        optionGroup = new OptionGroup();

        // Create a mock option
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("testOption");

        // Add the option to the group twice
        optionGroup.addOption(option);
        optionGroup.addOption(option);

        // Verify that the option was only added once
        assertEquals(1, optionGroup.getOptions().size());
        assertTrue(optionGroup.getOptions().contains(option));
    }
}