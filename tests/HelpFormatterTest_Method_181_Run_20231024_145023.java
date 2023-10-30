package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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

import org.junit.jupiter.api.Assertions;

class HelpFormatterTest_Method_181_Run_20231024_145023 {

    @Test
    void testGetLeftPaddingPositive() throws IOException {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(10);
        Assertions.assertEquals(10, formatter.getLeftPadding());
    }

    @Test
    void testGetLeftPaddingNegative() throws IOException {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(-10);
        Assertions.assertEquals(-10, formatter.getLeftPadding());
    }

    @Test
    void testGetLeftPaddingZero() throws IOException {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        Assertions.assertEquals(0, formatter.getLeftPadding());
    }
}