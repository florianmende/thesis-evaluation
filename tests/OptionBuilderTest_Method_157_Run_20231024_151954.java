package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;

public class OptionBuilderTest_Method_157_Run_20231024_151954 {
    @Test
    public void testCreate() throws Exception {
        // set up mock behavior
        String opt = "test";
        String description = "This is a test option.";
        OptionBuilder.withLongOpt(opt);
        OptionBuilder.withDescription(description);
        OptionBuilder.isRequired();
        OptionBuilder.hasArg();
        OptionBuilder.withArgName("testArg");
        OptionBuilder.withType(String.class);
        OptionBuilder.withValueSeparator('=');

        // create the option
        Option option = OptionBuilder.create();

        // verify the option properties
        assertNotNull(option);
        assertEquals(opt, option.getLongOpt());
        assertEquals(description, option.getDescription());
        assertEquals(true, option.isRequired());
        assertEquals(true, option.hasArg());
        assertEquals("testArg", option.getArgName());
        assertEquals(String.class, option.getType());
        assertEquals('=', option.getValueSeparator());
    }
}