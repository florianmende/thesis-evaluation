package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

class HelpFormatterTest_Method_210_Run_20231026_105918 {

    @Test
    void testSetLongOptSeparatorValidSeparator() throws IOException {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        org.junit.jupiter.api.Assertions.assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    void testSetLongOptSeparatorInvalidSeparator() throws IOException {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("invalid");
        org.junit.jupiter.api.Assertions.assertEquals("invalid", formatter.getLongOptSeparator());
    }

    @Test
    void testSetLongOptSeparatorNull() throws IOException {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator(null);
        org.junit.jupiter.api.Assertions.assertEquals(null, formatter.getLongOptSeparator());
    }
}