package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_135_Run_20231030_094427 {

    @Test
    public void testGetOptionsEmpty() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptionsOneOption() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "alpha", false, "Alpha option");
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(1, options.length);
        assertEquals(option, options[0]);
    }

    @Test
    public void testGetOptionsMultipleOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("a", "alpha", false, "Alpha option");
        Option option2 = new Option("b", "beta", false, "Beta option");
        Option option3 = new Option("c", "charlie", false, "Charlie option");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addOption(option3);
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(3, options.length);
        assertArrayEquals(new Option[] { option1, option2, option3 }, options);
    }
}