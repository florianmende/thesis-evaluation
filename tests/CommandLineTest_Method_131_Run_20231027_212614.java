package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CommandLineTest_Method_131_Run_20231027_212614 {

    @Mock
    private CommandLine commandLine;

    @Test
    public void testGetOptionObjectWithValidOption() {
        Option option = new Option("a", "aaa");
        when(commandLine.getOptionObject(option.getOpt())).thenReturn(option);
        assertEquals(option, commandLine.getOptionObject(option.getOpt()));
    }

    @Test
    public void testGetOptionObjectWithInvalidOption() {
        Option option = new Option("a", "aaa");
        when(commandLine.getOptionObject(option.getOpt())).thenReturn(null);
        assertNull(commandLine.getOptionObject(option.getOpt()));
    }

    @Test
    public void testGetOptionObjectWithNullOption() {
        Option option = new Option("a", "aaa");
        when(commandLine.getOptionObject(null)).thenReturn(null);
        assertNull(commandLine.getOptionObject(null));
    }
}