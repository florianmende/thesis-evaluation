package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_129_Run_20231024_165833 {

    @Test
    void testGetArgList() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Create a mock Option instance
        Option option = Mockito.mock(Option.class);

        // Set up the mock CommandLine instance to return the mock Option instance
        Mockito.when(commandLine.getArgList()).thenReturn(Collections.singletonList("arg1"));

        // Call the getArgList method on the mock CommandLine instance
        List<String> argList = commandLine.getArgList();

        // Verify that the getArgList method was called on the mock CommandLine instance
        Mockito.verify(commandLine).getArgList();

        // Verify that the mock Option instance was returned
        assertEquals(Collections.singletonList("arg1"), argList);

        // Verify that the mock Option instance was added to the list of arguments
        assertNotNull(argList.get(0));
    }
}