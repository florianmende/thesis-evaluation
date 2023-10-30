package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_5_Run_20231024_165833 {
    @Test
    void testAddOptionGroup() {
        // Create a mock OptionGroup object
        OptionGroup group = mock(OptionGroup.class);
        when(group.isRequired()).thenReturn(true);
        List<Option> optionsList = new ArrayList<>();
        optionsList.add(new Option("a", "aaa", false, "aaa"));
        optionsList.add(new Option("b", "bbb", false, "bbb"));
        when(group.getOptions()).thenReturn(optionsList);
        
        // Create an Options instance and add the OptionGroup
        Options options = new Options();
        options.addOptionGroup(group);
        
        // Verify that the OptionGroup was added correctly
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertTrue(optionGroups.contains(group));
        
        // Verify that the OptionGroup was added to the requiredOpts list
        List<Option> requiredOptions = options.getRequiredOptions();
        assertTrue(requiredOptions.contains(group));
        
        // Verify that the Option objects in the OptionGroup were added correctly
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
    }
}