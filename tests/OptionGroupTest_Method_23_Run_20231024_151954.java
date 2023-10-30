package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionGroupTest_Method_23_Run_20231024_151954 {
    @Test
    public void testSetRequiredTrue() {
        OptionGroup optionGroup = Mockito.mock(OptionGroup.class);
        Mockito.when(optionGroup.isRequired()).thenReturn(true);
        optionGroup.setRequired(true);
        Assertions.assertTrue(optionGroup.isRequired());
    }

    @Test
    public void testSetRequiredFalse() {
        OptionGroup optionGroup = Mockito.mock(OptionGroup.class);
        Mockito.when(optionGroup.isRequired()).thenReturn(false);
        optionGroup.setRequired(false);
        Assertions.assertFalse(optionGroup.isRequired());
    }

    @Test
    public void testSetRequiredUnchanged() {
        OptionGroup optionGroup = Mockito.mock(OptionGroup.class);
        Mockito.when(optionGroup.isRequired()).thenReturn(true);
        optionGroup.setRequired(true);
        Assertions.assertTrue(optionGroup.isRequired());
        Mockito.when(optionGroup.isRequired()).thenReturn(false);
        optionGroup.setRequired(false);
        Assertions.assertFalse(optionGroup.isRequired());
    }
}