package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionGroupTest_Method_21_Run_20231028_012625 {

    @Test
    public void testGetSelected() {
        // Case 1: The method should return the name of the selected option when an option is selected.
        OptionGroup optionGroup = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option1");
        optionGroup.addOption(option);
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // handle exception
        }
        assertEquals("option1", optionGroup.getSelected());

        // Case 2: The method should return null when no option is selected.
        optionGroup = new OptionGroup();
        assertNull(optionGroup.getSelected());

        // Case 3: The method should throw an AlreadySelectedException when an option is selected, and another option is selected.
        optionGroup = new OptionGroup();
        option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option1");
        optionGroup.addOption(option);
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // handle exception
        }
        Option anotherOption = Mockito.mock(Option.class);
        Mockito.when(anotherOption.getKey()).thenReturn("option2");
        optionGroup.addOption(anotherOption);
        try {
            optionGroup.setSelected(anotherOption);
        } catch (AlreadySelectedException e) {
            // handle exception
        }
    }
}