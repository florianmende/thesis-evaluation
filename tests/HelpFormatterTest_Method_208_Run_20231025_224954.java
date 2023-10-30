package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_208_Run_20231025_224954 {
    @Test
    public void testSetLeftPaddingPositive() {
        // Create a mock HelpFormatter object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Set the 'defaultLeftPad' field to a positive value
        formatter.setLeftPadding(5);

        // Verify that the 'defaultLeftPad' field was set to the correct value
        Mockito.verify(formatter).setLeftPadding(5);
    }

    @Test
    public void testSetLeftPaddingNegative() {
        // Create a mock HelpFormatter object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Set the 'defaultLeftPad' field to a negative value
        formatter.setLeftPadding(-5);

        // Verify that the 'defaultLeftPad' field was set to the correct value
        Mockito.verify(formatter).setLeftPadding(-5);
    }

    @Test
    public void testSetLeftPaddingZero() {
        // Create a mock HelpFormatter object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Set the 'defaultLeftPad' field to zero
        formatter.setLeftPadding(0);

        // Verify that the 'defaultLeftPad' field was set to the correct value
        Mockito.verify(formatter).setLeftPadding(0);
    }
}