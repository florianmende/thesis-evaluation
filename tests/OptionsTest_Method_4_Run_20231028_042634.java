package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_4_Run_20231028_042634 {
    private Options options;

    @BeforeEach
    public void setUp() {
        options = new Options();
    }

    @Test
    public void testAddOptionWithShortNameAndLongName() {
        String shortName = "s";
        String longName = "long";
        boolean hasArg = true;
        String description = "description";

        options.addOption(shortName, longName, hasArg, description);

        assertEquals(1, options.getOptions().size());
        Iterator<Option> iterator = options.getOptions().iterator();
        Option option = iterator.next();
        assertEquals(shortName, option.getOpt());
        assertEquals(longName, option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals(description, option.getDescription());
    }

    @Test
    public void testAddOptionWithShortNameAndLongNameAndArg() {
        String shortName = "s";
        String longName = "long";
        boolean hasArg = true;
        String description = "description";

        options.addOption(shortName, longName, hasArg, description);

        assertEquals(1, options.getOptions().size());
        Iterator<Option> iterator = options.getOptions().iterator();
        Option option = iterator.next();
        assertEquals(shortName, option.getOpt());
        assertEquals(longName, option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals(description, option.getDescription());
    }

    @Test
    public void testAddRequiredOption() {
        String shortName = "s";
        String longName = "long";
        boolean hasArg = true;
        String description = "description";

        options.addRequiredOption(shortName, longName, hasArg, description);

        assertEquals(1, options.getOptions().size());
        Iterator<Option> iterator = options.getOptions().iterator();
        Option option = iterator.next();
        assertEquals(shortName, option.getOpt());
        assertEquals(longName, option.getLongOpt());
        assertTrue(option.isRequired());
        assertTrue(option.hasArg());
        assertEquals(description, option.getDescription());
    }
}