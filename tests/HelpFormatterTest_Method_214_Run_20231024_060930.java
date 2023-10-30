package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HelpFormatterTest_Method_214_Run_20231024_060930 {
    @Test
    void testSetSyntaxPrefix() {
        // Create a new HelpFormatter object
        HelpFormatter formatter = new HelpFormatter();

        // Set the defaultSyntaxPrefix field to a non-empty string
        formatter.setSyntaxPrefix("Prefix");

        // Check that the defaultSyntaxPrefix field is set to the correct value
        Assertions.assertEquals("Prefix", formatter.defaultSyntaxPrefix);

        // Set the defaultSyntaxPrefix field to an empty string
        formatter.setSyntaxPrefix("");

        // Check that the defaultSyntaxPrefix field is set to the correct value
        Assertions.assertEquals("", formatter.defaultSyntaxPrefix);

        // Set the defaultSyntaxPrefix field to null
        formatter.setSyntaxPrefix(null);

        // Check that the defaultSyntaxPrefix field is set to the correct value
        Assertions.assertEquals(null, formatter.defaultSyntaxPrefix);
    }
}