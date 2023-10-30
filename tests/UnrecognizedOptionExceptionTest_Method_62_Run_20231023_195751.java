package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231023_195751 {

    @Test
    public void testGetOption() {
        // Case 1: The method returns the correct option when it is called on an instance of 
        // UnrecognizedOptionException that was constructed with an option.
        UnrecognizedOptionException exception = new UnrecognizedOptionException("message", "option");
        Assertions.assertEquals("option", exception.getOption());

        // Case 2: The method returns null when it is called on an instance of 
        // UnrecognizedOptionException that was constructed without an option.
        exception = new UnrecognizedOptionException("message");
        Assertions.assertNull(exception.getOption());

        // Case 3: The method returns null when it is called on an instance of 
        // UnrecognizedOptionException that was constructed with a null option.
        exception = new UnrecognizedOptionException("message", null);
        Assertions.assertNull(exception.getOption());
    }
}