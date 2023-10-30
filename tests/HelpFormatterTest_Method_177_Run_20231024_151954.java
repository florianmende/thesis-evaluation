package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.Assert;
import org.junit.Test;

public class HelpFormatterTest_Method_177_Run_20231024_151954 {
    @Test
    public void testCreatePaddingLength() {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(10);
        Assert.assertEquals(10, padding.length());
    }

    @Test
    public void testCreatePaddingContent() {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(10);
        Assert.assertTrue(padding.matches("^\\s+$"));
    }

    @Test
    public void testCreatePaddingNewInstance() {
        HelpFormatter formatter = new HelpFormatter();
        String padding1 = formatter.createPadding(10);
        String padding2 = formatter.createPadding(10);
        Assert.assertNotSame(padding1, padding2);
    }
}