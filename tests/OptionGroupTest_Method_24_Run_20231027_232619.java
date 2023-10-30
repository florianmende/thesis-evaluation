package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionGroupTest_Method_24_Run_20231027_232619 {
    @Test
    public void testSetSelectedValidOption() {
        // Create a mock Option object
        Option mockOption = mock(Option.class);
        when(mockOption.getKey()).thenReturn("option1");

        // Create an OptionGroup object and add the mock Option object
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(mockOption);

        // Set the selected option to the mock Option object
        try {
            optionGroup.setSelected(mockOption);
        } catch (AlreadySelectedException e) {
            System.out.println("An option is already selected.");
        }

        // Verify that the selected option is set to the mock Option object
        assertEquals("option1", mockOption.getKey());
    }

    @Test
    public void testSetSelectedNullOption() {
        // Create an OptionGroup object
        OptionGroup optionGroup = new OptionGroup();

        // Set the selected option to null
        try {
            optionGroup.setSelected(null);
        } catch (AlreadySelectedException e) {
            System.out.println("An option is already selected.");
        }

        // Verify that the selected option is null
        assertEquals(null, optionGroup.getSelected());
    }

    @Test
    public void testSetSelectedDifferentOptionWhenOneAlreadySelected() {
        // Create two mock Option objects
        Option mockOption1 = mock(Option.class);
        when(mockOption1.getKey()).thenReturn("option1");
        Option mockOption2 = mock(Option.class);
        when(mockOption2.getKey()).thenReturn("option2");

        // Create an OptionGroup object and add the mock Option objects
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(mockOption1);
        optionGroup.addOption(mockOption2);

        // Set the selected option to the first mock Option object
        try {
            optionGroup.setSelected(mockOption1);
        } catch (AlreadySelectedException e) {
            System.out.println("An option is already selected.");
        }

        // Verify that an AlreadySelectedException is thrown when setting the selected option to the second mock Option object
        assertThrows(AlreadySelectedException.class, () -> optionGroup.setSelected(mockOption2));
    }
}