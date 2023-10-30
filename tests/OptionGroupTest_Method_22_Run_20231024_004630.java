package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OptionGroupTest_Method_22_Run_20231024_004630 {
    @Test
    public void testIsRequired() {
        OptionGroup group = new OptionGroup();
        assertFalse(group.isRequired());

        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("option1");
        group.addOption(option1);
        assertFalse(group.isRequired());

        Option option2 = mock(Option.class);
        when(option2.getKey()).thenReturn("option2");
        group.addOption(option2);
        assertFalse(group.isRequired());

        group.setRequired(true);
        assertTrue(group.isRequired());
    }
}