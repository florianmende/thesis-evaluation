package org.apache.commons.cli;


import org.junit.Test;
import org.junit.Assert;

public class HelpFormatterTest_Method_209_Run_20231028_012625 {

    @Test
    public void testSetLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("test");
        Assert.assertEquals("test", formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix(null);
        Assert.assertEquals(null, formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptPrefixEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("");
        Assert.assertEquals("", formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptPrefixNullException() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix(null);
        Assert.assertNull(formatter.getLongOptPrefix());
    }
}