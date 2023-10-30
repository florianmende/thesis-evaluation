package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Assert;

class CommandLineTest_Method_151_Run_20231024_082502 {

    @Test
    void testIterator() {
        // create a CommandLine instance
        CommandLine commandLine = new CommandLine();

        // create some Option objects
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        Option option3 = Mockito.mock(Option.class);

        // add the Option objects to the CommandLine
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addOption(option3);

        // create an iterator over the CommandLine
        Iterator<Option> iterator = commandLine.iterator();

        // check that the iterator returns the Option objects in the correct order
        Assert.assertEquals(option1, iterator.next());
        Assert.assertEquals(option2, iterator.next());
        Assert.assertEquals(option3, iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }
}