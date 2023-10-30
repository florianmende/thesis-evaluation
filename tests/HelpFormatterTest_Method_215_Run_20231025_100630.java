package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
import java.util.stream.Collectors;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_215_Run_20231025_100630 {

    @Test
    public void testSetWidthPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        assertEquals(10, formatter.getWidth());
    }

    @Test
    public void testSetWidthNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(-10);
        assertEquals(-10, formatter.getWidth());
    }

    @Test
    public void testSetWidthZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(0);
        assertEquals(0, formatter.getWidth());
    }
}