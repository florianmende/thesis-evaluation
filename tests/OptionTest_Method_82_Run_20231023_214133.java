package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

class OptionTest_Method_82_Run_20231023_214133 {
    @Test
    void testGetOpt() throws ParseException {
        // create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValue("opt")).thenReturn("value");

        // create an Option object with the mock CommandLine object
        Option option = new Option("opt", "description");

        // test the getOpt method
        assertEquals("value", commandLine.getOptionValue("opt"));
    }
}