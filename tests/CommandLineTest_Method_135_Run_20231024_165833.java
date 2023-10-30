package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_135_Run_20231024_165833 {

    @Test
    void testGetOptionsEmpty() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    void testGetOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("option1", "description1");
        Option option2 = new Option("option2", "description2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);
        assertTrue(options[0].equals(option1));
        assertTrue(options[1].equals(option2));
    }

    @Test
    void testGetOptionsOrder() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("option1", "description1");
        Option option2 = new Option("option2", "description2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);
        assertTrue(options[0].equals(option1));
        assertTrue(options[1].equals(option2));
    }
}