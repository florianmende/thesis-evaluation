package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_22_Run_20231024_082502 {

    @Test
    void testIsRequired() {
        OptionGroup optionGroup = new OptionGroup();

        // Case 1: The option group is required.
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());

        // Case 2: The option group is not required.
        optionGroup.setRequired(false);
        assertFalse(optionGroup.isRequired());

        // Case 3: The option group is required, but there are no options in it.
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());
    }
}