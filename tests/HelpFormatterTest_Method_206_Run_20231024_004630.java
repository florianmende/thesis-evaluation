package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;

class HelpFormatterTest_Method_206_Run_20231024_004630 {

    @Test
    void testSetArgName() throws NoSuchFieldException, IllegalAccessException {
        // Create a mock HelpFormatter instance
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Set the defaultArgName field to a non-empty string value
        Field field = formatter.getClass().getDeclaredField("defaultArgName");
        field.setAccessible(true);
        field.set(formatter, "test");

        // Call the setArgName method with a non-empty string value
        formatter.setArgName("test");

        // Verify that the defaultArgName field was set to the correct value
        Assertions.assertEquals("test", field.get(formatter));

        // Set the defaultArgName field to an empty string value
        field.set(formatter, "");

        // Call the setArgName method with an empty string value
        formatter.setArgName("");

        // Verify that the defaultArgName field was set to the correct value
        Assertions.assertEquals("", field.get(formatter));

        // Set the defaultArgName field to a null value
        field.set(formatter, null);

        // Call the setArgName method with a null value
        formatter.setArgName(null);

        // Verify that the defaultArgName field was set to the correct value
        Assertions.assertEquals(null, field.get(formatter));
    }
}