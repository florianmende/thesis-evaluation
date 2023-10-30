package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_135_Run_20231027_222616 {
    @Test
    public void testGetOptions_noOptions() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[0], options);
    }

    @Test
    public void testGetOptions_singleOption() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        when(option.getOpt()).thenReturn("test");
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[] {option}, options);
    }

    @Test
    public void testGetOptions_multipleOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        when(option1.getOpt()).thenReturn("test1");
        commandLine.addOption(option1);
        Option option2 = Mockito.mock(Option.class);
        when(option2.getOpt()).thenReturn("test2");
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[] {option1, option2}, options);
    }
}