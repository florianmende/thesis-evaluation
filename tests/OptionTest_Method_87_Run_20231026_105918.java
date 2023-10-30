package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionTest_Method_87_Run_20231026_105918 {
    @Test
    void testGetValuesNoValues() {
        Option option = Mockito.mock(Option.class);
        assertNull(option.getValues());
    }

    @Test
    void testGetValuesOneValue() {
        Option option = Mockito.mock(Option.class);
        List<String> values = new ArrayList<>();
        values.add("value1");
        Mockito.when(option.getValues()).thenReturn(values.toArray(new String[0]));
        assertArrayEquals(new String[] {"value1"}, option.getValues());
    }

    @Test
    void testGetValuesMultipleValues() {
        Option option = Mockito.mock(Option.class);
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        values.add("value3");
        Mockito.when(option.getValues()).thenReturn(values.toArray(new String[0]));
        assertArrayEquals(new String[] {"value1", "value2", "value3"}, option.getValues());
    }
}