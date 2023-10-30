package org.apache.commons.cli;

import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionBuilderTest_Method_173_Run_20231028_012625 {

    @Test
    public void testWithValueSeparator() throws NoSuchFieldException, IllegalAccessException {
        OptionBuilder.withValueSeparator();
        Field valueSeparatorField = OptionBuilder.class.getDeclaredField("valueSeparator");
        valueSeparatorField.setAccessible(true);
        assertEquals('=', valueSeparatorField.get(null));
    }
}