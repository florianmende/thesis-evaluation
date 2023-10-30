package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

class HelpFormatterTest_Method_209_Run_20231027_212614 {

    @Test
    void testSetLongOptPrefix() throws IOException {
        // Create a new HelpFormatter instance
        HelpFormatter formatter = new HelpFormatter();

        // Set the 'longOptPrefix' to a valid value
        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());

        // Set the 'longOptPrefix' to an empty string
        formatter.setLongOptPrefix("");
        assertEquals("", formatter.getLongOptPrefix());

        // Set the 'longOptPrefix' to a null value
        formatter.setLongOptPrefix(null);
        assertNull(formatter.getLongOptPrefix());
    }
}