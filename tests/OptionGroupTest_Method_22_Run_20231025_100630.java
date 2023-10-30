package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionGroupTest_Method_22_Run_20231025_100630 {

    @Test
    public void testIsRequired() {
        OptionGroup group = mock(OptionGroup.class);
        when(group.isRequired()).thenReturn(true);
        assertTrue(group.isRequired());

        group = mock(OptionGroup.class);
        when(group.isRequired()).thenReturn(false);
        assertFalse(group.isRequired());
    }
}