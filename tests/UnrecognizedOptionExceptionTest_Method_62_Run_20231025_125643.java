package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231025_125643 {

    @Test
    public void testGetOption() {
        UnrecognizedOptionException e = new UnrecognizedOptionException("message", "option");
        assertEquals("option", e.getOption());
    }
}