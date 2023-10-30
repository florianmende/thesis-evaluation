package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_96_Run_20231024_060930 {

    @Test
    public void testHasOptionalArg() {
        Option option = mock(Option.class);
        when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasOptionalArg());
    }

    @Test
    public void testDoesNotHaveOptionalArg() {
        Option option = mock(Option.class);
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());
    }

    @Test
    public void testHasRequiredArg() {
        Option option = mock(Option.class);
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());
    }
}