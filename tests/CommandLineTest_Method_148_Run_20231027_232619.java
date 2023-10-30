package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_148_Run_20231027_232619 {

    @Test
    public void testHasOption() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.hasOption("opt")).thenReturn(true);
        when(commandLine.hasOption("Opt")).thenReturn(true);
        when(commandLine.hasOption("oPt")).thenReturn(true);
        when(commandLine.hasOption("other")).thenReturn(false);

        assertTrue(commandLine.hasOption("opt"));
        assertTrue(commandLine.hasOption("Opt"));
        assertTrue(commandLine.hasOption("oPt"));
        assertFalse(commandLine.hasOption("other"));
    }
}