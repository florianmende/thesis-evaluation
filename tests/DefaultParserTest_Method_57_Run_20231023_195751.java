package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultParserTest_Method_57_Run_20231023_195751 {
    @Test
    public void testStripLeadingAndTrailingQuotesDefaultOff() throws Exception {
        DefaultParser parser = Mockito.mock(DefaultParser.class);
        Method stripLeadingAndTrailingQuotesDefaultOffMethod = DefaultParser.class.getDeclaredMethod("stripLeadingAndTrailingQuotesDefaultOff", String.class);
        stripLeadingAndTrailingQuotesDefaultOffMethod = Mockito.mock(stripLeadingAndTrailingQuotesDefaultOffMethod.getClass());
        stripLeadingAndTrailingQuotesDefaultOffMethod.setAccessible(true);
        Mockito.when(stripLeadingAndTrailingQuotesDefaultOffMethod.invoke(parser, "\"hello\"")).thenReturn("hello");
        assertEquals("hello", stripLeadingAndTrailingQuotesDefaultOffMethod.invoke(parser, "\"hello\""));

        Mockito.when(stripLeadingAndTrailingQuotesDefaultOffMethod.invoke(parser, "hello")).thenReturn("hello");
        assertEquals("hello", stripLeadingAndTrailingQuotesDefaultOffMethod.invoke(parser, "hello"));

        Mockito.when(stripLeadingAndTrailingQuotesDefaultOffMethod.invoke(parser, "\"\"")).thenReturn("");
        assertEquals("", stripLeadingAndTrailingQuotesDefaultOffMethod.invoke(parser, "\"\""));
    }
}