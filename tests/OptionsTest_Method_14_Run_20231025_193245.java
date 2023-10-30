package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OptionsTest_Method_14_Run_20231025_193245 {
    @Test
    public void testHasOptionShort() {
        Options options = new Options();
        Option shortOption = mock(Option.class);
        when(shortOption.getKey()).thenReturn("a");
        options.addOption(shortOption);
        assertTrue(options.hasOption("a"));
    }

    @Test
    public void testHasOptionLong() {
        Options options = new Options();
        Option longOption = mock(Option.class);
        when(longOption.getKey()).thenReturn("long");
        options.addOption(longOption);
        assertTrue(options.hasOption("long"));
    }

    @Test
    public void testHasOptionNotFound() {
        Options options = new Options();
        assertFalse(options.hasOption("notFound"));
    }
}