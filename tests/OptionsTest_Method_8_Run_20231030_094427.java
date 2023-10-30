package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionsTest_Method_8_Run_20231030_094427 {
    @Mock
    private Options options;

    @Test
    public void testGetOption_shortNameMatch() {
        // Set up the mock
        Mockito.when(options.getOption("s")).thenReturn(new Option("s", "short"));

        // Test the method
        Assertions.assertEquals(new Option("s", "short"), options.getOption("s"));
    }

    @Test
    public void testGetOption_longNameMatch() {
        // Set up the mock
        Mockito.when(options.getOption("l")).thenReturn(new Option("s", "long"));

        // Test the method
        Assertions.assertEquals(new Option("s", "long"), options.getOption("l"));
    }

    @Test
    public void testGetOption_bothMatch() {
        // Set up the mock
        Mockito.when(options.getOption("s")).thenReturn(new Option("s", "short"));
        Mockito.when(options.getOption("l")).thenReturn(new Option("s", "long"));

        // Test the method
        Assertions.assertEquals(new Option("s", "short"), options.getOption("s"));
        Assertions.assertEquals(new Option("s", "long"), options.getOption("l"));
    }
}