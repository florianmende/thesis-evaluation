package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_11_Run_20231025_121248 {
    @Test
    public void testGetOptionsEmpty() {
        Options options = new Options();
        Collection<Option> actual = options.getOptions();
        assertTrue(actual.isEmpty());
    }

    @Test
    public void testGetOptionsOneOption() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("key");
        options.addOption(option);
        Collection<Option> actual = options.getOptions();
        assertEquals(1, actual.size());
        assertTrue(actual.contains(option));
    }

    @Test
    public void testGetOptionsMultipleOptions() {
        Options options = new Options();
        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("key1");
        Option option2 = mock(Option.class);
        when(option2.getKey()).thenReturn("key2");
        options.addOption(option1);
        options.addOption(option2);
        Collection<Option> actual = options.getOptions();
        assertEquals(2, actual.size());
        assertTrue(actual.contains(option1));
        assertTrue(actual.contains(option2));
    }
}