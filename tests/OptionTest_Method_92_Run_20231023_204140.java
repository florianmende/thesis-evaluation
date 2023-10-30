package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_92_Run_20231023_204140 {

    @Test
    public void testHasArgs() {
        // Case 1: The option can take multiple values.
        Option option = Option.builder("a").hasArgs().build();
        assertTrue(option.hasArgs());

        // Case 2: The option cannot take multiple values.
        option = Option.builder("a").hasArg(false).build();
        assertFalse(option.hasArgs());

        // Case 3: The option has an unlimited number of values.
        option = Option.builder("a").hasArgs().numberOfArgs(Option.UNLIMITED_VALUES).build();
        assertTrue(option.hasArgs());
    }
}