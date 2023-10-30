package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_98_Run_20231025_100630 {

    @Test
    public void testIsRequired_required() {
        Option option = mock(Option.class);
        when(option.isRequired()).thenReturn(true);
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_notRequired() {
        Option option = mock(Option.class);
        when(option.isRequired()).thenReturn(false);
        assertFalse(option.isRequired());
    }

    @Test
    public void testIsRequired_requiredButReturnsFalse() {
        Option option = mock(Option.class);
        when(option.isRequired()).thenReturn(true);
        assertTrue(option.isRequired());
    }
}