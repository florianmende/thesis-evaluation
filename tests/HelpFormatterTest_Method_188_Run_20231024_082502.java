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

class HelpFormatterTest_Method_188_Run_20231024_082502 {
    @Test
    void testGetWidth() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        Assertions.assertEquals(10, formatter.getWidth());

        formatter.setWidth(0);
        Assertions.assertEquals(0, formatter.getWidth());

        formatter.setWidth(-10);
        Assertions.assertEquals(-10, formatter.getWidth());
    }
}