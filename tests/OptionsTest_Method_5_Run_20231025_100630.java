package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_5_Run_20231025_100630 {
    @Test
    public void testAddOptionGroup() {
        // Create a mock OptionGroup object
        OptionGroup group = mock(OptionGroup.class);
        when(group.isRequired()).thenReturn(true);
        List<Option> optionsList = new ArrayList<>();
        optionsList.add(new Option("a", "aaa"));
        optionsList.add(new Option("b", "bbb"));
        when(group.getOptions()).thenReturn(optionsList);

        // Create an Options object and add the OptionGroup
        Options options = new Options();
        options.addOptionGroup(group);

        // Verify that the OptionGroup was added correctly
        assertEquals(1, options.getOptionGroups().size());
        assertTrue(options.getOptionGroups().contains(group));

        // Verify that the Options were added correctly
        assertEquals(2, options.getOptions().size());
        assertTrue(options.getOptions().contains(new Option("a", "aaa")));
        assertTrue(options.getOptions().contains(new Option("b", "bbb")));
    }
}