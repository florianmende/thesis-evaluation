package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLineTest_Method_151_Run_20231025_100630 {

    @Test
    public void testIterator() {
        // Case 1: The method returns a non-null iterator when there are no options in the CommandLine.
        CommandLine commandLine = new CommandLine();
        Iterator<Option> iterator = commandLine.iterator();
        assertNotNull(iterator);

        // Case 2: The method returns a non-null iterator when there are options in the CommandLine.
        Option option = new Option("test", "test option");
        commandLine.addOption(option);
        iterator = commandLine.iterator();
        assertNotNull(iterator);

        // Case 3: The method returns an iterator that iterates over the expected options in the CommandLine.
        int count = 0;
        while (iterator.hasNext()) {
            Option nextOption = iterator.next();
            assertTrue(nextOption.equals(option));
            count++;
        }
        assertTrue(count == 1);
    }
}