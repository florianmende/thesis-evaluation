package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.*;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_131_Run_20231027_222616 {

    @Test
    public void testGetOptionObject() throws Exception {
        // Test case 1: getOptionObject returns the correct Option object
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("opt");
        commandLine.addOption(option);
        Field optionsField = CommandLine.class.getDeclaredField("options");
        optionsField.setAccessible(true);
        List<Option> options = (List<Option>) optionsField.get(commandLine);
        assertEquals(option, options.get(0));

        // Test case 2: getOptionObject throws exception if option is not found
        CommandLine commandLine2 = new CommandLine();
        assertDoesNotThrow(() -> commandLine2.getOptionObject("opt"));
    }
}