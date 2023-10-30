package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_135_Run_20231023_195751 {

    @Test
    public void testGetOptions_Empty() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_SingleOption() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(1, options.length);
        assertEquals("a", options[0].getOpt());
    }

    @Test
    public void testGetOptions_MultipleOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = mock(Option.class);
        when(option1.getOpt()).thenReturn("a");
        commandLine.addOption(option1);
        Option option2 = mock(Option.class);
        when(option2.getOpt()).thenReturn("b");
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(2, options.length);
        assertEquals("a", options[0].getOpt());
        assertEquals("b", options[1].getOpt());
    }
}