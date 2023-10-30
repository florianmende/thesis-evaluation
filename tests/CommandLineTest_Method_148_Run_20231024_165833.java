package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class CommandLineTest_Method_148_Run_20231024_165833 {

    @Test
    public void testHasOption() {
        // Set up
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(new Option("a", ""));

        // Test that the method returns true when the option has been set
        Assert.assertTrue(commandLine.hasOption('a'));
    }

    @Test
    public void testHasOption_notSet() {
        // Set up
        CommandLine commandLine = new CommandLine();

        // Test that the method returns false when the option has not been set
        Assert.assertFalse(commandLine.hasOption('a'));
    }

    @Test
    public void testHasOption_invalidOption() {
        // Set up
        CommandLine commandLine = new CommandLine();

        // Test that the method returns false when the input character is not a valid option
        Assert.assertFalse(commandLine.hasOption('z'));
    }
}