package org.apache.commons.cli;


import org.junit.Test;

public class OptionBuilderTest_Method_155_Run_20231026_155023 {
    private void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected '" + expected + "', but was '" + actual + "'");
        }
    }

    private void assertNull(String actual) {
        if (actual != null) {
            throw new AssertionError("Expected null, but was '" + actual + "'");
        }
    }

    @Test
    public void testLongOptSet() {
        OptionBuilder.withLongOpt("long-opt");
        Option option = OptionBuilder.create();
        assertEquals("long-opt", option.getLongOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongOptNull() {
        OptionBuilder.withLongOpt(null);
        OptionBuilder.create();
    }

    @Test
    public void testNoArguments() {
        Option option = OptionBuilder.withLongOpt("long-opt").create();
        assertEquals("long-opt", option.getLongOpt());
    }
}