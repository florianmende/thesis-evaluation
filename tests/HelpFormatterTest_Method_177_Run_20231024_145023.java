package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_177_Run_20231024_145023 {
    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();

        // Test that the method returns a string of the correct length
        Assertions.assertEquals(formatter.createPadding(5), "     ");

        // Test that the method returns a string consisting only of space characters
        Assertions.assertTrue(formatter.createPadding(10).matches("^\\s+$"));

        // Test that the method returns a different string when called with different input lengths
        Assertions.assertNotEquals(formatter.createPadding(5), formatter.createPadding(10));
    }
}