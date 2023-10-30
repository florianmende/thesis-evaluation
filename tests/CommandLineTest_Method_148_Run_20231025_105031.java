package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import junit.framework.Assert;

public class CommandLineTest_Method_148_Run_20231025_105031 {

    @Test
    public void testHasOption() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);

        // Case 1: When the option is set, the method should return true
        Assert.assertTrue(commandLine.hasOption('a'));

        // Case 2: When the option is not set, the method should return false
        Assert.assertFalse(commandLine.hasOption('b'));

        // Case 3: When the option is set to an empty string, the method should return false
        Assert.assertFalse(commandLine.hasOption(""));
    }
}