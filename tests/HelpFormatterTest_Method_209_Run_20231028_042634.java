package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

class HelpFormatterTest_Method_209_Run_20231028_042634 {

    @Test
    void testSetLongOptPrefix() {
        // Case 1: The method sets the defaultLongOptPrefix field to the given prefix value when the prefix value is not null.
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setLongOptPrefix("prefix");
        assertEquals("prefix", helpFormatter.getLongOptPrefix());

        // Case 2: The method sets the defaultLongOptPrefix field to the given prefix value when the prefix value is null.
        helpFormatter = new HelpFormatter();
        helpFormatter.setLongOptPrefix(null);
        assertNull(helpFormatter.getLongOptPrefix());

        // Case 3: The method sets the defaultLongOptPrefix field to the given prefix value when the prefix value is an empty string.
        helpFormatter = new HelpFormatter();
        helpFormatter.setLongOptPrefix("");
        assertEquals("", helpFormatter.getLongOptPrefix());
    }
}