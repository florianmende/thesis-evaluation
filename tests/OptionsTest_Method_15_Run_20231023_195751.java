package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionsTest_Method_15_Run_20231023_195751 {
    @Test
    public void testHasShortOption() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasShortOption("-h")).thenReturn(true);
        assertTrue(options.hasShortOption("-h"));
    }

    @Test
    public void testHasShortOptionInvalid() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasShortOption("-x")).thenReturn(false);
        assertFalse(options.hasShortOption("-x"));
    }

    @Test
    public void testHasShortOptionLong() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasShortOption("--help")).thenReturn(false);
        assertFalse(options.hasShortOption("--help"));
    }
}