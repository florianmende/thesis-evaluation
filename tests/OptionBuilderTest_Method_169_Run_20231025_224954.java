package org.apache.commons.cli;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.Test;

public class OptionBuilderTest_Method_169_Run_20231025_224954 {
    @Test
    public void testWithDescriptionValidString() {
        String description = "description";
        Option option = OptionBuilder.withDescription(description).withLongOpt("longopt").create();
        assertNotNull(option);
        assertEquals(description, option.getDescription());
    }

    @Test
    public void testWithDescriptionEmptyString() {
        String description = "";
        Option option = OptionBuilder.withDescription(description).withLongOpt("longopt").create();
        assertNotNull(option);
        assertEquals(description, option.getDescription());
    }

    @Test
    public void testWithDescriptionNull() {
        String description = null;
        Option option = OptionBuilder.withDescription(description).withLongOpt("longopt").create();
        assertNotNull(option);
        assertNull(option.getDescription());
    }
}