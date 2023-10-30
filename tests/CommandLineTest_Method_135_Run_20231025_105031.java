package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

public class CommandLineTest_Method_135_Run_20231025_105031 {

    @Test
    public void testGetOptions_Empty() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_SomeOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);
        assertSame(option1, options[0]);
        assertSame(option2, options[1]);
    }

    @Test
    public void testGetOptions_Order() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);
        assertSame(option1, options[0]);
        assertSame(option2, options[1]);
    }
}