package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionsTest_Method_15_Run_20231024_060930 {
    @Test
    public void testHasShortOption() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasShortOption("opt")).thenReturn(true);
        Assertions.assertTrue(options.hasShortOption("opt"));
    }

    @Test
    public void testHasShortOption_notMember() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasShortOption("opt")).thenReturn(false);
        Assertions.assertFalse(options.hasShortOption("opt"));
    }

    @Test
    public void testHasShortOption_notRequired() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasShortOption("opt")).thenReturn(true);
        Assertions.assertTrue(options.hasShortOption("opt"));
    }
}