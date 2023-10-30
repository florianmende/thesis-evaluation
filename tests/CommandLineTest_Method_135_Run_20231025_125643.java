package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_135_Run_20231025_125643 {

    @Test
    public void testGetOptions_noOptions() {
        CommandLine commandLine = new CommandLine();
        Option[] result = commandLine.getOptions();
        assertArrayEquals(new Option[0], result);
    }

    @Test
    public void testGetOptions_oneOption() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        when(option.getValue()).thenReturn("b");
        commandLine.addOption(option);
        Option[] result = commandLine.getOptions();
        assertArrayEquals(new Option[]{option}, result);
    }

    @Test
    public void testGetOptions_multipleOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        when(option1.getOpt()).thenReturn("a");
        when(option1.getValue()).thenReturn("b");
        Option option2 = Mockito.mock(Option.class);
        when(option2.getOpt()).thenReturn("c");
        when(option2.getValue()).thenReturn("d");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] result = commandLine.getOptions();
        assertArrayEquals(new Option[]{option1, option2}, result);
    }

    @Test
    public void testGetOptions_unrecognizedOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        when(option1.getOpt()).thenReturn("a");
        when(option1.getValue()).thenReturn("b");
        Option option2 = Mockito.mock(Option.class);
        when(option2.getOpt()).thenReturn("c");
        when(option2.getValue()).thenReturn("d");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addArg("e");
        Option[] result = commandLine.getOptions();
        assertArrayEquals(new Option[]{option1, option2}, result);
    }
}