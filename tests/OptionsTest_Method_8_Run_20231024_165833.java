package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionsTest_Method_8_Run_20231024_165833 {
    @Test
    public void testGetOption_NotFound() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.getOption("not_found")).thenReturn(null);

        assertNull(options.getOption("not_found"));
    }

    @Test
    public void testGetOption_ShortName() {
        Options options = new Options();
        Option option = new Option("s", "short", false, "Short option");
        options.addOption(option);

        assertEquals(option, options.getOption("s"));
    }

    @Test
    public void testGetOption_LongName() {
        Options options = new Options();
        Option option = new Option("l", "long", false, "Long option");
        options.addOption(option);

        assertEquals(option, options.getOption("long"));
    }
}