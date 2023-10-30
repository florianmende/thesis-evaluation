package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class CommandLineTest_Method_131_Run_20231028_012625 {

    @Test
    void testGetOptionObject() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionObject('a')).thenReturn("optionA");
        when(commandLine.getOptionObject('b')).thenReturn("optionB");

        assertEquals("optionA", commandLine.getOptionObject('a'));
        assertEquals("optionB", commandLine.getOptionObject('b'));
    }
}