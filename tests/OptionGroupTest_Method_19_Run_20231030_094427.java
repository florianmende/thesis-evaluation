package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_19_Run_20231030_094427 {

    @Test
    public void testGetNamesEmpty() {
        OptionGroup group = new OptionGroup();
        Collection<String> names = group.getNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void testGetNamesSingleOption() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("foo", "bar");
        group.addOption(option);
        Collection<String> names = group.getNames();
        assertEquals(1, names.size());
        assertTrue(names.contains("foo"));
    }

    @Test
    public void testGetNamesMultipleOptions() {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("foo", "bar");
        Option option2 = new Option("baz", "qux");
        group.addOption(option1);
        group.addOption(option2);
        Collection<String> names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("baz"));
    }
}