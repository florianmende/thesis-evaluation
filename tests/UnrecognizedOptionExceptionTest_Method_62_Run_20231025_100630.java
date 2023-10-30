package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231025_100630 {
    @Test
    public void testGetOptionValidOption() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Invalid option", "--invalid");
        assertEquals("--invalid", exception.getOption());
    }

    @Test
    public void testGetOptionInvalidOption() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Invalid option", "--invalid");
        assertEquals("--invalid", exception.getOption());
    }

    @Test
    public void testGetOptionSameOptionAsConstructor() {
        UnrecognizedOptionException exception = new UnrecognizedOptionException("Invalid option", "--invalid");
        assertEquals("--invalid", exception.getOption());
    }
}