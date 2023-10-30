package org.apache.commons.cli;


import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.lang.reflect.Field;
import org.junit.jupiter.api.Assertions;

public class OptionGroupTest_Method_22_Run_20231025_121248 {
    @Test
    public void testIsRequired() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        Assertions.assertTrue(optionGroup.isRequired());
    }

    @Test
    public void testIsNotRequired() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        Assertions.assertFalse(optionGroup.isRequired());
    }

    @Test
    public void testIsRequiredButFieldNotSet() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        try {
            Field field = OptionGroup.class.getDeclaredField("required");
            field.setAccessible(true);
            field.set(optionGroup, false);
        } catch (NoSuchFieldException e) {
            // Handle exception here
        } catch (IllegalAccessException e) {
            // Handle exception here
        }
        Assertions.assertFalse(optionGroup.isRequired());
    }
}