package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_96_Run_20231024_004630 {

    private Option option;

    @BeforeEach
    public void setup() {
        option = mock(Option.class);
        when(option.hasOptionalArg()).thenCallRealMethod();
    }

    @Test
    public void testHasOptionalArg_false() {
        assertFalse(option.hasOptionalArg());
    }

    @Test
    public void testHasOptionalArg_true() {
        when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasOptionalArg());
    }

    @Test
    public void testHasOptionalArg_null() {
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());
    }
}