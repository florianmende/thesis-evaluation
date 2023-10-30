package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class OptionTest_Method_91_Run_20231028_042634 {
    @Test
    void testHasArgName() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());

        when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }
}