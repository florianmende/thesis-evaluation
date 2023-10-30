package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_80_Run_20231024_080105 {
    @Test
    public void testConstructor() {
        // Test that the Option object is initialized correctly with a short name, a long name, and a description
        Option option = new Option("a", "--arg", true, "This is a test option");
        Assertions.assertEquals("a", option.getOpt());
        Assertions.assertEquals("--arg", option.getLongOpt());
        Assertions.assertEquals("This is a test option", option.getDescription());
        Assertions.assertTrue(option.hasArg());

        // Test that the Option object is initialized correctly with a short name and a description, and that the hasArg argument is set to false
        option = new Option("b", null, false, "This is another test option");
        Assertions.assertEquals("b", option.getOpt());
        Assertions.assertNull(option.getLongOpt());
        Assertions.assertEquals("This is another test option", option.getDescription());
        Assertions.assertFalse(option.hasArg());

        // Test that the Option object is initialized correctly with a short name, a long name, and a description, and that the hasArg argument is set to true
        option = new Option("c", "--count", true, "This is a test option with an argument");
        Assertions.assertEquals("c", option.getOpt());
        Assertions.assertEquals("--count", option.getLongOpt());
        Assertions.assertEquals("This is a test option with an argument", option.getDescription());
        Assertions.assertTrue(option.hasArg());
    }
}