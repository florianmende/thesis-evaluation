package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;

public class OptionBuilderTest_Method_169_Run_20231028_042634 {

    @Test
    public void testWithDescription() {
        String description = "This is a test description";
        Option option = OptionBuilder.withDescription(description).create("longopt");
        assertEquals(description, option.getDescription());
    }

    @Test
    public void testWithoutDescription() {
        Option option = OptionBuilder.withDescription(null).create("longopt");
        assertNull(option.getDescription());
    }

    @Test
    public void testWithEmptyDescription() {
        Option option = OptionBuilder.withDescription("").create("longopt");
        assertEquals("", option.getDescription());
    }
}