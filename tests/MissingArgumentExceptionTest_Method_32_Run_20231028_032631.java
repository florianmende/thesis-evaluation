package org.apache.commons.cli;

import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissingArgumentExceptionTest_Method_32_Run_20231028_032631 {

    @Test
    public void testGetOption() {
        // Test case 1: Check if the getOption() method returns the correct option object when the exception is created with the option object.
        Option option = new Option("option", "option description");
        MissingArgumentException exception = new MissingArgumentException(option);
        assertEquals(option, exception.getOption());

        // Test case 2: Check if the getOption() method returns null when the exception is created without the option object.
        exception = new MissingArgumentException("Missing argument for option: " + option.getKey());
        assertNull(exception.getOption());

        // Test case 3: Check if the getOption() method returns the correct option object when the exception is created with the option object and the getOption() method is called multiple times.
        exception = new MissingArgumentException(option);
        assertEquals(option, exception.getOption());
        assertEquals(option, exception.getOption());
    }
}