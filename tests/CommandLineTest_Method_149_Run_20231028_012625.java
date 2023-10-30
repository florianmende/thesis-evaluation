package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CommandLineTest_Method_149_Run_20231028_012625 {

    @Test
    void testHasOption_optionNotSet() {
        // Create a CommandLine object
        CommandLine commandLine = new CommandLine();

        // Create an Option object
        Option option = Mockito.mock(Option.class);

        // Call the hasOption method with the Option object
        boolean result = commandLine.hasOption(option);

        // Assert that the result is false
        assertFalse(result);
    }

    @Test
    void testHasOption_optionSet() {
        // Create a CommandLine object
        CommandLine commandLine = new CommandLine();

        // Create an Option object
        Option option = Mockito.mock(Option.class);

        // Add the Option object to the options list
        commandLine.addOption(option);

        // Call the hasOption method with the Option object
        boolean result = commandLine.hasOption(option);

        // Assert that the result is true
        assertTrue(result);
    }

    @Test
    void testHasOption_optionNotPresentInArgsList() {
        // Create a CommandLine object
        CommandLine commandLine = new CommandLine();

        // Create an Option object
        Option option = Mockito.mock(Option.class);

        // Add the Option object to the args list
        commandLine.addArg(option.toString());

        // Call the hasOption method with the Option object
        boolean result = commandLine.hasOption(option);

        // Assert that the result is false
        assertFalse(result);
    }
}