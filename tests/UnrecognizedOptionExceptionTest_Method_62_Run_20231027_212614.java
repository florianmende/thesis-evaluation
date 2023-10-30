package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.UnrecognizedOptionException;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231027_212614 {
    @Test
    void testGetOptionWithOption() {
        String option = "testOption";
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Test message", option);
        Assertions.assertEquals(option, exception.getOption());
    }

    @Test
    void testGetOptionWithoutOption() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Test message");
        Assertions.assertNull(exception.getOption());
    }

    @Test
    void testGetOptionWithNullOption() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Test message", null);
        Assertions.assertNull(exception.getOption());
    }
}