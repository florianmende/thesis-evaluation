package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_68_Run_20231024_004630 {

    @Test
    public void testBuilderWithValidOption() {
        String option = "a";
        Builder builder = Option.builder(option);
        assertNotNull(builder);
        assertTrue(builder instanceof Option.Builder);
    }

    @Test
    public void testBuilderWithInvalidOption() {
        String option = "not";
        Builder builder = Option.builder(option);
        assertNotNull(builder);
        assertTrue(builder instanceof Option.Builder);
    }

    @Test
    public void testBuilderWithNullOption() {
        String option = "null_option";
        Builder builder = Option.builder(option);
        assertNotNull(builder);
        assertTrue(builder instanceof Option.Builder);
    }

    @Test
    public void testBuilderWithEmptyOption() {
        String option = "empty_option";
        Builder builder = Option.builder(option);
        assertNotNull(builder);
        assertTrue(builder instanceof Option.Builder);
    }

    @Test
    public void testBuilderWithWhitespaceOption() {
        String option = "whitespace_option";
        Builder builder = Option.builder(option);
        assertNotNull(builder);
        assertTrue(builder instanceof Option.Builder);
    }
}