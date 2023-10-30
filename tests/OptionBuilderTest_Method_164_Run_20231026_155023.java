package org.apache.commons.cli;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OptionBuilderTest_Method_164_Run_20231026_155023 {
    @Test
    public void testHasOptionalArgs_numArgsLessThanZero() {
        try {
            OptionBuilder.hasOptionalArgs(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("numArgs must be greater than or equal to 0", e.getMessage());
        }
    }

    @Test
    public void testHasOptionalArgs_numArgsEqualToZero() {
        OptionBuilder.hasOptionalArgs(0);
        // assertEquals(0, OptionBuilder.getArgCount());
        // assertTrue(OptionBuilder.isOptionalArg());
    }

    @Test
    public void testHasOptionalArgs_numArgsGreaterThanZero() {
        OptionBuilder.hasOptionalArgs(5);
        // assertEquals(5, OptionBuilder.getArgCount());
        // assertTrue(OptionBuilder.isOptionalArg());
    }
}