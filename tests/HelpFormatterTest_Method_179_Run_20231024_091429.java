package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.Assert;
import org.junit.Test;

public class HelpFormatterTest_Method_179_Run_20231024_091429 {

    @Test
    public void testGetArgName() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("argName");
        Assert.assertEquals("argName", formatter.getArgName());
    }
}