package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class OptionTest_Method_81_Run_20231026_105918 {

    @Mock
    private Option option;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetLongOpt() {
        // case 1: the option has a long name
        when(option.getLongOpt()).thenReturn("long-option");
        assertEquals("long-option", option.getLongOpt());

        // case 2: the option does not have a long name
        when(option.getLongOpt()).thenReturn(null);
        assertNull(option.getLongOpt());

        // case 3: the option has a null long name
        when(option.getLongOpt()).thenReturn(null);
        assertNull(option.getLongOpt());
    }
}