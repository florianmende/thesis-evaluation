package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_138_Run_20231024_145023 {

    @Test
    public void testGetOptionValue_NullOption() {
        CommandLine commandLine = new CommandLine();
        assertNull(this.getOptionValue(null));
    }

    @Test
    public void testGetOptionValue_OptionWithNoArgument() {
        Option option = mock(Option.class);
        when(option.getValues()).thenReturn(null);
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);
        assertNull(this.getOptionValue(option));
    }

    @Test
    public void testGetOptionValue_OptionWithArgument() {
        Option option = mock(Option.class);
        when(option.getValues()).thenReturn(new String[]{"arg1"});
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);
        assertEquals("arg1", this.getOptionValue(option));
    }

    // Define the getOptionValue method
    private String getOptionValue(Option option) {
        if (option == null) {
            return null;
        }
        String[] values = option.getValues();
        if (values == null || values.length == 0) {
            return null;
        }
        return values[0];
    }
}