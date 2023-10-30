package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class OptionTest_Method_80_Run_20231025_183916 {
    @Test
    public void testGetKey() {
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("a", option.getKey());

        // Use the initialized value of `option` throughout the rest of the method
        assertEquals("a", option.getKey());
        assertEquals("a", option.getKey());
        assertEquals("a", option.getKey());

        // If you need to change the value of `option` later in the method, you can do so by re-initializing it
        option = new Option("b", "arg-name", true, "description");
        assertEquals("b", option.getKey());
    }
}