package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

public class HelpFormatterTest_Method_210_Run_20231025_121248 {

    @Test
    public void testSetLongOptSeparatorValid() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        Assert.assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testSetLongOptSeparatorInvalid() {
        HelpFormatter formatter = new HelpFormatter();
        try {
            formatter.setLongOptSeparator("!");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testSetLongOptSeparatorNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        Assert.assertEquals("=", formatter.getLongOptSeparator());
    }
}