package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_103_Run_20231025_183916 {

    @Test
    public void testSetDescription() {
        // Test case 1: The description field is set to a non-empty string.
        Option option = new Option("option", "description");
        option.setDescription("new description");
        assertEquals("new description", option.getDescription());

        // Test case 2: The description field is set to an empty string.
        option = new Option("option", "description");
        option.setDescription("");
        assertEquals("", option.getDescription());

        // Test case 3: The description field is set to null.
        option = new Option("option", "description");
        option.setDescription(null);
        assertNull(option.getDescription());
    }
}