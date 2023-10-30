package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_78_Run_20231030_094427 {

    @Test
    public void testGetDescription() {
        Option option = new Option("a", "description");
        assertEquals("description", option.getDescription());

        option = new Option("a", null);
        assertEquals(null, option.getDescription());

        option = new Option("a", "");
        assertEquals("", option.getDescription());
    }

    @Test
    public void testGetDescriptionWithMocks() {
        Option option = mock(Option.class);
        when(option.getDescription()).thenReturn("description");
        assertEquals("description", option.getDescription());

        option = mock(Option.class);
        when(option.getDescription()).thenReturn(null);
        assertEquals(null, option.getDescription());

        option = mock(Option.class);
        when(option.getDescription()).thenReturn("");
        assertEquals("", option.getDescription());
    }
}