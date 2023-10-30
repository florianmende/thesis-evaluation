package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_177_Run_20231025_183916 {

    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(5);
        Assertions.assertEquals(5, padding.length());
        Assertions.assertTrue(padding.matches("^\\s+$"));
        Assertions.assertNotNull(padding);
    }
}