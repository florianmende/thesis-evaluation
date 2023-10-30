package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import org.junit.jupiter.api.Test; // <-- Add this import statement

class OptionGroupTest_Method_19_Run_20231027_222616 {
    @Test
    void testGetNamesEmpty() {
        OptionGroup group = new OptionGroup();
        assertTrue(group.getNames().isEmpty());
    }

    @Test
    void testGetNamesWithOptions() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("name1", null, false, "description1"));
        group.addOption(new Option("name2", null, false, "description2"));
        Collection<String> names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("name1"));
        assertTrue(names.contains("name2"));
    }

    @Test
    void testGetNamesWithSelectedOptions() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("name1", null, false, "description1"));
        group.addOption(new Option("name2", null, false, "description2"));
        try {
            group.setSelected(new Option("name1", null, false, "description1"));
        } catch (AlreadySelectedException e) {
            // Handle the exception here
            e.printStackTrace();
        }
        Collection<String> names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("name1"));
        assertTrue(names.contains("name2"));
    }
}