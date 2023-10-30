package org.apache.commons.cli;


import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlreadySelectedExceptionTest_Method_154_Run_20231025_100630 {

    @Test
    public void testGetOptionGroupWithValidSelectedGroup() {
        // Create a mock OptionGroup object that has already been selected
        OptionGroup group = Mockito.mock(OptionGroup.class);

        // Create a mock Option object that belongs to the selected group
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("testOption");

        // Create an AlreadySelectedException object with the mock OptionGroup and Option objects
        AlreadySelectedException exception = new AlreadySelectedException(group, option);

        // Test that the getOptionGroup() method returns the correct option group
        assertEquals(group, exception.getOptionGroup());
    }

    @Test
    public void testGetOptionGroupWithValidUnselectedGroup() {
        // Create a mock OptionGroup object that has not been selected
        OptionGroup group = Mockito.mock(OptionGroup.class);

        // Create a mock Option object that belongs to the unselected group
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("testOption");

        // Create an AlreadySelectedException object with the mock OptionGroup and Option objects
        AlreadySelectedException exception = new AlreadySelectedException(group, option);

        // Test that the getOptionGroup() method returns the correct option group
        assertEquals(group, exception.getOptionGroup());
    }
}