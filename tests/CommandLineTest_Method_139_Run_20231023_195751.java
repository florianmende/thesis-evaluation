package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommandLineTest_Method_139_Run_20231023_195751 {
    @Test
    public void testGetOptionValue() {
        // Case 1: The method returns the default value when the option is not specified.
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue(Mockito.anyString(), Mockito.anyString())).thenReturn("default");
        assertEquals("default", commandLine.getOptionValue("option", "default"));

        // Case 2: The method returns the value of the first argument of an option when the option is specified.
        commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue(Mockito.anyString(), Mockito.anyString())).thenReturn("value");
        assertEquals("value", commandLine.getOptionValue("option", "default"));

        // Case 3: The method returns null when the option is specified but has no argument.
        commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue(Mockito.anyString(), Mockito.anyString())).thenReturn(null);
        assertNull(commandLine.getOptionValue("option", "default"));
    }
}