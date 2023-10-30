package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionsTest_Method_14_Run_20231023_214133 {
    @Test
    public void testHasOption() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasOption("h")).thenReturn(true);
        Mockito.when(options.hasOption("help")).thenReturn(true);
        Mockito.when(options.hasOption("version")).thenReturn(false);

        Assertions.assertTrue(options.hasOption("h"));
        Assertions.assertTrue(options.hasOption("help"));
        Assertions.assertFalse(options.hasOption("version"));
    }
}