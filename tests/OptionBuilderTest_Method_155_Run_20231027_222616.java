package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class OptionBuilderTest_Method_155_Run_20231027_222616 {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithoutLongOption() {
        OptionBuilder.create();
    }

    @Test
    public void testCreateWithLongOption() {
        Option option = OptionBuilder.withLongOpt("long-option").create();
        assertNotNull(option);
        assertEquals("long-option", option.getLongOpt());
    }

    @Test
    public void testCreateWithDescription() {
        Option option = OptionBuilder.withLongOpt("long-option").withDescription("This is a description.").create();
        assertNotNull(option);
        assertEquals("This is a description.", option.getDescription());
    }

    @Test
    public void testCreateWithArgName() {
        Option option = OptionBuilder.withLongOpt("long-option").withArgName("arg-name").create();
        assertNotNull(option);
        assertEquals("arg-name", option.getArgName());
    }

    @Test
    public void testCreateWithType() {
        Option option = OptionBuilder.withLongOpt("long-option").withType(String.class).create();
        assertNotNull(option);
        assertEquals(String.class, option.getType());
    }
}