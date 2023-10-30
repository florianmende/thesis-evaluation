package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_206_Run_20231030_094427 {

    @Test
    public void testSetArgName() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setArgName("test");
        Assertions.assertEquals("test", helpFormatter.getArgName());
    }

    @Test
    public void testSetArgNameNull() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setArgName(null);
        Assertions.assertNull(helpFormatter.getArgName());
    }

    @Test
    public void testSetArgNameEmpty() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setArgName("");
        Assertions.assertEquals("", helpFormatter.getArgName());
    }
}