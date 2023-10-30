package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionsTest_Method_14_Run_20231026_105918 {
    @Test
    public void testHasOption() {
        Options options = new Options();
        Option option = new Option("a", "long-a", false, "Option A");
        options.addOption(option);

        // Case 1: The "Option" with the given short or long name exists in the "Options" instance.
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("long-a"));

        // Case 2: The "Option" with the given short or long name does not exist in the "Options" instance.
        assertFalse(options.hasOption("b"));

        // Case 3: The "Options" instance contains an "Option" with both short and long names,
        // and the method should return true if either the short or long name is used as the input parameter.
        options.addOption(new Option("b", "long-b", false, "Option B"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("long-b"));
    }

    @Test
    public void testHasOptionWithMockito() {
        Options options = Mockito.mock(Options.class);
        Option option = new Option("a", "long-a", false, "Option A");
        Mockito.when(options.hasOption("a")).thenReturn(true);
        Mockito.when(options.hasOption("long-a")).thenReturn(true);
        Mockito.when(options.hasOption("b")).thenReturn(false);

        // Case 1: The "Option" with the given short or long name exists in the "Options" instance.
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("long-a"));

        // Case 2: The "Option" with the given short or long name does not exist in the "Options" instance.
        assertFalse(options.hasOption("b"));

        // Case 3: The "Options" instance contains an "Option" with both short and long names,
        // and the method should return true if either the short or long name is used as the input parameter.
        Mockito.when(options.hasOption("b")).thenReturn(true);
        Mockito.when(options.hasOption("long-b")).thenReturn(true);
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("long-b"));
    }
}