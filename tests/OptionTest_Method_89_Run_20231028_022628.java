package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionTest_Method_89_Run_20231028_022628 {

    @Test
    public void testGetValuesListWithNoValues() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getValuesList()).thenReturn(null);

        List<String> values = option.getValuesList();

        assertNull(values);
    }

    @Test
    public void testGetValuesListWithOneValue() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getValuesList()).thenReturn(List.of("value1"));

        List<String> values = option.getValuesList();

        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testGetValuesListWithMultipleValues() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getValuesList()).thenReturn(List.of("value1", "value2", "value3"));

        List<String> values = option.getValuesList();

        assertEquals(3, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
        assertEquals("value3", values.get(2));
    }
}