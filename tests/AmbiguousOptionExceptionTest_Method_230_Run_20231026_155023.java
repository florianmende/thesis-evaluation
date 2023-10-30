package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;

class AmbiguousOptionExceptionTest_Method_230_Run_20231026_155023 {

    @Test
    void testGetMatchingOptions() {
        // Test case 1: Empty collection
        Collection<String> matchingOptions = new ArrayList<>();
        AmbiguousOptionException ex = new AmbiguousOptionException("option", matchingOptions);
        assertEquals(0, ex.getMatchingOptions().size());

        // Test case 2: Single option
        matchingOptions.add("option");
        ex = new AmbiguousOptionException("option", matchingOptions);
        assertEquals(1, ex.getMatchingOptions().size());
        assertEquals("option", ex.getMatchingOptions().iterator().next());

        // Test case 3: Multiple options
        matchingOptions.add("option2");
        ex = new AmbiguousOptionException("option", matchingOptions);
        assertEquals(2, ex.getMatchingOptions().size());
        Iterator<String> it = ex.getMatchingOptions().iterator();
        assertEquals("option", it.next());
        assertEquals("option2", it.next());
    }
}