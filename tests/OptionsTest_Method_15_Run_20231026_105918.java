package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_15_Run_20231026_105918 {

    @Test
    public void testHasShortOptionWithValidExistingOption() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("a");
        options.addOption(option);
        assertTrue(options.hasShortOption("a"));
    }

    @Test
    public void testHasShortOptionWithValidNonExistingOption() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("a");
        options.addOption(option);
        assertFalse(options.hasShortOption("b"));
    }

    @Test
    public void testHasShortOptionWithInvalidOption() {
        Options options = new Options();
        assertFalse(options.hasShortOption(null));
    }
}