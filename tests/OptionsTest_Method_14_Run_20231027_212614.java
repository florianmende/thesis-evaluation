package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class OptionsTest_Method_14_Run_20231027_212614 {

    @Test
    void testHasOption() throws Exception {
        Options options = new Options();
        Field shortOptsField = Options.class.getDeclaredField("shortOpts");
        Field longOptsField = Options.class.getDeclaredField("longOpts");
        shortOptsField.setAccessible(true);
        longOptsField.setAccessible(true);
        HashMap<String, Option> shortOpts = (HashMap<String, Option>) shortOptsField.get(options);
        HashMap<String, Option> longOpts = (HashMap<String, Option>) longOptsField.get(options);

        // Case 1: Test that the method returns true if the option with the specified name is a member of the Options instance.
        Option option = new Option("a", "alpha");
        shortOpts.put("a", option);
        longOpts.put("alpha", option);
        Method hasOptionMethod = Options.class.getDeclaredMethod("hasOption", String.class);
        hasOptionMethod.setAccessible(true);
        assertTrue((boolean) hasOptionMethod.invoke(options, "a"));
        assertTrue((boolean) hasOptionMethod.invoke(options, "alpha"));

        // Case 2: Test that the method returns false if the option with the specified name is not a member of the Options instance.
        shortOpts.remove("a");
        longOpts.remove("alpha");
        assertFalse((boolean) hasOptionMethod.invoke(options, "a"));
        assertFalse((boolean) hasOptionMethod.invoke(options, "alpha"));

        // Case 3: Test that the method returns false if the specified name is null or empty.
        assertFalse((boolean) hasOptionMethod.invoke(options, ""));
    }

}