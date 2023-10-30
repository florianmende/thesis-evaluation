package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_84_Run_20231024_004630 {
    @Test
    public void testGetValueWithValue() {
        Option option = mock(Option.class);
        List<String> values = new ArrayList<>();
        values.add("value");
        when(option.getValues()).thenReturn(values.toArray(new String[0]));
        when(option.getValue()).thenReturn("value");
        assertEquals("value", option.getValue());
    }

    @Test
    public void testGetValueWithNoValue() {
        Option option = mock(Option.class);
        List<String> values = new ArrayList<>();
        when(option.getValues()).thenReturn(values.toArray(new String[0]));
        assertEquals(null, option.getValue());
    }

    @Test
    public void testGetValueWithMultipleValues() {
        Option option = mock(Option.class);
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        when(option.getValues()).thenReturn(values.toArray(new String[0]));
        when(option.getValue()).thenReturn("value1");
        assertEquals("value1", option.getValue());
    }
}