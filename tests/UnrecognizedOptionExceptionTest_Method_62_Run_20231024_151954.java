package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;

import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231024_151954 {

    @Test
    public void testGetOptionWithOption() throws Exception {
        // Create a mock instance of UnrecognizedOptionException with a mock option
        UnrecognizedOptionException exception = mock(UnrecognizedOptionException.class);
        String option = "test";
        when(exception.getOption()).thenReturn(option);

        // Call the getOption() method on the mock instance
        String actualOption = exception.getOption();

        // Verify that the method returns the correct option
        assertEquals(option, actualOption);
    }

    @Test
    public void testGetOptionWithoutOption() throws Exception {
        // Create a mock instance of UnrecognizedOptionException without a mock option
        UnrecognizedOptionException exception = mock(UnrecognizedOptionException.class);

        // Call the getOption() method on the mock instance
        String actualOption = exception.getOption();

        // Verify that the method returns null
        assertNull(actualOption);
    }

    @Test
    public void testGetOptionWithNullOption() throws Exception {
        // Create a mock instance of UnrecognizedOptionException with a null option
        UnrecognizedOptionException exception = mock(UnrecognizedOptionException.class);
        when(exception.getOption()).thenReturn(null);

        // Call the getOption() method on the mock instance
        String actualOption = exception.getOption();

        // Verify that the method returns null
        assertNull(actualOption);
    }
}