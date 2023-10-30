package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionGroupTest_Method_24_Run_20231025_125643 {
    @Test
    public void testSetSelected() {
        OptionGroup group = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option1");

        // Test that the method sets the selected option correctly
        // when no option has been selected before
        try {
            group.setSelected(option);
            Assertions.assertEquals("option1", group.getSelected());
        } catch (AlreadySelectedException e) {
            Assertions.fail("Unexpected AlreadySelectedException thrown");
        }

        // Test that the method throws an AlreadySelectedException
        // when an option has already been selected and a different
        // option is being selected
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option2.getKey()).thenReturn("option2");
        try {
            group.setSelected(option2);
            Assertions.fail("Expected AlreadySelectedException not thrown");
        } catch (AlreadySelectedException e) {
            Assertions.assertEquals("option1", group.getSelected());
        }

        // Test that the method resets the selected option to null
        // when the selected option is being set to null
        try {
            group.setSelected(null);
            Assertions.assertNull(group.getSelected());
        } catch (AlreadySelectedException e) {
            Assertions.fail("Unexpected AlreadySelectedException thrown");
        }
    }
}