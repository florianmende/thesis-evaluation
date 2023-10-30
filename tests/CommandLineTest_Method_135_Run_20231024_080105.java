package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CommandLineTest_Method_135_Run_20231024_080105 {

    @Test
    void testGetOptionsWithNoOptions() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    void testGetOptionsWithOptions() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertEquals(1, options.length);
        assertEquals(option, options[0]);
    }

    @Test
    void testGetOptionsWithOptionsAndUnrecognizedArguments() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        commandLine.addOption(option);
        commandLine.addArg("arg");
        Option[] options = commandLine.getOptions();
        assertEquals(1, options.length);
        assertEquals(option, options[0]);
        assertEquals(1, commandLine.getArgs().length);
        assertEquals("arg", commandLine.getArgs()[0]);
    }
}