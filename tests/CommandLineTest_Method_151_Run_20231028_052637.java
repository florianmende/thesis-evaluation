package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;

public class CommandLineTest_Method_151_Run_20231028_052637 {

    @Test
    public void testIteratorEmpty() {
        CommandLine commandLine = new CommandLine();
        Iterator<Option> iterator = commandLine.iterator();
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorOrder() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Iterator<Option> iterator = commandLine.iterator();
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(option1, iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(option2, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorNoUnrecognized() {
        CommandLine commandLine = new CommandLine();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addArg("unrecognized");
        Iterator<Option> iterator = commandLine.iterator();
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(option1, iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(option2, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}