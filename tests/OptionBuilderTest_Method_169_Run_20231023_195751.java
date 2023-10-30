package org.apache.commons.cli;


import org.apache.commons.cli.OptionBuilder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionBuilderTest_Method_169_Run_20231023_195751 {
    @Test
    public void testWithDescription() {
        OptionBuilder builder = OptionBuilder.withDescription("This is a test description");
        Option option = builder.create("test");
        assertEquals("This is a test description", option.getDescription());
    }
}