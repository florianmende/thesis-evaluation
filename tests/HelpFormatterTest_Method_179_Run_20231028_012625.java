package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HelpFormatterTest_Method_179_Run_20231028_012625 {

    @Mock
    private HelpFormatter formatter;

    @Test
    public void testGetArgName() {
        // Set up the mock formatter
        Mockito.when(formatter.getArgName()).thenReturn("testArgName");

        // Test case 1: The method returns the correct value when the defaultArgName field is set to a valid value.
        assertEquals("testArgName", formatter.getArgName());

        // Test case 2: The method returns the correct value when the defaultArgName field is set to a null value.
        Mockito.when(formatter.getArgName()).thenReturn(null);
        assertNull(formatter.getArgName());

        // Test case 3: The method returns the correct value when the defaultArgName field is set to an empty string.
        Mockito.when(formatter.getArgName()).thenReturn("");
        assertEquals("", formatter.getArgName());
    }
}