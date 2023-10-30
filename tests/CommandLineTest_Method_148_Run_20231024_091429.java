package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLine.Builder;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class CommandLineTest_Method_148_Run_20231024_091429 {

    @Test
    public void testHasOption() {
        // Setup
        Builder builder = new Builder();
        CommandLine commandLine = builder.build();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);

        // Test
        Assertions.assertTrue(commandLine.hasOption("a"));
        Assertions.assertFalse(commandLine.hasOption("b"));
        Assertions.assertTrue(commandLine.hasOption("a"));
    }
}