package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;

public class HelpFormatterTest_Method_213_Run_20231025_125643 {

    @Test
    public void testSetOptPrefixNonNull() {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = "prefix";
        formatter.setOptPrefix(prefix);
        Assert.assertEquals(prefix, formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = null;
        formatter.setOptPrefix(prefix);
        Assert.assertNull(formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = "";
        formatter.setOptPrefix(prefix);
        Assert.assertEquals(prefix, formatter.getOptPrefix());
    }
}