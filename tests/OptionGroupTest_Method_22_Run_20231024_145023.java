package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionGroupTest_Method_22_Run_20231024_145023 {
    @Test
    public void testIsRequired() {
        // create an option group and set the required field to true
        OptionGroup group = new OptionGroup();
        group.setRequired(true);

        // test that the group is required
        Assertions.assertTrue(group.isRequired());

        // create an option group and set the required field to false
        group = new OptionGroup();
        group.setRequired(false);

        // test that the group is not required
        Assertions.assertFalse(group.isRequired());

        // test that the group is null
        Assertions.assertThrows(NullPointerException.class, () -> {
            OptionGroup nullGroup = null;
            nullGroup.isRequired();
        });
    }
}