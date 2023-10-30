package org.apache.commons.cli;

import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionBuilderTest_Method_169_Run_20231026_155023 {

    @Test
    public void testWithDescription() throws NoSuchFieldException, IllegalAccessException {
        String description = "This is a test description";
        OptionBuilder.withDescription(description);

        Field descriptionField = OptionBuilder.class.getDeclaredField("description");
        descriptionField.setAccessible(true);
        String actualDescription = (String) descriptionField.get(null);

        assertEquals(description, actualDescription);
    }
}