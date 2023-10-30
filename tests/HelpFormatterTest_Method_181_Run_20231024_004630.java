package org.apache.commons.cli;


import org.junit.Test;
import org.junit.Assert;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_181_Run_20231024_004630 {
    
    @Test
    public void testGetLeftPadding() {
        HelpFormatter formatter = new HelpFormatter();
        int leftPadding = formatter.getLeftPadding();
        Assert.assertEquals(leftPadding, 1);
    }
}