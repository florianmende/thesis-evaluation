package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231024_165833 {

    @Test
    public void testGetOptionWithOption() {
        String option = "test";
        UnrecognizedOptionException e = new UnrecognizedOptionException("Test message", option);
        assertEquals(option, e.getOption());
    }

    @Test
    public void testGetOptionWithoutOption() {
        UnrecognizedOptionException e = new UnrecognizedOptionException("Test message");
        assertNull(e.getOption());
    }

    @Test
    public void testGetOptionWithNullMessage() {
        String option = "test";
        UnrecognizedOptionException e = new UnrecognizedOptionException(null, option);
        assertEquals(option, e.getOption());
    }
}