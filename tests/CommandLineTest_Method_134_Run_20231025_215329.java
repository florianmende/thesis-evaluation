package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import java.util.Arrays; // <-- added import statement

public class CommandLineTest_Method_134_Run_20231025_215329 {

    @Test
    public void testGetOptionProperties() {
        // create a mock Option object
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn("foo");
        Mockito.when(option.getLongOpt()).thenReturn("bar");
        Mockito.when(option.getValuesList()).thenReturn(Arrays.asList("key", "value"));

        // create a CommandLine object with the mock Option object
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();

        // test the getOptionProperties method
        Properties props = commandLine.getOptionProperties("foo");
        assertEquals(1, props.size());
        assertEquals("value", props.getProperty("key"));

        props = commandLine.getOptionProperties("bar");
        assertEquals(1, props.size());
        assertEquals("value", props.getProperty("key"));

        props = commandLine.getOptionProperties("baz");
        assertEquals(0, props.size());
    }
}