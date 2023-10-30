package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionsTest_Method_4_Run_20231024_151954 {
    @Mock
    private Option option;

    @Test
    public void testAddOption() {
        Options options = new Options();

        // test adding a new option
        String opt = "test";
        String longOpt = "test-long";
        boolean hasArg = true;
        String description = "Test option";
        options.addOption(opt, longOpt, hasArg, description);
        assertTrue(options.hasOption(opt));
        assertTrue(options.hasLongOption(longOpt));
        assertEquals(1, options.getOptions().size());

        // test adding the same option again
        options.addOption(opt, longOpt, hasArg, description);
        assertEquals(1, options.getOptions().size());

        // test adding a different option
        String opt2 = "test2";
        String longOpt2 = "test2-long";
        boolean hasArg2 = false;
        String description2 = "Test option 2";
        options.addOption(opt2, longOpt2, hasArg2, description2);
        assertTrue(options.hasOption(opt2));
        assertTrue(options.hasLongOption(longOpt2));
        assertEquals(2, options.getOptions().size());
    }
}