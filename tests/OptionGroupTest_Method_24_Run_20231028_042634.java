package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionGroupTest_Method_24_Run_20231028_042634 {
    @Test
    public void testSetSelected() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("option1", "description1");
        Option option2 = new Option("option2", "description2");

        // Case 1: Set the selected option to the provided option if no option has been selected before.
        group.setSelected(option1);
        Assertions.assertEquals(option1.getKey(), group.getSelected());

        // Case 2: Throw an AlreadySelectedException if an option from the same group has already been selected.
        Assertions.assertThrows(AlreadySelectedException.class, () -> group.setSelected(option2));

        // Case 3: Reset the selected option to null if the provided option is null.
        group.setSelected(null);
        Assertions.assertNull(group.getSelected());
    }
}