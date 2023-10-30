package org.apache.commons.cli;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OptionsTest_Method_12_Run_20231028_052637 {
    @Mock
    private Options options;

    @Test
    public void testGetRequiredOptions_EmptyList() {
        List<String> requiredOpts = new ArrayList<>();
        when(options.getRequiredOptions()).thenReturn(requiredOpts);
        assertEquals(0, options.getRequiredOptions().size());
    }

    @Test
    public void testGetRequiredOptions_NonEmptyList() {
        List<String> requiredOpts = new ArrayList<>();
        requiredOpts.add("opt1");
        requiredOpts.add("opt2");
        when(options.getRequiredOptions()).thenReturn(requiredOpts);
        assertEquals(2, options.getRequiredOptions().size());
        assertTrue(options.getRequiredOptions().contains("opt1"));
        assertTrue(options.getRequiredOptions().contains("opt2"));
    }

    @Test
    public void testGetRequiredOptions_NoRequiredOptions() {
        List<String> requiredOpts = new ArrayList<>();
        when(options.getRequiredOptions()).thenReturn(requiredOpts);
        assertEquals(0, options.getRequiredOptions().size());
    }
}