package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_11_Run_20231028_032631 {
    @Test
    public void testGetOptions() {
        // Create a mock Options object
        Options options = mock(Options.class);

        // Create a list of expected options
        List<Option> expectedOptions = new ArrayList<>();
        expectedOptions.add(new Option("a", "aaa", false, "Option A"));
        expectedOptions.add(new Option("b", "bbb", false, "Option B"));
        expectedOptions.add(new Option("c", "ccc", false, "Option C"));

        // Set up the mock to return the expected options
        when(options.getOptions()).thenReturn(expectedOptions);

        // Call the getOptions() method and check the result
        Collection<Option> actualOptions = options.getOptions();
        assertNotNull(actualOptions);
        assertEquals(expectedOptions.size(), actualOptions.size());
        assertEquals(expectedOptions, actualOptions);
    }
}