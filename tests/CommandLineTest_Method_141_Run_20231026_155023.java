package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommandLineTest_Method_141_Run_20231026_155023 {

    @Test
    public void testGetOptionValue_defaultValue() {
        CommandLine commandLine = new CommandLine();
        String defaultValue = "default";
        String optionValue = commandLine.getOptionValue("option", defaultValue);
        assertEquals(defaultValue, optionValue);
    }

    @Test
    public void testGetOptionValue_withArgument() {
        CommandLine commandLine = new CommandLine();
        String optionValue = commandLine.getOptionValue("option", "value");
        assertEquals("value", optionValue);
    }

    @Test
    public void testGetOptionValue_withoutArgument() {
        CommandLine commandLine = new CommandLine();
        String optionValue = commandLine.getOptionValue("option");
        assertNull(optionValue);
    }
}