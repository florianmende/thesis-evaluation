package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_11_Run_20231024_151954 {

    @Test
    void testGetOptions() {
        // Case 1: The method should return a non-empty collection of options when there are options added to the Options instance.
        Options options = new Options();
        options.addOption("a", "aaa", false, "Option A");
        options.addOption("b", "bbb", false, "Option B");
        options.addOption("c", "ccc", false, "Option C");
        Collection<Option> actualOptions = options.getOptions();
        assertFalse(actualOptions.isEmpty());
        assertEquals(3, actualOptions.size());
        assertTrue(actualOptions.contains(new Option("a", "aaa", false, "Option A")));
        assertTrue(actualOptions.contains(new Option("b", "bbb", false, "Option B")));
        assertTrue(actualOptions.contains(new Option("c", "ccc", false, "Option C")));

        // Case 2: The method should return an empty collection of options when there are no options added to the Options instance.
        Options emptyOptions = new Options();
        Collection<Option> emptyActualOptions = emptyOptions.getOptions();
        assertTrue(emptyActualOptions.isEmpty());

        // Case 3: The method should return a read-only collection of options, meaning that the caller cannot modify the collection.
        Options readonlyOptions = new Options();
        readonlyOptions.addOption("a", "aaa", false, "Option A");
        readonlyOptions.addOption("b", "bbb", false, "Option B");
        readonlyOptions.addOption("c", "ccc", false, "Option C");
        Collection<Option> readonlyActualOptions = readonlyOptions.getOptions();
        assertThrows(UnsupportedOperationException.class, () -> readonlyActualOptions.add(new Option("d", "ddd", false, "Option D")));
        assertThrows(UnsupportedOperationException.class, () -> readonlyActualOptions.remove(new Option("a", "aaa", false, "Option A")));
        assertThrows(UnsupportedOperationException.class, () -> readonlyActualOptions.clear());
    }
}