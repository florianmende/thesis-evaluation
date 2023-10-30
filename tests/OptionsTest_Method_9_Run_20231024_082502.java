package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class OptionsTest_Method_9_Run_20231024_082502 {
    @Test
    public void testGetOptionGroup() {
        // Case 1: The option group exists and the option belongs to it.
        OptionGroup group = new OptionGroup();
        Option option = new Option("opt", "option");
        group.addOption(option);

        Options options = new Options();
        options.addOptionGroup(group);

        OptionGroup result = options.getOptionGroup(option);
        assertEquals(group, result);

        // Case 2: The option group does not exist and the option does not belong to any group.
        options = new Options();
        result = options.getOptionGroup(option);
        assertNull(result);

        // Case 3: The option group exists but the option does not belong to it.
        options = new Options();
        options.addOptionGroup(group);

        Option option2 = new Option("opt2", "option2");
        result = options.getOptionGroup(option2);
        assertNull(result);
    }
}