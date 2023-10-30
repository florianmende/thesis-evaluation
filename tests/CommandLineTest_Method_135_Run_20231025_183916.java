package org.apache.commons.cli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CommandLineTest_Method_135_Run_20231025_183916 {

    @Mock
    private CommandLine commandLine;

    @Mock
    private Option option1;

    @Mock
    private Option option2;

    @Test
    public void testGetOptions_Empty() {
        when(commandLine.getOptions()).thenReturn(Option.EMPTY_ARRAY);
        assertEquals(0, commandLine.getOptions().length);
    }

    @Test
    public void testGetOptions_SingleOption() {
        when(commandLine.getOptions()).thenReturn(new Option[]{option1});
        assertEquals(1, commandLine.getOptions().length);
        assertEquals(option1, commandLine.getOptions()[0]);
    }

    @Test
    public void testGetOptions_MultipleOptions() {
        when(commandLine.getOptions()).thenReturn(new Option[]{option1, option2});
        assertEquals(2, commandLine.getOptions().length);
        assertEquals(option1, commandLine.getOptions()[0]);
        assertEquals(option2, commandLine.getOptions()[1]);
    }
}