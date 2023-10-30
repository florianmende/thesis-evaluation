package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionGroupTest_Method_18_Run_20231025_105031 {
    @Test
    public void testAddOption() {
        // create a mock option
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option");

        // create an option group
        OptionGroup group = new OptionGroup();

        // add the option to the group
        OptionGroup result = group.addOption(option);

        // assert that the option was added to the group
        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(option));

        // assert that the group was returned
        assertEquals(group, result);
    }

    @Test
    public void testAddOptionTwice() {
        // create a mock option
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option");

        // create an option group
        OptionGroup group = new OptionGroup();

        // add the option to the group twice
        group.addOption(option);
        group.addOption(option);

        // assert that the option was only added once
        assertEquals(1, group.getOptions().size());

        // assert that the group was returned
        assertEquals(group, group.addOption(option));
    }

    @Test
    public void testAddNullOption() {
        // create an option group
        OptionGroup group = new OptionGroup();

        // add a null option to the group
        assertThrows(NullPointerException.class, () -> group.addOption(null));
    }
}