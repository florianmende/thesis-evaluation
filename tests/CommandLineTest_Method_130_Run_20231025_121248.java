package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_130_Run_20231025_121248 {

    @Test
    public void testGetArgsWithNoArguments() {
        CommandLine commandLine = new CommandLine();
        String[] args = commandLine.getArgs();
        assertEquals(0, args.length);
    }

    @Test
    public void testGetArgsWithArguments() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[]{"arg1", "arg2"}, args);
    }

    @Test
    public void testGetArgsWithRecognizedOptions() {
        CommandLine commandLine = new CommandLine();
        Options options = new Options();
        Option option1 = new Option("option1", "option1 description");
        Option option2 = new Option("option2", "option2 description");
        options.addOption(option1);
        options.addOption(option2);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        String[] args = commandLine.getArgs();
        assertEquals(0, args.length);
    }

    @Test
    public void testGetArgsWithUnrecognizedOptions() {
        CommandLine commandLine = new CommandLine();
        Options options = new Options();
        Option option1 = new Option("option1", "option1 description");
        Option option2 = new Option("option2", "option2 description");
        options.addOption(option1);
        options.addOption(option2);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[]{"arg1", "arg2"}, args);
    }
}