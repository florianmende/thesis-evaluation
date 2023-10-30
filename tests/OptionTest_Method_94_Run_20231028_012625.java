package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class OptionTest_Method_94_Run_20231028_012625 {

    @Mock
    private Option option;

    @Test
    public void testHasLongOpt() {
        Mockito.when(option.hasLongOpt()).thenReturn(true);
        Assert.assertTrue(option.hasLongOpt());
    }

    @Test
    public void testHasNoLongOpt() {
        Mockito.when(option.hasLongOpt()).thenReturn(false);
        Assert.assertFalse(option.hasLongOpt());
    }
}