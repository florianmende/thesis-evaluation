package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultParserTest_Method_57_Run_20231027_212614 {
    @Test
    public void testStripLeadingAndTrailingQuotesDefaultOff() throws Exception {
        // Set up the test data
        String inputString = "\"test string\"";
        String expectedOutputString = "test string";

        // Create a mock DefaultParser object
        DefaultParser mockParser = Mockito.mock(DefaultParser.class);

        // Use reflection to set the stripLeadingAndTrailingQuotes field to true
        Field field = DefaultParser.class.getDeclaredField("stripLeadingAndTrailingQuotes");
        field.setAccessible(true);
        field.set(mockParser, true);

        // Call the private method using reflection
        Method method = DefaultParser.class.getDeclaredMethod("stripLeadingAndTrailingQuotesDefaultOff", String.class);
        method.setAccessible(true);
        String outputString = (String) method.invoke(mockParser, inputString);

        // Verify the output
        assertEquals(expectedOutputString, outputString);
    }

    @Test
    public void testStripLeadingAndTrailingQuotesDefaultOffFalse() throws Exception {
        // Set up the test data
        String inputString = "\"test string\"";
        String expectedOutputString = "\"test string\"";

        // Create a mock DefaultParser object
        DefaultParser mockParser = Mockito.mock(DefaultParser.class);

        // Use reflection to set the stripLeadingAndTrailingQuotes field to false
        Field field = DefaultParser.class.getDeclaredField("stripLeadingAndTrailingQuotes");
        field.setAccessible(true);
        field.set(mockParser, false);

        // Call the private method using reflection
        Method method = DefaultParser.class.getDeclaredMethod("stripLeadingAndTrailingQuotesDefaultOff", String.class);
        method.setAccessible(true);
        String outputString = (String) method.invoke(mockParser, inputString);

        // Verify the output
        assertEquals(expectedOutputString, outputString);
    }

    @Test
    public void testStripLeadingAndTrailingQuotesDefaultOffNull() throws Exception {
        // Set up the test data
        String inputString = "\"test string\"";
        String expectedOutputString = "\"test string\"";

        // Create a mock DefaultParser object
        DefaultParser mockParser = Mockito.mock(DefaultParser.class);

        // Use reflection to set the stripLeadingAndTrailingQuotes field to null
        Field field = DefaultParser.class.getDeclaredField("stripLeadingAndTrailingQuotes");
        field.setAccessible(true);
        field.set(mockParser, null);

        // Call the private method using reflection
        Method method = DefaultParser.class.getDeclaredMethod("stripLeadingAndTrailingQuotesDefaultOff", String.class);
        method.setAccessible(true);
        String outputString = (String) method.invoke(mockParser, inputString);

        // Verify the output
        assertEquals(expectedOutputString, outputString);
    }
}