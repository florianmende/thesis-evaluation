package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_19_Run_20231025_100630 {
    @Test
    public void testGetNamesEmpty() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void testGetNamesWithOptions() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(option1.getKey()).thenReturn("option1");
        when(option2.getKey()).thenReturn("option2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        Collection<String> names = optionGroup.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("option1"));
        assertTrue(names.contains("option2"));
    }

    @Test
    public void testGetNamesWithDuplicateOptions() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(option1.getKey()).thenReturn("option1");
        when(option2.getKey()).thenReturn("option1");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        Collection<String> names = optionGroup.getNames();
        assertEquals(1, names.size());
        assertTrue(names.contains("option1"));
    }
}