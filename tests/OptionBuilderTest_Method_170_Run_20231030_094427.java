package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionBuilderTest_Method_170_Run_20231030_094427 {

    @Test
    public void testWithLongOpt() {
        Option option = OptionBuilder.withLongOpt("long-option-value").create();
        assertEquals("long-option-value", option.getLongOpt());
    }

    @Test
    public void testWithLongOptNull() {
        assertThrows(IllegalArgumentException.class, () -> OptionBuilder.withLongOpt(null).create());
    }

    @Test
    public void testWithLongOptField() throws Exception {
        Option option = OptionBuilder.withLongOpt("long-option-value").create();
        Field field = Option.class.getDeclaredField("longOption");
        field.setAccessible(true);
        assertEquals("long-option-value", field.get(option));
    }
}