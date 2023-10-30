package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_16_Run_20231025_224954 {

    @Test
    void testHelpOptions() {
        Options options = new Options();
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(option1.getKey()).thenReturn("option1");
        when(option2.getKey()).thenReturn("option2");
        options.addOption(option1);
        options.addOption(option2);

        List<Option> expectedOptions = new ArrayList<>();
        expectedOptions.add(option1);
        expectedOptions.add(option2);

        List<Option> actualOptions = options.helpOptions();

        assertEquals(expectedOptions, actualOptions);
    }

    @Test
    void testHelpOptions_empty() {
        Options options = new Options();

        List<Option> expectedOptions = new ArrayList<>();

        List<Option> actualOptions = options.helpOptions();

        assertEquals(expectedOptions, actualOptions);
    }
}