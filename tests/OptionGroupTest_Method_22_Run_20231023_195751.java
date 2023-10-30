package org.apache.commons.cli;

import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionGroupTest_Method_22_Run_20231023_195751 {
    @Test
    public void testIsRequired() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());

        optionGroup.setRequired(false);
        assertFalse(optionGroup.isRequired());

        optionGroup.setRequired(true);
        assertEquals(optionGroup.isRequired(), true);
    }
}