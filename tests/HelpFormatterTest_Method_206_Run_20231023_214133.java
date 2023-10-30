package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_206_Run_20231023_214133 {
    @Test
    public void testSetArgNameNotNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("argName");
        Assertions.assertEquals("argName", formatter.getArgName());
    }

    @Test
    public void testSetArgNameNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName(null);
        Assertions.assertNull(formatter.getArgName());
    }

    @Test
    public void testSetArgNameSameValue() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("argName");
        Assertions.assertEquals("argName", formatter.getArgName());
    }
}