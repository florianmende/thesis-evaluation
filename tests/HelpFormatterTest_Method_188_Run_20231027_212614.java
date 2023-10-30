package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_188_Run_20231027_212614 {

    @Test
    public void testGetWidthDefault() {
        HelpFormatter formatter = new HelpFormatter();
        int actualWidth = formatter.getWidth();
        int expectedWidth = 74; // updated default width
        Assertions.assertEquals(expectedWidth, actualWidth);
    }

    @Test
    public void testGetWidthCustom() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        int actualWidth = formatter.getWidth();
        int expectedWidth = 100;
        Assertions.assertEquals(expectedWidth, actualWidth);
    }

    @Test
    public void testGetWidthNotSet() {
        HelpFormatter formatter = new HelpFormatter();
        int actualWidth = formatter.getWidth();
        int expectedWidth = 74; // updated default width
        Assertions.assertEquals(expectedWidth, actualWidth);
    }
}