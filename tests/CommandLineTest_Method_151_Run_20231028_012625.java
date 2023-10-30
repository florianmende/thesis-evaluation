package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Iterator;

class CommandLineTest_Method_151_Run_20231028_012625 {
    @Test
    void testIterator() {
        // Case 1: The method returns an iterator over the `Option` members of the `CommandLine` class.
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("option1", "Option 1");
        Option option2 = new Option("option2", "Option 2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Iterator<Option> iterator = commandLine.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(option1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(option2, iterator.next());
        assertFalse(iterator.hasNext());

        // Case 2: The method returns an empty iterator if there are no `Option` members in the `CommandLine` class.
        commandLine = new CommandLine();
        iterator = commandLine.iterator();
        assertFalse(iterator.hasNext());

        // Case 3: The method returns an iterator that iterates over the `Option` members in the correct order.
        commandLine = new CommandLine();
        option1 = new Option("option1", "Option 1");
        option2 = new Option("option2", "Option 2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        iterator = commandLine.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(option1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(option2, iterator.next());
        assertFalse(iterator.hasNext());
    }
}