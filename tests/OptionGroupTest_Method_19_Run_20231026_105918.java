package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OptionGroupTest_Method_19_Run_20231026_105918 {

    @Test
    void testGetNames() {
        // Create a mock OptionGroup instance
        OptionGroup group = Mockito.mock(OptionGroup.class);

        // Mock the getNames() method to return a specific collection of names
        Mockito.when(group.getNames()).thenReturn(Arrays.asList("name1", "name2", "name3"));

        // Test that the getNames() method returns the expected collection of names
        Collection<String> names = group.getNames();
        assertEquals(3, names.size());
        assertTrue(names.contains("name1"));
        assertTrue(names.contains("name2"));
        assertTrue(names.contains("name3"));

        // Test that the getNames() method returns an empty collection if no options are added
        Mockito.when(group.getNames()).thenReturn(Collections.emptyList());
        names = group.getNames();
        assertTrue(names.isEmpty());
    }

}