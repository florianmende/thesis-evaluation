package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_208_Run_20231027_212614 {

    @Test
    public void testSetLeftPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(10);
        assertEquals(10, formatter.getLeftPadding());
    }

    @Test
    public void testSetLeftPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(-10);
        assertEquals(-10, formatter.getLeftPadding());
    }

    @Test
    public void testSetLeftPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
    }
}