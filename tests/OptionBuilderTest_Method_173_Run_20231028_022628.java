package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionBuilderTest_Method_173_Run_20231028_022628 {
    @Test
    public void testWithValueSeparator() {
        Option option = OptionBuilder.withValueSeparator().create('D');
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testWithValueSeparatorChar() {
        Option option = OptionBuilder.withValueSeparator('=').create('D');
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testWithValueSeparatorCharDifferent() {
        Option option = OptionBuilder.withValueSeparator(':').create('D');
        assertEquals(':', option.getValueSeparator());
    }
}