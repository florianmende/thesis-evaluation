package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class OptionsTest_Method_5_Run_20231028_042634 {
    @Mock
    private OptionGroup mockGroup;

    @Mock
    private Option mockOption;

    @Test
    public void testAddOptionGroupRequired() {
        // Set up mocks
        MockitoAnnotations.initMocks(this);
        when(mockGroup.isRequired()).thenReturn(true);
        when(mockGroup.getOptions()).thenReturn(List.of(mockOption));

        // Create Options instance
        Options options = new Options();

        // Add option group
        options.addOptionGroup(mockGroup);

        // Verify that the option group was added to the requiredOpts list
        assertTrue(options.getRequiredOptions().contains(mockGroup));
    }

    @Test
    public void testAddOptionGroupNotRequired() {
        // Set up mocks
        MockitoAnnotations.initMocks(this);
        when(mockGroup.isRequired()).thenReturn(false);
        when(mockGroup.getOptions()).thenReturn(List.of(mockOption));

        // Create Options instance
        Options options = new Options();

        // Add option group
        options.addOptionGroup(mockGroup);

        // Verify that the option group was not added to the requiredOpts list
        assertFalse(options.getRequiredOptions().contains(mockGroup));
    }

    @Test
    public void testAddOptionGroupOptions() {
        // Set up mocks
        MockitoAnnotations.initMocks(this);
        when(mockGroup.isRequired()).thenReturn(true);
        when(mockGroup.getOptions()).thenReturn(List.of(mockOption));

        // Create Options instance
        Options options = new Options();

        // Add option group
        options.addOptionGroup(mockGroup);

        // Verify that the option was added to the Options instance
        assertTrue(options.getOptions().contains(mockOption));

        // Verify that the option's required field was set to false
        assertFalse(mockOption.isRequired());
    }

    @Test
    public void testAddOptionGroupOptionGroups() {
        // Set up mocks
        MockitoAnnotations.initMocks(this);
        when(mockGroup.isRequired()).thenReturn(true);
        when(mockGroup.getOptions()).thenReturn(List.of(mockOption));

        // Create Options instance
        Options options = new Options();

        // Add option group
        options.addOptionGroup(mockGroup);

        // Verify that the option group was added to the optionGroups map
        assertEquals(options.getOptionGroup(mockOption), mockGroup);
    }
}