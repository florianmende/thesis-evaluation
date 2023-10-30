package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class HelpFormatterTest_Method_186_Run_20231024_004630 {
    @Test
    void testGetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();

        // Case 1: Non-empty string
        formatter.setOptPrefix("--");
        Assertions.assertEquals("--", formatter.getOptPrefix());

        // Case 2: Empty string
        formatter.setOptPrefix("");
        Assertions.assertEquals("", formatter.getOptPrefix());

        // Case 3: Null value
        formatter.setOptPrefix(null);
        Assertions.assertNull(formatter.getOptPrefix());
    }
}