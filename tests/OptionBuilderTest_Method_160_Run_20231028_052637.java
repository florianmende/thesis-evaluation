package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionBuilderTest_Method_160_Run_20231028_052637 {
    @Test
    public void testHasArgs() {
        // create a mock Option instance
        Option option = mock(Option.class);

        // set up the mock option to return a specific value for the hasArgs() method
        when(option.hasArgs()).thenReturn(true);

        // call the hasArgs() method on the OptionBuilder class
        OptionBuilder.hasArgs();

        // assert that the hasArgs() method was called on the mock option instance
        assertEquals(true, option.hasArgs());
    }
}