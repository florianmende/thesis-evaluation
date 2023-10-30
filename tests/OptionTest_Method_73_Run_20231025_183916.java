package org.apache.commons.cli;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class OptionTest_Method_73_Run_20231025_183916 {
    @Test
    public void testClearValues() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Option option = new Option("a", "arg-name", false, "description");
        Field valuesField = Option.class.getDeclaredField("values");
        valuesField.setAccessible(true);
        valuesField.set(option, new ArrayList<String>());
        ((ArrayList<String>) valuesField.get(option)).add("value1");
        ((ArrayList<String>) valuesField.get(option)).add("value2");

        Method clearValuesMethod = Option.class.getDeclaredMethod("clearValues");
        clearValuesMethod.setAccessible(true);
        clearValuesMethod.invoke(option);

        Assert.assertTrue(((List<String>) valuesField.get(option)).isEmpty());
    }
}