package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionsTest_Method_3_Run_20231024_004630 {
    @Test
    public void testAddOptionWithShortNameOnly() {
        Options options = new Options();
        options.addOption("a", false, "description");
        assertTrue(options.hasOption("a"));
        assertFalse(options.hasOption("b"));
        assertEquals("description", options.getOption("a").getDescription());
    }

    @Test
    public void testAddOptionWithLongNameOnly() {
        Options options = new Options();
        options.addOption("a", "long-name", false, "description");
        assertTrue(options.hasOption("a"));
        assertFalse(options.hasOption("b"));
        assertEquals("description", options.getOption("a").getDescription());
    }

    @Test
    public void testAddOptionWithShortAndLongName() {
        Options options = new Options();
        options.addOption("a", "long-name", false, "description");
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("long-name"));
        assertEquals("description", options.getOption("a").getDescription());
    }
}