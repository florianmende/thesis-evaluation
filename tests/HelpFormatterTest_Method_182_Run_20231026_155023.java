package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_182_Run_20231026_155023 {
    @Test
    public void testGetLongOptPrefix() {
        // Case 1: Non-empty string
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");
        Assertions.assertEquals("--", formatter.getLongOptPrefix());

        // Case 2: Empty string
        formatter.setLongOptPrefix("");
        Assertions.assertEquals("", formatter.getLongOptPrefix());

        // Case 3: Null
        formatter.setLongOptPrefix(null);
        Assertions.assertNull(formatter.getLongOptPrefix());
    }
}