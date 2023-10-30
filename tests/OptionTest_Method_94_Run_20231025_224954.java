package org.apache.commons.cli;


import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class OptionTest_Method_94_Run_20231025_224954 {
    @Test
    public void testHasLongOpt() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasLongOpt()).thenReturn(true);
        Assert.assertTrue(option.hasLongOpt());
    }

    @Test
    public void testDoesNotHaveLongOpt() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasLongOpt()).thenReturn(false);
        Assert.assertFalse(option.hasLongOpt());
    }

    @Test
    public void testHasLongOptThatIsSameAsShortName() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasLongOpt()).thenReturn(true);
        Assert.assertTrue(option.hasLongOpt());
    }
}