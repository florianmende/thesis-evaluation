package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_180_Run_20231024_080105 {

    @Test
    public void testGetDescPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(-10);
        assertEquals(-10, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(0);
        assertEquals(0, formatter.getDescPadding());
    }
}