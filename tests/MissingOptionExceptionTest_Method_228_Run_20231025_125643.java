package org.apache.commons.cli;


import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MissingOptionExceptionTest_Method_228_Run_20231025_125643 {

    @Test
    void testGetMissingOptions_emptyList() {
        // Given
        List<OptionGroup> missingOptions = new ArrayList<>();
        MissingOptionException exception = new MissingOptionException(missingOptions);

        // When
        List<OptionGroup> actual = exception.getMissingOptions();

        // Then
        assertEquals(0, actual.size());
    }

    @Test
    void testGetMissingOptions_singleOption() {
        // Given
        List<OptionGroup> missingOptions = new ArrayList<>();
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "desc");
        optionGroup.addOption(option);
        missingOptions.add(optionGroup);
        MissingOptionException exception = new MissingOptionException(missingOptions);

        // When
        List<OptionGroup> actual = exception.getMissingOptions();

        // Then
        assertEquals(1, actual.size());
        assertEquals(optionGroup, actual.get(0));
    }

    @Test
    void testGetMissingOptions_multipleOptions() {
        // Given
        List<OptionGroup> missingOptions = new ArrayList<>();
        OptionGroup optionGroup1 = new OptionGroup();
        OptionGroup optionGroup2 = new OptionGroup();
        Option option1 = new Option("a", "desc");
        Option option2 = new Option("b", "desc");
        optionGroup1.addOption(option1);
        optionGroup1.addOption(option2);
        missingOptions.add(optionGroup1);
        missingOptions.add(optionGroup2);
        MissingOptionException exception = new MissingOptionException(missingOptions);

        // When
        List<OptionGroup> actual = exception.getMissingOptions();

        // Then
        assertEquals(2, actual.size());
        assertEquals(optionGroup1, actual.get(0));
        assertEquals(optionGroup2, actual.get(1));
    }

    @Test
    void testGetMissingOptions_optionGroup() {
        // Given
        List<OptionGroup> missingOptions = new ArrayList<>();
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("a", "desc");
        Option option2 = new Option("b", "desc");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        missingOptions.add(optionGroup);
        MissingOptionException exception = new MissingOptionException(missingOptions);

        // When
        List<OptionGroup> actual = exception.getMissingOptions();

        // Then
        assertEquals(1, actual.size());
        assertEquals(optionGroup, actual.get(0));
    }
}