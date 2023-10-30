package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

public class CommandLineTest_Method_151_Run_20231024_151954 {

    @Test
    public void testEmptyIterator() {
        CommandLine commandLine = new CommandLine();
        Iterator<Option> iterator = commandLine.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testCorrectNumberOfOptions() {
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(new Option("a", "optionA"));
        commandLine.addOption(new Option("b", "optionB"));
        Iterator<Option> iterator = commandLine.iterator();
        assertEquals(2, commandLine.getOptions().length);
    }

    @Test
    public void testCorrectOptions() {
        CommandLine commandLine = new CommandLine();
        Option optionA = new Option("a", "optionA");
        Option optionB = new Option("b", "optionB");
        commandLine.addOption(optionA);
        commandLine.addOption(optionB);
        Iterator<Option> iterator = commandLine.iterator();
        assertEquals(optionA, iterator.next());
        assertEquals(optionB, iterator.next());
    }
}