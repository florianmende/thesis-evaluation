package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_187_Run_20231025_183916 {

    @Test
    public void testGetSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("test");
        Assert.assertEquals("test", formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetSyntaxPrefixWithEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        Assert.assertEquals("", formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetSyntaxPrefixWithNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);
        Assert.assertNull(formatter.getSyntaxPrefix());
    }
}