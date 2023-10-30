package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_98_Run_20231027_212614 {
    @Test
    public void testIsRequired() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.isRequired()).thenReturn(true);
        assertTrue(option.isRequired());

        Mockito.when(option.isRequired()).thenReturn(false);
        assertFalse(option.isRequired());
    }
}