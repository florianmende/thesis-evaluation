package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_211_Run_20231025_100630 {
    @Test
    public void testSetNewLine() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("newLine");
        Assertions.assertEquals("newLine", formatter.getNewLine());

        formatter.setNewLine(null);
        Assertions.assertNull(formatter.getNewLine());

        formatter.setNewLine("");
        Assertions.assertEquals("", formatter.getNewLine());
    }
}