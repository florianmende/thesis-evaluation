package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_22_Run_20231024_060930 {

    @Test
    public void testIsRequired() {
        OptionGroup group = mock(OptionGroup.class);
        when(group.isRequired()).thenReturn(true);
        assertTrue(group.isRequired());

        when(group.isRequired()).thenReturn(false);
        assertFalse(group.isRequired());

        when(group.isRequired()).thenReturn(false);
        assertFalse(group.isRequired());
    }
}