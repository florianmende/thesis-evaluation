package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_11_Run_20231023_204140 {
    @Test
    void testGetOptions() {
        Options options = mock(Options.class);
        List<Option> expectedOptions = new ArrayList<>();
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        expectedOptions.add(option1);
        expectedOptions.add(option2);
        when(options.getOptions()).thenReturn(Collections.unmodifiableCollection(expectedOptions));

        Collection<Option> actualOptions = options.getOptions();

        assertNotNull(actualOptions);
        assertEquals(2, actualOptions.size());
        assertTrue(actualOptions.contains(option1));
        assertTrue(actualOptions.contains(option2));

        try {
            actualOptions.add(mock(Option.class));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }
}