package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.Arrays;

class HelpFormatterTest_Method_177_Run_20231023_195751 {
    @Test
    void testCreatePadding() {
        // Case 1: The method returns a String of the correct length.
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(10);
        Assertions.assertEquals(10, padding.length());

        // Case 2: The String returned by the method contains only spaces.
        Assertions.assertTrue(padding.matches("\\s+"));

        // Case 3: The method does not modify the input parameter `len`.
        int len = 10;
        formatter.createPadding(len);
        Assertions.assertEquals(10, len);
    }
}