package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionGroupTest_Method_23_Run_20231026_105918 {

    @Mock
    private Option option;

    @Test
    public void testSetRequiredTrue() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertEquals(true, optionGroup.isRequired());
    }

    @Test
    public void testSetRequiredFalse() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        assertEquals(false, optionGroup.isRequired());
    }

    @Test
    public void testSetRequiredSameValue() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        optionGroup.setRequired(true);
        assertEquals(true, optionGroup.isRequired());
    }
}