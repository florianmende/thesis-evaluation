package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class HelpFormatterTest_Method_184_Run_20231026_105918 {
    @Test
    void testGetNewLine() {
        // Case 1: defaultNewLine is set to a non-null value
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("foo");
        Assert.assertEquals("foo", formatter.getNewLine());

        // Case 2: defaultNewLine is set to null
        formatter.setNewLine(null);
        Assert.assertNull(formatter.getNewLine());

        // Case 3: defaultNewLine is not set (i.e., it has its default value)
        formatter.setNewLine("");
        Assert.assertEquals("", formatter.getNewLine());
    }
}