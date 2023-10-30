package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class CommandLineTest_Method_142_Run_20231028_052637 {

    @Test
    public void testGetOptionValues_notSet() {
        CommandLine commandLine = new CommandLine();
        String[] values = commandLine.getOptionValues('a');
        assertNull(values);
    }

    @Test
    public void testGetOptionValues_setWithArgument() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getValues()).thenReturn(new String[]{"arg1", "arg2"});
        commandLine.addOption(option);
        String[] values = commandLine.getOptionValues('a');
        assertNull(values);
    }

    @Test
    public void testGetOptionValues_setWithoutArgument() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        commandLine.addOption(option);
        String[] values = commandLine.getOptionValues('a');
        assertNull(values);
    }
}