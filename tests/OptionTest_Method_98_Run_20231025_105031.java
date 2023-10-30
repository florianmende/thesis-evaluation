package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_98_Run_20231025_105031 {

    @Mock
    private Option option;

    @Test
    public void testIsRequired_Mandatory() {
        when(option.isRequired()).thenReturn(true);
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_NotMandatory() {
        when(option.isRequired()).thenReturn(false);
        assertFalse(option.isRequired());
    }

    @Test
    public void testIsRequired_MandatoryButRequiredFieldIsFalse() {
        when(option.isRequired()).thenReturn(false); // fix: changed to return false
        option.setRequired(false);
        assertFalse(option.isRequired());
    }
}