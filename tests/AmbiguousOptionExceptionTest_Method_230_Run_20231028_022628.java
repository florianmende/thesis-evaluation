package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AmbiguousOptionExceptionTest_Method_230_Run_20231028_022628 {
    @Test
    public void testGetMatchingOptionsEmpty() {
        // Create a mock instance of AmbiguousOptionException
        AmbiguousOptionException mockException = Mockito.mock(AmbiguousOptionException.class);
        
        // Set up the mock to return an empty collection
        Mockito.when(mockException.getMatchingOptions()).thenReturn(Collections.emptyList());
        
        // Call the getMatchingOptions() method and assert that it returns an empty collection
        Collection<String> actual = mockException.getMatchingOptions();
        assertEquals(Collections.emptyList(), actual);
    }
    
    @Test
    public void testGetMatchingOptionsOneOption() {
        // Create a mock instance of AmbiguousOptionException
        AmbiguousOptionException mockException = Mockito.mock(AmbiguousOptionException.class);
        
        // Set up the mock to return a collection with one option
        Mockito.when(mockException.getMatchingOptions()).thenReturn(Arrays.asList("option1"));
        
        // Call the getMatchingOptions() method and assert that it returns a collection with one option
        Collection<String> actual = mockException.getMatchingOptions();
        assertEquals(Arrays.asList("option1"), actual);
    }
    
    @Test
    public void testGetMatchingOptionsMultipleOptions() {
        // Create a mock instance of AmbiguousOptionException
        AmbiguousOptionException mockException = Mockito.mock(AmbiguousOptionException.class);
        
        // Set up the mock to return a collection with multiple options
        Mockito.when(mockException.getMatchingOptions()).thenReturn(Arrays.asList("option1", "option2", "option3"));
        
        // Call the getMatchingOptions() method and assert that it returns a collection with multiple options
        Collection<String> actual = mockException.getMatchingOptions();
        assertEquals(Arrays.asList("option1", "option2", "option3"), actual);
    }
}