package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionTest_Method_103_Run_20231024_165833 {
    @Test
    public void testSetDescription() throws Exception {
        Option option = new Option("a", "aaa", false, "description");
        assertEquals("description", option.getDescription());
        option.setDescription("new description");
        assertEquals("new description", option.getDescription());
    }

    @Test
    public void testSetDescriptionToNull() throws Exception {
        Option option = new Option("a", "aaa", false, "description");
        assertEquals("description", option.getDescription());
        option.setDescription(null);
        assertNull(option.getDescription());
    }

    @Test
    public void testSetDescriptionToEmptyString() throws Exception {
        Option option = new Option("a", "aaa", false, "description");
        assertEquals("description", option.getDescription());
        option.setDescription("");
        assertEquals("", option.getDescription());
    }
}