package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;

class OptionBuilderTest_Method_172_Run_20231023_214133 {

    @Test
    void testWithType() {
        Option option = OptionBuilder.withType(String.class).create("test");
        assertEquals(String.class, option.getType());
    }

    @Test
    void testWithTypeDeprecated() {
        Option option = OptionBuilder.withType((Class<?>) String.class).create("test");
        assertEquals(String.class, option.getType());
    }
}