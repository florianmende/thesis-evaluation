package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class OptionTest_Method_89_Run_20231025_215329 {

    @Test
    public void testGetValuesListReturnsNullWhenOptionHasNoValues() {
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(null);
        assertNull(option.getValuesList());
    }

    @Test
    public void testGetValuesListReturnsListWithSingleValueWhenOptionHasOneValue() {
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList("value1"));
        List<String> valuesList = option.getValuesList();
        assertEquals(1, valuesList.size());
        assertEquals("value1", valuesList.get(0));
    }

    @Test
    public void testGetValuesListReturnsListWithMultipleValuesWhenOptionHasMultipleValues() {
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList("value1", "value2", "value3"));
        List<String> valuesList = option.getValuesList();
        assertEquals(3, valuesList.size());
        assertEquals("value1", valuesList.get(0));
        assertEquals("value2", valuesList.get(1));
        assertEquals("value3", valuesList.get(2));
    }
}