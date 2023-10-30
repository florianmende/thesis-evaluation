package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OptionBuilderTest_Method_166_Run_20231025_105031 {
    @Mock
    private OptionBuilder optionBuilder;

    @Test
    public void testIsRequiredTrue() {
        optionBuilder.isRequired(true);
        Mockito.verify(optionBuilder).isRequired(true);
    }

    @Test
    public void testIsRequiredFalse() {
        optionBuilder.isRequired(false);
        Mockito.verify(optionBuilder).isRequired(false);
    }

    @Test
    public void testIsRequiredSameValue() {
        optionBuilder.isRequired(true);
        Mockito.verify(optionBuilder, Mockito.never()).isRequired(false);
    }
}