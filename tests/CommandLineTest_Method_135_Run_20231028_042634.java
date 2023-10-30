package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class CommandLineTest_Method_135_Run_20231028_042634 {

    @Test
    public void testGetOptions_noOptions() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        Assertions.assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_withOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        Assertions.assertEquals(2, options.length);
        Assertions.assertSame(option1, options[0]);
        Assertions.assertSame(option2, options[1]);
    }

    @Test
    public void testGetOptions_withOptionsAndArgs() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        Option[] options = commandLine.getOptions();
        Assertions.assertEquals(2, options.length);
        Assertions.assertSame(option1, options[0]);
        Assertions.assertSame(option2, options[1]);
        Assertions.assertEquals(2, commandLine.getArgs().length);
        Assertions.assertEquals("arg1", commandLine.getArgs()[0]);
        Assertions.assertEquals("arg2", commandLine.getArgs()[1]);
    }
}