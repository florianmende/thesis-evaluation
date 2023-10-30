package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionTest_Method_98_Run_20231028_032631 {
    @Test
    public void testIsRequired() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.isRequired()).thenReturn(true);
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsNotRequired() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.isRequired()).thenReturn(false);
        assertFalse(option.isRequired());
    }
}