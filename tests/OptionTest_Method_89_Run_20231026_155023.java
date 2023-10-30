package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class OptionTest_Method_89_Run_20231026_155023 {
    @Test
    void testGetValuesList() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(null);
        assertNull(option.getValuesList());

        List<String> values = new ArrayList<>();
        values.add("value1");
        when(option.getValuesList()).thenReturn(values);
        assertEquals(values, option.getValuesList());

        values.add("value2");
        when(option.getValuesList()).thenReturn(values);
        assertEquals(values, option.getValuesList());
    }
}