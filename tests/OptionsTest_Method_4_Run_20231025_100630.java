package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OptionsTest_Method_4_Run_20231025_100630 {
    @Test
    void testAddOptionWithShortAndLongName() {
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOption("a");
        assertEquals("a", option.getOpt());
        assertEquals("apple", option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    void testAddOptionWithShortNameOnly() {
        Options options = new Options();
        options.addOption("a", null, true, "description");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOption("a");
        assertEquals("a", option.getOpt());
        assertNull(option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    void testAddOptionWithLongNameOnly() {
        Options options = new Options();
        options.addOption(null, "apple", true, "description");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOption("apple");
        assertNull(option.getOpt());
        assertEquals("apple", option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }
}