package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_91_Run_20231023_195751 {
    @Test
    public void testHasArgName_null() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(false);
        Assertions.assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgName_emptyString() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(false);
        Assertions.assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgName_nonEmptyString() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(true);
        Assertions.assertTrue(option.hasArgName());
    }
}