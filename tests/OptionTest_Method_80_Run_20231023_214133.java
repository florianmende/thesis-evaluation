package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OptionTest_Method_80_Run_20231023_214133 {
    @Test
    void testGetKey() {
        Option option = new Option("a", "arg-name", true, "description");
        String key = option.getKey();
        assertEquals("a", key);

        option = new Option("b", "arg-name", false, "description");
        key = option.getKey();
        assertEquals("b", key);

        option = new Option("c", null, false, "description");
        key = option.getKey();
        assertEquals("c", key);
    }
}