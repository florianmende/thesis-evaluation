package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.Test;

public class OptionsTest_Method_8_Run_20231025_125643 {
    @Test
    public void testGetOption() {
        Options options = new Options();
        Option option = new Option("a", "aaa", false, "Option a");
        options.addOption(option);

        assertEquals(option, options.getOption("a"));
        assertEquals(option, options.getOption("aaa"));
        assertNull(options.getOption("b"));
    }

    @Test
    public void testGetOptionWithMock() {
        Options options = mock(Options.class);
        Option option = mock(Option.class);
        when(options.getOption("a")).thenReturn(option);

        assertEquals(option, options.getOption("a"));
        assertNull(options.getOption("b"));
    }
}