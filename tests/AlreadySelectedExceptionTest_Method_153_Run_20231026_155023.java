package org.apache.commons.cli;

import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlreadySelectedExceptionTest_Method_153_Run_20231026_155023 {

    @Test
    public void testGetOption() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "aaa");
        group.addOption(option);
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        Method getOptionMethod = AlreadySelectedException.class.getDeclaredMethod("getOption");
        getOptionMethod.setAccessible(true);
        Option result = (Option) getOptionMethod.invoke(exception);
        assertEquals(option, result);
    }

    @Test
    public void testGetOptionSubclass() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "aaa");
        group.addOption(option);
        AlreadySelectedException exception = new AlreadySelectedException(group, option) {
            @Override
            public Option getOption() {
                return super.getOption();
            }
        };
        Method getOptionMethod = exception.getClass().getDeclaredMethod("getOption");
        getOptionMethod.setAccessible(true);
        Option result = (Option) getOptionMethod.invoke(exception);
        assertEquals(option, result);
    }

    @Test
    public void testGetOptionInvalidClass() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "aaa");
        group.addOption(option);
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        Method getOptionMethod = exception.getClass().getDeclaredMethod("getOption");
        getOptionMethod.setAccessible(true);
        assertThrows(IllegalArgumentException.class, () -> getOptionMethod.invoke(new Object()));
    }
}