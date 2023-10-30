package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_91_Run_20231025_224954 {
    @Test
    public void testHasArgName() {
        Option option = new Option("a", "arg-name", false, "description");
        assertFalse(option.hasArgName());
        option.setArgName("arg-name");
        assertTrue(option.hasArgName());
    }
}