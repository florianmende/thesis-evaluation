package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OptionGroupTest_Method_21_Run_20231025_125643 {
    @Test
    void testGetSelected() throws AlreadySelectedException {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("opt1", "Option 1");
        Option option2 = new Option("opt2", "Option 2");

        group.addOption(option1);
        group.addOption(option2);

        // Case 1: The method returns the correct option name when an option is selected
        group.setSelected(option1);
        assertEquals("opt1", group.getSelected());

        // Case 2: The method returns null when no option is selected
        group.setSelected(null);
        assertNull(group.getSelected());

        // Case 3: The method throws an AlreadySelectedException when an option is already selected and a new option is tried to be selected
        group.setSelected(option2);
        assertThrows(AlreadySelectedException.class, () -> group.setSelected(option1));
    }
}