package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class HelpFormatterTest_Method_186_Run_20231023_195751 {
    @Test
    void testGetOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Field field = formatter.getClass().getDeclaredField("defaultOptPrefix");
        field.setAccessible(true);

        // Test case 1: non-empty string
        field.set(formatter, "-");
        assertEquals("-", formatter.getOptPrefix());

        // Test case 2: empty string
        field.set(formatter, "");
        assertEquals("", formatter.getOptPrefix());

        // Test case 3: null
        field.set(formatter, null);
        assertNull(formatter.getOptPrefix());
    }
}