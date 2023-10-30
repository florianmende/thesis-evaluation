package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OptionsTest_Method_4_Run_20231024_165833 {
    @Test
    public void testAddOption() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("option");
        options.addOption(option);
        assertTrue(options.getOptions().contains(option));
    }

    @Test
    public void testAddOptionWithShortAndLongName() {
        Options options = new Options();
        Option option = new Option("s", "long", false, "description");
        options.addOption(option);
        assertEquals("s", option.getOpt());
        assertEquals("long", option.getLongOpt());
        assertEquals("description", option.getDescription());
        assertTrue(options.getOptions().contains(option));
    }

    @Test
    public void testAddOptionWithShortAndLongNameAndArgument() {
        Options options = new Options();
        Option option = new Option("s", "long", true, "description");
        options.addOption(option);
        assertEquals("s", option.getOpt());
        assertEquals("long", option.getLongOpt());
        assertEquals("description", option.getDescription());
        assertTrue(option.hasArg());
        assertTrue(options.getOptions().contains(option));
    }

    @Test
    public void testAddOptionWithShortAndLongNameAndRequired() {
        Options options = new Options();
        Option option = new Option("s", "long", false, "description");
        option.setRequired(true);
        options.addOption(option);
        assertEquals("s", option.getOpt());
        assertEquals("long", option.getLongOpt());
        assertEquals("description", option.getDescription());
        assertTrue(option.isRequired());
        assertTrue(options.getOptions().contains(option));
    }
}