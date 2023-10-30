package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class OptionTest_Method_73_Run_20231024_145023 {
    @Test
    void testClearValues() {
        Option option = mock(Option.class);
        String[] values = new String[]{"value1", "value2"};
        when(option.getValues()).thenReturn(values);
        String[] expectedValues = new String[]{"value1", "value2"};
        assertArrayEquals(expectedValues, option.getValues());
    }
}