package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionBuilderTest_Method_156_Run_20231024_165833 {
    @Test
    public void testCreateWithValidChar() {
        Option option = OptionBuilder.create('a');
        assertEquals("a", option.getOpt());
    }

    @Test
    public void testCreateWithInvalidChar() {
        assertThrows(IllegalArgumentException.class, () -> OptionBuilder.create(' '));
    }

    @Test
    public void testCreateSetsOpt() {
        Option option = OptionBuilder.create('a');
        assertEquals("a", option.getOpt());
    }
}