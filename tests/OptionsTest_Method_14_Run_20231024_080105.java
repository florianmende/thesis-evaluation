package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionsTest_Method_14_Run_20231024_080105 {
    @Test
    public void testHasOptionShort() {
        // Set up mock Options object with short option
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasOption("-s")).thenReturn(true);

        // Test that hasOption returns true for short option
        assertTrue(options.hasOption("-s"));
    }

    @Test
    public void testHasOptionLong() {
        // Set up mock Options object with long option
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasOption("--long")).thenReturn(true);

        // Test that hasOption returns true for long option
        assertTrue(options.hasOption("--long"));
    }

    @Test
    public void testHasOptionNone() {
        // Set up mock Options object with no options
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasOption("-n")).thenReturn(false);

        // Test that hasOption returns false for non-existent option
        assertFalse(options.hasOption("-n"));
    }
}