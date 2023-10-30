package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Iterator;

class CommandLineTest_Method_151_Run_20231030_094427 {
    @Test
    void testEmptyIterator() {
        CommandLine commandLine = new CommandLine();
        Iterator<Option> iterator = commandLine.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIterator() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Iterator<Option> iterator = commandLine.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(option1, iterator.next());
        assertEquals(option2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorWithUnrecognizedOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addArg("unrecognized option");
        Iterator<Option> iterator = commandLine.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(option1, iterator.next());
        assertEquals(option2, iterator.next());
        assertFalse(iterator.hasNext());
    }
}