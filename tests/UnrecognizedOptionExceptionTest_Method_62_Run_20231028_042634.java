package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;

public class UnrecognizedOptionExceptionTest_Method_62_Run_20231028_042634 {

    @Test
    public void testGetOptionWithOption() {
        // Arrange
        String option = "--help";
        String message = "Unrecognized option: " + option;
        UnrecognizedOptionException exception = new UnrecognizedOptionException(message, option);

        // Act
        String actualOption = exception.getOption();

        // Assert
        assertEquals(option, actualOption);
    }

    @Test
    public void testGetOptionWithOptionAndMessage() {
        // Arrange
        String option = "--help";
        String message = "Unrecognized option: " + option;
        UnrecognizedOptionException exception = new UnrecognizedOptionException(message, option);

        // Act
        String actualOption = exception.getOption();

        // Assert
        assertEquals(option, actualOption);
    }

    @Test
    public void testGetOptionWithMessageOnly() {
        // Arrange
        String message = "Unrecognized option";
        UnrecognizedOptionException exception = new UnrecognizedOptionException(message);

        // Act
        String actualOption = exception.getOption();

        // Assert
        assertNull(actualOption);
    }
}