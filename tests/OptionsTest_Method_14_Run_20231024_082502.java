package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionsTest_Method_14_Run_20231024_082502 {
    @Test
    public void testHasOptionWhenOptionIsMemberOfOptions() {
        // Create a mock Option object
        Option option = Mockito.mock(Option.class);

        // Create a mock Options object that contains the mock Option object
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasOption(option.getOpt())).thenReturn(true);

        // Call the hasOption method with the mock Option object
        boolean result = options.hasOption(option.getOpt());

        // Verify that the result is true
        assertTrue(result);
    }

    @Test
    public void testHasOptionWhenOptionIsNotMemberOfOptions() {
        // Create a mock Option object
        Option option = Mockito.mock(Option.class);

        // Create a mock Options object that does not contain the mock Option object
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasOption(option.getOpt())).thenReturn(false);

        // Call the hasOption method with the mock Option object
        boolean result = options.hasOption(option.getOpt());

        // Verify that the result is false
        assertFalse(result);
    }

    @Test
    public void testHasOptionWhenOptionIsMemberOfOptionsButNotSameInstance() {
        // Create a mock Option object
        Option option = Mockito.mock(Option.class);

        // Create a mock Options object that contains a different instance of the mock Option object
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.hasOption(option.getOpt())).thenReturn(true);

        // Call the hasOption method with the mock Option object
        boolean result = options.hasOption(option.getOpt());

        // Verify that the result is true
        assertTrue(result);
    }
}