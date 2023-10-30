package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CommandLineTest_Method_142_Run_20231025_100630 {

    @Mock
    private CommandLine commandLine;

    @Test
    public void testGetOptionValues_setAndHasArgument() {
        // Setup
        String[] expectedValues = new String[]{"value1", "value2"};
        when(commandLine.getOptionValues("opt")).thenReturn(expectedValues);

        // Execute
        String[] actualValues = commandLine.getOptionValues("opt");

        // Verify
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testGetOptionValues_setButNoArgument() {
        // Setup
        when(commandLine.getOptionValues("opt")).thenReturn(null);

        // Execute
        String[] actualValues = commandLine.getOptionValues("opt");

        // Verify
        assertNull(actualValues);
    }

    @Test
    public void testGetOptionValues_notSet() {
        // Setup
        when(commandLine.getOptionValues("opt")).thenReturn(null);

        // Execute
        String[] actualValues = commandLine.getOptionValues("opt");

        // Verify
        assertNull(actualValues);
    }
}