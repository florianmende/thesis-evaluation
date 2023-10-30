package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class HelpFormatterTest_Method_188_Run_20231024_151954 {
    @Test
    void testGetWidth() {
        HelpFormatter formatter = new HelpFormatter();

        // Case 1: Positive integer
        formatter.setWidth(10);
        Assertions.assertEquals(10, formatter.getWidth());

        // Case 2: Zero
        formatter.setWidth(0);
        Assertions.assertEquals(0, formatter.getWidth());

        // Case 3: Negative integer
        formatter.setWidth(-10);
        Assertions.assertEquals(-10, formatter.getWidth());
    }
}