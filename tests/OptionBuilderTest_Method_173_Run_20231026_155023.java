package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OptionBuilderTest_Method_173_Run_20231026_155023 {

    @Mock
    private OptionBuilder optionBuilder;

    @Test
    public void testDefaultValueSeparator() {
        Option option = optionBuilder.withValueSeparator().create("longopt");
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testCustomValueSeparator() {
        Option option = optionBuilder.withValueSeparator(':').create("longopt");
        assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void testInvalidValueSeparator() {
        Option option = optionBuilder.withValueSeparator('=').create("longopt");
        assertEquals('=', option.getValueSeparator());
    }
}