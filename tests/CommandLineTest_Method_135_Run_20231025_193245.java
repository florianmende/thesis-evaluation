package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_135_Run_20231025_193245 {

    @Test
    public void testGetOptionsEmpty() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("a", "aaa");
        Option option2 = new Option("b", "bbb");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);
        assertEquals(option1, options[0]);
        assertEquals(option2, options[1]);
    }

    @Test
    public void testGetOptionsOrder() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("a", "aaa");
        Option option2 = new Option("b", "bbb");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);
        assertEquals(option1, options[0]);
        assertEquals(option2, options[1]);
    }
}