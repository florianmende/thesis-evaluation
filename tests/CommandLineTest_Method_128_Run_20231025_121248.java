package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_128_Run_20231025_121248 {

    @Test
    public void testAddOption() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getValues()).thenReturn(new String[] { "value1", "value2" });

        commandLine.addOption(option);

        assertEquals(1, commandLine.getOptions().length);
        assertEquals(option, commandLine.getOptions()[0]);
    }

    @Test
    public void testAddOptionNull() {
        CommandLine commandLine = new CommandLine();

        commandLine.addOption(null);

        assertEquals(0, commandLine.getOptions().length);
    }

    @Test
    public void testAddOptionStoresValues() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getValues()).thenReturn(new String[] { "value1", "value2" });

        commandLine.addOption(option);

        List<String> values = new ArrayList<>();
        for (Option opt : commandLine.getOptions()) {
            values.addAll(Arrays.asList(opt.getValues()));
        }

        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }
}