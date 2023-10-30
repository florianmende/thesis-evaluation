package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class OptionTest_Method_94_Run_20231028_052637 {
    @Mock
    private Option option;

    @Test
    public void testHasLongOpt() {
        // Set up the mock object
        Mockito.when(option.hasLongOpt()).thenReturn(true);

        // Call the method and check the result
        Assert.assertTrue(option.hasLongOpt());
    }
}