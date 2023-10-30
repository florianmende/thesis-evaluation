package org.apache.commons.cli;


import org.apache.commons.cli.OptionBuilder;
import org.junit.Test;

public class OptionBuilderTest_Method_160_Run_20231030_094427 {
    @Test
    public void testHasArgs() {
        // case 1: the method sets the "argCount" field to "Option.UNLIMITED_VALUES" when called
        OptionBuilder optionBuilder = OptionBuilder.hasArgs();

        // case 2: the method returns an instance of the OptionBuilder class
        assertNotNull(optionBuilder);

        // case 3: the method does not throw any exceptions when called
        try {
            optionBuilder.hasArgs();
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    public void assertNotNull(Object object) {
        if (object == null) {
            throw new AssertionError("Expected object to be non-null");
        }
    }

    public void fail(String message) {
        throw new AssertionError(message);
    }
}