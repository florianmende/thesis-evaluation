package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionGroupTest_Method_22_Run_20231027_212614 {
    @Test
    public void testIsRequiredTrue() {
        // Create a mock option group with the required field set to true
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Mockito.when(group.isRequired()).thenReturn(true);

        // Verify that the method returns true
        assertTrue(group.isRequired());
    }

    @Test
    public void testIsRequiredFalse() {
        // Create a mock option group with the required field set to false
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Mockito.when(group.isRequired()).thenReturn(false);

        // Verify that the method returns false
        assertFalse(group.isRequired());
    }

    @Test
    public void testIsRequiredWhenRequiredFieldNotSet() {
        // Create a mock option group with the required field not set
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Mockito.when(group.isRequired()).thenReturn(false);

        // Verify that the method returns false
        assertFalse(group.isRequired());
    }
}