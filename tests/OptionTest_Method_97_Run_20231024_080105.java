package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_97_Run_20231024_080105 {
    @Test
    void hasValueSeparator_withValueSeparator_returnsTrue() {
        Option option = Mockito.mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(true);
        assertTrue(option.hasValueSeparator());
    }

    @Test
    void hasValueSeparator_withoutValueSeparator_returnsFalse() {
        Option option = Mockito.mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(false);
        assertFalse(option.hasValueSeparator());
    }

    @Test
    void hasValueSeparator_withValueSeparatorButNotFirstCharacter_returnsTrue() {
        Option option = Mockito.mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(true);
        assertTrue(option.hasValueSeparator());
    }
}