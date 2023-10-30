package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;

public class HelpFormatterTest_Method_208_Run_20231025_215329 {
    private HelpFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = new HelpFormatter();
    }

    @Test
    void testSetLeftPaddingPositive() {
        int padding = 10;
        formatter.setLeftPadding(padding);
        assertEquals(padding, formatter.getLeftPadding());
    }

    @Test
    void testSetLeftPaddingNegative() {
        int padding = -10;
        formatter.setLeftPadding(padding);
        assertEquals(padding, formatter.getLeftPadding());
    }

    @Test
    void testSetLeftPaddingZero() {
        int padding = 0;
        formatter.setLeftPadding(padding);
        assertEquals(padding, formatter.getLeftPadding());
    }
}