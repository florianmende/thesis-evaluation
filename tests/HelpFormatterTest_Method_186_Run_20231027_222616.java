package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
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

public class HelpFormatterTest_Method_186_Run_20231027_222616 {
    @Test
    public void testGetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        Assertions.assertEquals("-", formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix(null);
        Assertions.assertNull(formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("");
        Assertions.assertEquals("", formatter.getOptPrefix());
    }
}