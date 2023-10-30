package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.MissingOptionException;
import org.junit.jupiter.api.Test;

public class MissingOptionExceptionTest_Method_227_Run_20231024_145023 {

    private List<String> missingOptions;

    @Test
    public void testCreateMessageWithSingleMissingOption() {
        missingOptions = new ArrayList<>();
        missingOptions.add("option1");

        String expectedMessage = "Missing required option: option1";

        String actualMessage = new MissingOptionException(missingOptions).getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testCreateMessageWithMultipleMissingOptions() {
        missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        missingOptions.add("option2");

        String expectedMessage = "Missing required options: option1, option2";

        String actualMessage = new MissingOptionException(missingOptions).getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testCreateMessageWithNoMissingOptions() {
        missingOptions = new ArrayList<>();

        String expectedMessage = "Missing required options: ";

        String actualMessage = new MissingOptionException(missingOptions).getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    public List<String> getMissingOptions() {
        return missingOptions;
    }
}