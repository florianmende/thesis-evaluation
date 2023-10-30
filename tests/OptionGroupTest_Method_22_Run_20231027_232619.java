package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionGroupTest_Method_22_Run_20231027_232619 {
    @Test
    public void testIsRequiredWhenRequired() {
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Mockito.when(group.isRequired()).thenReturn(true);
        Assertions.assertTrue(group.isRequired());
    }

    @Test
    public void testIsRequiredWhenNotRequired() {
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Mockito.when(group.isRequired()).thenReturn(false);
        Assertions.assertFalse(group.isRequired());
    }

    @Test
    public void testIsRequiredWhenNull() {
        OptionGroup group = null;
        Assertions.assertThrows(NullPointerException.class, () -> group.isRequired());
    }
}