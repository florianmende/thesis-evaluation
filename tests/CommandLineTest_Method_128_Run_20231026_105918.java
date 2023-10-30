package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_128_Run_20231026_105918 {

    @Test
    public void testAddOption_EmptyCommandLine() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("test");
        commandLine.addOption(option);
        assertEquals(1, commandLine.getOptions().length);
        assertEquals("test", commandLine.getOptions()[0].getLongOpt());
    }

    @Test
    public void testAddOption_NonEmptyCommandLine() {
        CommandLine commandLine = new CommandLine();
        Option option1 = mock(Option.class);
        when(option1.getLongOpt()).thenReturn("test1");
        commandLine.addOption(option1);
        Option option2 = mock(Option.class);
        when(option2.getLongOpt()).thenReturn("test2");
        commandLine.addOption(option2);
        assertEquals(2, commandLine.getOptions().length);
        assertEquals("test1", commandLine.getOptions()[0].getLongOpt());
        assertEquals("test2", commandLine.getOptions()[1].getLongOpt());
    }

    @Test
    public void testAddOption_NullOption() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("test");
        commandLine.addOption(option);
        assertEquals(1, commandLine.getOptions().length);
        assertEquals("test", commandLine.getOptions()[0].getLongOpt());
        commandLine.addOption(null);
        assertEquals(1, commandLine.getOptions().length);
        assertEquals("test", commandLine.getOptions()[0].getLongOpt());
    }
}