package org.apache.commons.cli;


import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionBuilderTest_Method_161_Run_20231024_060930 {

    @Test
    public void testHasArgsWithPositiveInteger() {
        OptionBuilder optionBuilder = Mockito.mock(OptionBuilder.class);
        optionBuilder.hasArgs(1);
    }

    @Test
    public void testHasArgsWithNegativeInteger() {
        OptionBuilder optionBuilder = Mockito.mock(OptionBuilder.class);
        optionBuilder.hasArgs(-1);
    }

    @Test
    public void testHasArgsWithZero() {
        OptionBuilder optionBuilder = Mockito.mock(OptionBuilder.class);
        optionBuilder.hasArgs(0);
    }
}