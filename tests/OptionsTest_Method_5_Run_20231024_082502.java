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

public class OptionsTest_Method_5_Run_20231024_082502 {
    @Test
    public void testAddOptionGroup() {
        // Set up mock OptionGroup
        OptionGroup mockGroup = mock(OptionGroup.class);
        when(mockGroup.isRequired()).thenReturn(true);
        Option mockOption1 = mock(Option.class);
        Option mockOption2 = mock(Option.class);
        List<Option> mockOptions = new ArrayList<>();
        mockOptions.add(mockOption1);
        mockOptions.add(mockOption2);
        when(mockGroup.getOptions()).thenReturn(mockOptions);

        // Set up Options instance
        Options options = new Options();

        // Call the method
        options.addOptionGroup(mockGroup);

        // Verify that the option group was added to the Options instance
        assertTrue(options.getOptionGroups().contains(mockGroup));

        // Verify that the required property of each option in the group was set to false
        assertEquals(false, mockOption1.isRequired());
        assertEquals(false, mockOption2.isRequired());

        // Verify that the option group was set as required if it is required
        assertTrue(options.getRequiredOptions().contains(mockGroup));
    }
}