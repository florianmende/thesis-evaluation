package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.Test;

class OptionGroupTest_Method_19_Run_20231025_125643 {
    @Test
    void testGetNames() {
        // create a new OptionGroup
        OptionGroup group = new OptionGroup();

        // add some options to the group
        group.addOption(new Option("a", "aaa"));
        group.addOption(new Option("b", "bbb"));
        group.addOption(new Option("c", "ccc"));

        // get the names of the options in the group
        Collection<String> names = group.getNames();

        // verify that the names are correct
        assertEquals(3, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
        assertTrue(names.contains("c"));
    }
}