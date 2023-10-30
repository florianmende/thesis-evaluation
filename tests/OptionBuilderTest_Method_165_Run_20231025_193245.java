package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;

class OptionBuilderTest_Method_165_Run_20231025_193245 {
    @Test
    void testIsRequired() {
        OptionBuilder.withLongOpt("required");
        OptionBuilder.isRequired();
        Option option = OptionBuilder.create();
        assertTrue(option.isRequired());
    }

    @Test
    void testIsRequiredTrue() {
        OptionBuilder.withLongOpt("required");
        OptionBuilder.isRequired(true);
        Option option = OptionBuilder.create();
        assertTrue(option.isRequired());
    }

    @Test
    void testIsRequiredFalse() {
        OptionBuilder.withLongOpt("not-required");
        OptionBuilder.isRequired(false);
        Option option = OptionBuilder.create();
        assertFalse(option.isRequired());
    }
}