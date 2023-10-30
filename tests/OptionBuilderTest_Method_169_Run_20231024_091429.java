package org.apache.commons.cli;


import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionBuilderTest_Method_169_Run_20231024_091429 {
    @Test
    public void testWithDescription() throws Exception {
        String testDescription = "Test Description";
        OptionBuilder builder = OptionBuilder.withDescription(testDescription);

        Field descriptionField = OptionBuilder.class.getDeclaredField("description");
        descriptionField.setAccessible(true);
        String actualDescription = (String) descriptionField.get(builder);

        assertEquals(testDescription, actualDescription);
    }
}