package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_11_Run_20231023_214133 {

    @Test
    public void testGetOptionsEmpty() {
        Options options = new Options();
        assertTrue(options.getOptions().isEmpty());
    }

    @Test
    public void testGetOptionsOneOption() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("key");
        options.addOption(option);
        assertEquals(1, options.getOptions().size());
        assertTrue(options.getOptions().contains(option));
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
        assertEquals(2, options.getOptions().size());
        assertTrue(options.getOptions().contains(option1));
        assertTrue(options.getOptions().contains(option2));
    }
}