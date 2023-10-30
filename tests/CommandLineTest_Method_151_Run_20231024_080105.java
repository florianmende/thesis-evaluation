package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLineTest_Method_151_Run_20231024_080105 {

    @Test
    public void testIterator_empty() {
        CommandLine commandLine = new CommandLine();
        Iterator<Option> iterator = commandLine.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterator_withOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("a", "arg1");
        Option option2 = new Option("b", "arg2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Iterator<Option> iterator = commandLine.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(option1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(option2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterator_withMultipleOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("a", "arg1");
        Option option2 = new Option("b", "arg2");
        Option option3 = new Option("c", "arg3");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addOption(option3);
        Iterator<Option> iterator = commandLine.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(option1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(option2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(option3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}