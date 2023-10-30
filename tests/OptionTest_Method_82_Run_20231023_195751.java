package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_82_Run_20231023_195751 {
    @Test
    public void testGetOptWithShortRepresentation() {
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("a", option.getOpt());
    }

    @Test
    public void testGetOptWithoutShortRepresentation() {
        Option option = new Option(null, "long-option", true, "description");
        assertNull(option.getOpt());
    }

    @Test
    public void testGetOptWithLongRepresentationButNoShortRepresentation() {
        Option option = new Option(null, "long-option", true, "description");
        assertEquals("long-option", option.getLongOpt());
    }
}