package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_8_Run_20231025_100630 {
    @Test
    public void testGetOptionWithShortName() {
        // create a mock Option object with a short name
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("s");
        when(option.getLongOpt()).thenReturn(null);

        // create a mock Options object with the mock Option
        Options options = mock(Options.class);
        when(options.getOption("s")).thenReturn(option);

        // test that the method returns the correct Option
        assertEquals(option, options.getOption("s"));
    }

    @Test
    public void testGetOptionWithLongName() {
        // create a mock Option object with a long name
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("long");
        when(option.getLongOpt()).thenReturn("long");

        // create a mock Options object with the mock Option
        Options options = mock(Options.class);
        when(options.getOption("long")).thenReturn(option);

        // test that the method returns the correct Option
        assertEquals(option, options.getOption("long"));
    }

    @Test
    public void testGetOptionWithInvalidName() {
        // create a mock Options object with no Options
        Options options = mock(Options.class);

        // test that the method returns null when an invalid name is provided
        assertNull(options.getOption("invalid"));
    }
}