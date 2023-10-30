package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_177_Run_20231027_212614 {
    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(10);
        Assertions.assertEquals(10, padding.length());
        Assertions.assertEquals("          ", padding);

        String padding2 = formatter.createPadding(5);
        Assertions.assertEquals(5, padding2.length());
        Assertions.assertEquals("     ", padding2);

        String padding3 = formatter.createPadding(15);
        Assertions.assertEquals(15, padding3.length());
        Assertions.assertEquals("               ", padding3);
    }
}