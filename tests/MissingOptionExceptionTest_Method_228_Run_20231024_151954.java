package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.mockito.Mockito;
import java.util.Collections;
import java.util.Arrays;

public class MissingOptionExceptionTest_Method_228_Run_20231024_151954 {
    @Test
    public void testEmptyList() {
        MissingOptionException ex = new MissingOptionException(Collections.emptyList());
        assertEquals(0, ex.getMissingOptions().size());
    }

    @Test
    public void testSingleOption() {
        MissingOptionException ex = new MissingOptionException(Collections.singletonList("option1"));
        assertEquals(1, ex.getMissingOptions().size());
        assertEquals("option1", ex.getMissingOptions().get(0));
    }

    @Test
    public void testMultipleOptions() {
        MissingOptionException ex = new MissingOptionException(Arrays.asList("option1", "option2", "option3"));
        assertEquals(3, ex.getMissingOptions().size());
        assertTrue(ex.getMissingOptions().contains("option1"));
        assertTrue(ex.getMissingOptions().contains("option2"));
        assertTrue(ex.getMissingOptions().contains("option3"));
    }
}