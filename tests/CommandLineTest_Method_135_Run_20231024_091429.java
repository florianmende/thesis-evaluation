package org.apache.commons.cli;



import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_135_Run_20231024_091429 {

    @Test
    public void testGetOptions_noProcessedOptions() {
        CommandLine commandLine = new CommandLine();
        assertArrayEquals(new Option[0], commandLine.getOptions());
    }

    @Test
    public void testGetOptions_oneProcessedOption() {
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("option");
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);
        assertArrayEquals(new Option[] { option }, commandLine.getOptions());
    }

    @Test
    public void testGetOptions_multipleProcessedOptions() {
        Option option1 = mock(Option.class);
        when(option1.getOpt()).thenReturn("option1");
        Option option2 = mock(Option.class);
        when(option2.getOpt()).thenReturn("option2");
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        assertArrayEquals(new Option[] { option1, option2 }, commandLine.getOptions());
    }
}