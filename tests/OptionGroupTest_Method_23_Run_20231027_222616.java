package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OptionGroupTest_Method_23_Run_20231027_222616 {
    @Test
    public void testSetRequired() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        OptionGroup group = new OptionGroup();
        Method setRequiredMethod = OptionGroup.class.getDeclaredMethod("setRequired", boolean.class);
        setRequiredMethod.setAccessible(true);

        setRequiredMethod.invoke(group, false);
        Assertions.assertFalse(group.isRequired());

        setRequiredMethod.invoke(group, true);
        Assertions.assertTrue(group.isRequired());

        setRequiredMethod.invoke(group, true);
        Assertions.assertTrue(group.isRequired());
    }
}