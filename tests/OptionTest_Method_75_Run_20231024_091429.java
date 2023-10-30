package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OptionTest_Method_75_Run_20231024_091429 {
    @Test
    public void testEquals1() {
        Option option1 = new Option("a", "longOption", true, "description");
        Option option2 = option1;
        assertTrue(option1.equals(option2));
    }

    @Test
    public void testEquals2() {
        Option option1 = new Option("a", "longOption", true, "description");
        Object obj = new Object();
        assertFalse(option1.equals(obj));
    }

    @Test
    public void testEquals3() {
        Option option1 = new Option("a", "longOption", true, "description");
        Option option2 = new Option("b", "longOption", true, "description");
        assertFalse(option1.equals(option2));
    }
}