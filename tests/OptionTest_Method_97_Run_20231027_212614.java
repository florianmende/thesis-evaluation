package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_97_Run_20231027_212614 {
    @Test
    public void testHasValueSeparator() {
        Option option = mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(true);
        assertTrue(option.hasValueSeparator());

        option = mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(false);
        assertFalse(option.hasValueSeparator());
    }
}