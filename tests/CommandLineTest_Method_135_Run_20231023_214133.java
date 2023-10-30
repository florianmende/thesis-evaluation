package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineTest_Method_135_Run_20231023_214133 {

    @Test
    public void testGetOptionsEmpty() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptionsSingle() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "description");
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertEquals(1, options.length);
        assertEquals(option, options[0]);
    }

    @Test
    public void testGetOptionsMultiple() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("option1", "description1");
        Option option2 = new Option("option2", "description2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);
        assertEquals(option1, options[0]);
        assertEquals(option2, options[1]);
    }
}