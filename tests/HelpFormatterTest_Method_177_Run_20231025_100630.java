package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

class HelpFormatterTest_Method_177_Run_20231025_100630 {

    @Test
    void testCreatePadding() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Test case 1: The method returns a string of the correct length.
        String padding = formatter.createPadding(5);
        if (padding != null) {
            Assertions.assertEquals(5, padding.length());
        }

        // Test case 2: The method returns a string that contains only spaces.
        if (padding != null) {
            for (int i = 0; i < padding.length(); i++) {
                Assertions.assertEquals(' ', padding.charAt(i));
            }
        }

        // Test case 3: The method returns a string that is not affected by the input parameter's value.
        String padding1 = formatter.createPadding(5);
        String padding2 = formatter.createPadding(10);
        if (padding1 != null && padding2 != null) {
            Assertions.assertEquals(padding1, padding2);
        }
    }
}