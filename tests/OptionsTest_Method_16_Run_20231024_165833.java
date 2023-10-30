package org.apache.commons.cli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OptionsTest_Method_16_Run_20231024_165833 {
    @Mock
    private Options options;

    @Test
    public void testHelpOptions_ReturnsListOfOptionObjects() {
        List<Option> expectedOptions = new ArrayList<>();
        expectedOptions.add(new Option("a", "aaa"));
        expectedOptions.add(new Option("b", "bbb"));
        expectedOptions.add(new Option("c", "ccc"));

        Mockito.when(options.helpOptions()).thenReturn(expectedOptions);

        List<Option> actualOptions = options.helpOptions();

        assertEquals(expectedOptions, actualOptions);
    }

    @Test
    public void testHelpOptions_ReturnsCorrectNumberOfOptionObjects() {
        List<Option> expectedOptions = new ArrayList<>();
        expectedOptions.add(new Option("a", "aaa"));
        expectedOptions.add(new Option("b", "bbb"));
        expectedOptions.add(new Option("c", "ccc"));

        Mockito.when(options.helpOptions()).thenReturn(expectedOptions);

        List<Option> actualOptions = options.helpOptions();

        assertEquals(3, actualOptions.size());
    }

    @Test
    public void testHelpOptions_ReturnsCorrectOptionObjects() {
        List<Option> expectedOptions = new ArrayList<>();
        expectedOptions.add(new Option("a", "aaa"));
        expectedOptions.add(new Option("b", "bbb"));
        expectedOptions.add(new Option("c", "ccc"));

        Mockito.when(options.helpOptions()).thenReturn(expectedOptions);

        List<Option> actualOptions = options.helpOptions();

        assertTrue(actualOptions.contains(new Option("a", "aaa")));
        assertTrue(actualOptions.contains(new Option("b", "bbb")));
        assertTrue(actualOptions.contains(new Option("c", "ccc")));
    }
}