package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_90_Run_20231026_155023 {
    @Mock
    private Option option;

    @Test
    public void testHasArg() {
        // Case 1: The option has an argument
        option = new Option("a", true, "description");
        assertEquals(true, option.hasArg());

        // Case 2: The option does not have an argument
        option = new Option("a", false, "description");
        assertEquals(false, option.hasArg());

        // Case 3: The option has a default argument
        option = new Option("a", true, "description");
        option.setArgs(1);
        assertEquals(true, option.hasArg());
    }
}