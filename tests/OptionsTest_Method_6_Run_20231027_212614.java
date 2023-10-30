package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

public class OptionsTest_Method_6_Run_20231027_212614 {
    @Test
    public void testAddRequiredOption() {
        Options options = new Options();
        options.addRequiredOption("a", "long-a", false, "description");
        assertEquals(1, options.getOptions().size());
        Iterator<Option> iterator = options.getOptions().iterator();
        assertTrue(iterator.hasNext());
        Option option = iterator.next();
        assertTrue(option.isRequired());
    }

    @Test
    public void testAddRequiredOptionWithArg() {
        Options options = new Options();
        options.addRequiredOption("a", "long-a", true, "description");
        assertEquals(1, options.getOptions().size());
        Iterator<Option> iterator = options.getOptions().iterator();
        assertTrue(iterator.hasNext());
        Option option = iterator.next();
        assertTrue(option.isRequired());
        assertTrue(option.hasArg());
    }

    @Test
    public void testAddRequiredOptionReturnsOptions() {
        Options options = new Options();
        Options result = options.addRequiredOption("a", "long-a", false, "description");
        assertSame(options, result);
    }
}