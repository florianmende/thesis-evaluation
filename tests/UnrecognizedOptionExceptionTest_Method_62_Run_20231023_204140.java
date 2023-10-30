package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231023_204140 {
    @Test
    public void testGetOption_Null() {
        UnrecognizedOptionException ex = new UnrecognizedOptionException("message", null);
        assertNull(ex.getOption());
    }

    @Test
    public void testGetOption_EmptyString() {
        UnrecognizedOptionException ex = new UnrecognizedOptionException("message", "");
        assertEquals("", ex.getOption());
    }

    @Test
    public void testGetOption_ValidString() {
        UnrecognizedOptionException ex = new UnrecognizedOptionException("message", "option");
        assertEquals("option", ex.getOption());
    }
}