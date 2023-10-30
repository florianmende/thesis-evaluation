package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OptionsTest_Method_13_Run_20231024_080105 {

    @Mock
    private Options options;

    @Test
    public void testHasLongOption_MemberWithLongName() {
        // Set up
        String opt = "long-option";
        Mockito.when(options.hasLongOption(opt)).thenReturn(true);

        // Exercise
        boolean result = options.hasLongOption(opt);

        // Verify
        assertTrue(result);
    }

    @Test
    public void testHasLongOption_NotMemberNoLongName() {
        // Set up
        String opt = "not-member";
        Mockito.when(options.hasLongOption(opt)).thenReturn(false);

        // Exercise
        boolean result = options.hasLongOption(opt);

        // Verify
        assertFalse(result);
    }

    @Test
    public void testHasLongOption_MemberNoLongName() {
        // Set up
        String opt = "member-no-long-name";
        Mockito.when(options.hasLongOption(opt)).thenReturn(false);

        // Exercise
        boolean result = options.hasLongOption(opt);

        // Verify
        assertFalse(result);
    }
}