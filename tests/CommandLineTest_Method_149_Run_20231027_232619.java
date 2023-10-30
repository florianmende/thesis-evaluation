package org.apache.commons.cli;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_149_Run_20231027_232619 {

    @Test
    public void testHasOptionWithPresentOption() {
        Option option = mock(Option.class);
        List<Option> options = new ArrayList<>();
        options.add(option);
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption(option));
    }

    @Test
    public void testHasOptionWithAbsentOption() {
        Option option = mock(Option.class);
        List<Option> options = new ArrayList<>();
        CommandLine commandLine = new CommandLine();
        assertFalse(commandLine.hasOption(option));
    }

    @Test
    public void testHasOptionWithNullOption() {
        Option option = mock(Option.class);
        List<Option> options = new ArrayList<>();
        CommandLine commandLine = new CommandLine();
        assertFalse(commandLine.hasOption(option));
    }
}