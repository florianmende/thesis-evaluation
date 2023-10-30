package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommandLineTest_Method_151_Run_20231025_215329 {

    @Test
    public void testIteratorEmpty() {
        CommandLine commandLine = new CommandLine();
        Iterator<Option> iterator = commandLine.iterator();
    }

    @Test
    public void testIteratorOneOption() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        commandLine.addOption(option);
        Iterator<Option> iterator = commandLine.iterator();
    }

    @Test
    public void testIteratorMultipleOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        Option option3 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addOption(option3);
        Iterator<Option> iterator = commandLine.iterator();
    }
}