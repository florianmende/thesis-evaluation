package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptionBuilderTest_Method_160_Run_20231024_060930 {
    @Test
    public void testHasArgs() {
        // Case 1: The next Option created can have an argument value.
        Option option = OptionBuilder.hasArg().withLongOpt("my-option").create();
        assertEquals(1, option.getArgs());

        // Case 2: The next Option created can have unlimited argument values.
        option = OptionBuilder.hasArgs().withLongOpt("my-option").create();
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());

        // Case 3: The next Option created can have a specified number of argument values.
        option = OptionBuilder.hasArgs(5).withLongOpt("my-option").create();
        assertEquals(5, option.getArgs());
    }
}