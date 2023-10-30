package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_177_Run_20231027_222616 {
    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(10);
        Assertions.assertEquals(10, padding.length());
        Assertions.assertEquals("          ", padding);
        Assertions.assertNotNull(padding);
    }
}