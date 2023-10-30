package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GnuParserTest_Method_63_Run_20231028_042634 {
    @Mock
    private Options options;

    @Test
    public void testFlatten_onlyOptions() {
        // Setup
        String[] input = new String[]{"-D", "--foo", "bar"};
        String[] expectedOutput = new String[]{"-D", "--foo", "bar"};

        // Execute
        String[] actualOutput = new GnuParser().flatten(options, input, true);

        // Verify
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFlatten_onlyNonOptions() {
        // Setup
        String[] input = new String[]{"file1.txt", "file2.txt"};
        String[] expectedOutput = new String[]{"file1.txt", "file2.txt"};

        // Execute
        String[] actualOutput = new GnuParser().flatten(options, input, true);

        // Verify
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFlatten_mixedOptionsAndNonOptions() {
        // Setup
        String[] input = new String[]{"-D", "--foo", "file1.txt", "file2.txt"};
        String[] expectedOutput = new String[]{"-D", "--foo", "file1.txt", "file2.txt"};

        // Execute
        String[] actualOutput = new GnuParser().flatten(options, input, true);

        // Verify
        assertArrayEquals(expectedOutput, actualOutput);
    }
}