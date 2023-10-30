package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_19_Run_20231028_032631 {
    @Test
    public void testGetNamesEmptyGroup() {
        // Create an empty option group
        OptionGroup group = new OptionGroup();
        
        // Call the getNames() method
        Collection<String> names = group.getNames();
        
        // Verify that the method returns an empty collection
        assertTrue(names.isEmpty());
    }
    
    @Test
    public void testGetNamesOneOption() {
        // Create an option group with one option
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("option1");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        
        // Call the getNames() method
        Collection<String> names = group.getNames();
        
        // Verify that the method returns a collection with one element, which is the name of the option
        assertEquals(1, names.size());
        assertTrue(names.contains("option1"));
    }
    
    @Test
    public void testGetNamesMultipleOptions() {
        // Create an option group with multiple options
        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("option1");
        Option option2 = mock(Option.class);
        when(option2.getKey()).thenReturn("option2");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        
        // Call the getNames() method
        Collection<String> names = group.getNames();
        
        // Verify that the method returns a collection with multiple elements, which are the names of the options
        assertEquals(2, names.size());
        assertTrue(names.contains("option1"));
        assertTrue(names.contains("option2"));
    }
}