package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class OptionBuilderTest_Method_156_Run_20231025_193245 {

    @Test
    public void testCreate() {
        OptionBuilder builder = OptionBuilder.withLongOpt("long");
        Option option = builder.create('s');

        // Test case 1:
        assertEquals("s", option.getOpt());

        // Test case 2:
        assertEquals("long", option.getLongOpt());

        // Test case 3:
        assertFalse(option.isRequired());
    }

    @Test
    public void testCreateWithRequired() {
        OptionBuilder builder = OptionBuilder.withLongOpt("long").isRequired();
        Option option = builder.create('s');

        // Test case 3:
        assertTrue(option.isRequired());
    }
}