package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_135_Run_20231027_212614 {

    @Test
    public void testGetOptions_Empty() {
        // Setup
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        when(commandLine.getOptions()).thenReturn(new Option[0]);

        // Execute
        Option[] options = commandLine.getOptions();

        // Verify
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_SingleOption() {
        // Setup
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Option option = Mockito.mock(Option.class);
        when(commandLine.getOptions()).thenReturn(new Option[] { option });

        // Execute
        Option[] options = commandLine.getOptions();

        // Verify
        assertEquals(1, options.length);
        assertEquals(option, options[0]);
    }

    @Test
    public void testGetOptions_MultipleOptions() {
        // Setup
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        when(commandLine.getOptions()).thenReturn(new Option[] { option1, option2 });

        // Execute
        Option[] options = commandLine.getOptions();

        // Verify
        assertEquals(2, options.length);
        assertEquals(option1, options[0]);
        assertEquals(option2, options[1]);
    }
}