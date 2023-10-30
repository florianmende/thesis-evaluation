package org.apache.commons.cli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class OptionsTest_Method_14_Run_20231024_060930 {
    @Test
    public void testHasOptionWithShortOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        options.addOption("c", "charlie", false, "charlie option");

        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));
    }

    @Test
    public void testHasOptionWithLongOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        options.addOption("c", "charlie", false, "charlie option");

        assertTrue(options.hasOption("alpha"));
        assertTrue(options.hasOption("beta"));
        assertTrue(options.hasOption("charlie"));
    }

    @Test
    public void testHasOptionWithNonExistentOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        options.addOption("c", "charlie", false, "charlie option");

        assertFalse(options.hasOption("d"));
        assertFalse(options.hasOption("delta"));
        assertFalse(options.hasOption("echo"));
    }
}