package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CommandLineTest_Method_129_Run_20231024_082502 {

    @Mock
    private CommandLine commandLine;

    @Mock
    private Option option;

    @Test
    public void testGetArgList_empty() {
        when(commandLine.getArgList()).thenReturn(new ArrayList<>());
        assertEquals(new ArrayList<>(), commandLine.getArgList());
    }

    @Test
    public void testGetArgList_withOptionsAndArguments() {
        List<String> expectedArgs = new ArrayList<>();
        expectedArgs.add("-a");
        expectedArgs.add("-b");
        expectedArgs.add("arg1");
        expectedArgs.add("arg2");

        when(commandLine.getArgList()).thenReturn(expectedArgs);
        assertEquals(expectedArgs, commandLine.getArgList());
    }

    @Test
    public void testGetArgList_withOnlyOptions() {
        List<String> expectedArgs = new ArrayList<>();
        expectedArgs.add("-a");
        expectedArgs.add("-b");

        when(commandLine.getArgList()).thenReturn(expectedArgs);
        assertEquals(expectedArgs, commandLine.getArgList());
    }

    @Test
    public void testGetArgList_withOnlyArguments() {
        List<String> expectedArgs = new ArrayList<>();
        expectedArgs.add("arg1");
        expectedArgs.add("arg2");

        when(commandLine.getArgList()).thenReturn(expectedArgs);
        assertEquals(expectedArgs, commandLine.getArgList());
    }
}