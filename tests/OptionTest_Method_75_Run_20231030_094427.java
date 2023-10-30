package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class OptionTest_Method_75_Run_20231030_094427 {
    @Test
    public void testEqualsWithSameObject() {
        Option option = new Option("test", "test option");
        assertTrue(option.equals(option));
    }

    @Test
    public void testEqualsWithDifferentObject() {
        Option option = new Option("test", "test option");
        Object other = mock(Object.class);
        when(other.equals(option)).thenReturn(false);
        assertFalse(option.equals(other));
    }

    @Test
    public void testEqualsWithDifferentOption() {
        Option option = new Option("test", "test option");
        Option other = new Option("other", "other option");
        assertFalse(option.equals(other));
    }
}