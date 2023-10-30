package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OptionTest_Method_93_Run_20231027_212614 {
    @Test
    public void testHashCodeSameValues() throws Exception {
        Option option1 = new Option("a", "arg-name", true, "description");
        Option option2 = new Option("a", "arg-name", true, "description");
        assertEquals(option1.hashCode(), option2.hashCode());
    }

    @Test
    public void testHashCodeDifferentOptionValues() throws Exception {
        Option option1 = new Option("a", "arg-name", true, "description");
        Option option2 = new Option("b", "arg-name", true, "description");
        assertNotEquals(option1.hashCode(), option2.hashCode());
    }

    @Test
    public void testHashCodeDifferentLongOptionValues() throws Exception {
        Option option1 = new Option("a", "arg-name", true, "description");
        Option option2 = new Option("a", "arg-name-2", true, "description");
        assertNotEquals(option1.hashCode(), option2.hashCode());
    }
}