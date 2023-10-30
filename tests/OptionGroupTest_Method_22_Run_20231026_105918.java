package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_22_Run_20231026_105918 {

    @Test
    public void testIsRequired() {
        OptionGroup group = new OptionGroup();

        // Case 1: The OptionGroup is required
        group.setRequired(true);
        assertTrue(group.isRequired());

        // Case 2: The OptionGroup is not required
        group.setRequired(false);
        assertFalse(group.isRequired());

        // Case 3: The OptionGroup is required, but one of its options is not required
        Option option = mock(Option.class);
        when(option.isRequired()).thenReturn(false);
        group.addOption(option);
        group.setRequired(true);
        assertTrue(group.isRequired());
    }
}