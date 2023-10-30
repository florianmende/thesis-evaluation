package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class OptionsTest_Method_6_Run_20231026_105918 {
    @Test
    void testAddRequiredOption() {
        // Given
        Options options = new Options();
        String opt = "a";
        String longOpt = "aa";
        boolean hasArg = true;
        String description = "description";
        Option option = new Option(opt, longOpt, hasArg, description);
        option.setRequired(true);

        // When
        options.addOption(option);

        // Then
        List<Option> actualOptions = new ArrayList<>(options.getOptions());
        List<Option> expectedOptions = new ArrayList<>();
        expectedOptions.add(option);
        assertEquals(expectedOptions, actualOptions);
    }
}