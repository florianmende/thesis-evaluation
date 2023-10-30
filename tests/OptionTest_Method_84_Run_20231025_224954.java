package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_84_Run_20231025_224954 {
    @Test
    public void testGetValueNoValues() {
        Option option = mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(true);
        when(option.getValue()).thenReturn(null);
        assertNull(option.getValue());
    }

    @Test
    public void testGetValueOneValue() {
        Option option = mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(false);
        when(option.getValues()).thenReturn(List.of("value1").toArray(new String[0]));
        when(option.getValue()).thenReturn("value1");
        assertEquals("value1", option.getValue());
    }

    @Test
    public void testGetValueMultipleValues() {
        Option option = mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(false);
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        when(option.getValues()).thenReturn(values.toArray(new String[0]));
        when(option.getValue()).thenReturn("value1");
        assertEquals("value1", option.getValue());
    }
}