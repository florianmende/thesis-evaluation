package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

class OptionGroupTest_Method_19_Run_20231025_121248 {

    @Test
    void testGetNamesEmpty() {
        OptionGroup group = new OptionGroup();
        Collection<String> names = group.getNames();
        assertTrue(names.isEmpty());
    }

    @Test
    void testGetNames() {
        OptionGroup group = new OptionGroup();
        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("option1");
        group.addOption(option1);
        Collection<String> names = group.getNames();
        assertEquals(1, names.size());
        assertEquals("option1", names.iterator().next());
    }

    @Test
    void testGetNamesWithShortAndLongNames() {
        OptionGroup group = new OptionGroup();
        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("option1");
        when(option1.getLongOpt()).thenReturn("option1");
        group.addOption(option1);
        Option option2 = mock(Option.class);
        when(option2.getKey()).thenReturn("option2");
        when(option2.getLongOpt()).thenReturn("option2");
        group.addOption(option2);
        Collection<String> names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("option1"));
        assertTrue(names.contains("option2"));
    }
}