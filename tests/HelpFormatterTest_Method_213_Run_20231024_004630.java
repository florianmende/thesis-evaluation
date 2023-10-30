package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_213_Run_20231024_004630 {
    @Test
    public void testSetOptPrefix() {
        // Test that the method sets the value of the 'defaultOptPrefix' field correctly when a valid prefix is provided.
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        Assertions.assertEquals("-", formatter.getOptPrefix());

        // Test that the method sets the value of the 'defaultOptPrefix' field to null when a null prefix is provided.
        formatter.setOptPrefix(null);
        Assertions.assertNull(formatter.getOptPrefix());

        // Test that the method sets the value of the 'defaultOptPrefix' field to an empty string when an empty prefix is provided.
        formatter.setOptPrefix("");
        Assertions.assertEquals("", formatter.getOptPrefix());
    }
}