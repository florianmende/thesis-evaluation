package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_92_Run_20231028_022628 {
    @Test
    public void testHasArgs_MultipleValues() {
        Option option = mock(Option.class);
        when(option.hasArgs()).thenReturn(true);
        assertTrue(option.hasArgs());
    }

    @Test
    public void testHasArgs_SingleValue() {
        Option option = mock(Option.class);
        when(option.hasArgs()).thenReturn(false);
        assertFalse(option.hasArgs());
    }

    @Test
    public void testHasArgs_NoValues() {
        Option option = mock(Option.class);
        when(option.hasArgs()).thenReturn(false);
        assertFalse(option.hasArgs());
    }
}