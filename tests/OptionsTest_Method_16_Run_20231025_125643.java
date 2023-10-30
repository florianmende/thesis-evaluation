package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_16_Run_20231025_125643 {
    @Test
    void testHelpOptionsEmpty() {
        Options options = new Options();
        List<Option> expected = new ArrayList<>();
        List<Option> actual = options.helpOptions();
        assertEquals(expected, actual);
    }

    @Test
    void testHelpOptionsOneOption() {
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("a");
        Options options = new Options();
        options.addOption(option);
        List<Option> expected = new ArrayList<>();
        expected.add(option);
        List<Option> actual = options.helpOptions();
        assertEquals(expected, actual);
    }

    @Test
    void testHelpOptionsMultipleOptions() {
        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("a");
        Option option2 = mock(Option.class);
        when(option2.getKey()).thenReturn("b");
        Options options = new Options();
        options.addOption(option1);
        options.addOption(option2);
        List<Option> expected = new ArrayList<>();
        expected.add(option1);
        expected.add(option2);
        List<Option> actual = options.helpOptions();
        assertEquals(expected, actual);
    }
}