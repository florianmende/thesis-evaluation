package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineTest_Method_135_Run_20231025_121248 {

    @Test
    public void testGetOptions_NoOptions() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_WithOptions() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[] {option}, options);
    }

    @Test
    public void testGetOptions_WithUnrecognizedOptions() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("-a");
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_WithOptionsAndUnrecognizedOptions() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        commandLine.addOption(option);
        commandLine.addArg("-a");
        Option[] options = commandLine.getOptions();
        assertArrayEquals(new Option[] {option}, options);
    }
}