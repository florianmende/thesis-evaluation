package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.junit.jupiter.api.Test;

class OptionTest_Method_89_Run_20231027_222616 {

    @Test
    void testGetValuesList() {
        // Test case 1: Test that the method returns the correct values when the option has values.
        Option option = mock(Option.class);
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        when(option.getValuesList()).thenReturn(values);
        assertEquals(values, option.getValuesList());

        // Test case 2: Test that the method returns null when the option has no values.
        option = mock(Option.class);
        when(option.getValuesList()).thenReturn(null);
        assertNull(option.getValuesList());

        // Test case 3: Test that the method returns the correct values when the option has multiple values.
        option = mock(Option.class);
        values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        values.add("value3");
        when(option.getValuesList()).thenReturn(values);
        assertEquals(values, option.getValuesList());
    }

}