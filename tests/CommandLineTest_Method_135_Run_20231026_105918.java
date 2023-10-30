package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_135_Run_20231026_105918 {

    @Test
    public void testGetOptions_EmptyList() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[0], options);
    }

    @Test
    public void testGetOptions_OneOption() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        when(option.getOpt()).thenReturn("option1");
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[] {option}, options);
    }

    @Test
    public void testGetOptions_MultipleOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        when(option1.getOpt()).thenReturn("option1");
        Option option2 = Mockito.mock(Option.class);
        when(option2.getOpt()).thenReturn("option2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[] {option1, option2}, options);
    }

    @Test
    public void testGetOptions_MixedOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        when(option1.getOpt()).thenReturn("option1");
        Option option2 = Mockito.mock(Option.class);
        when(option2.getOpt()).thenReturn("option2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addArg("unrecognized option");
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[] {option1, option2}, options);
    }
}