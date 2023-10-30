package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class DefaultParserTest_Method_33_Run_20231025_224954 {

    @Test
    void testBuilder() {
        DefaultParser parser = DefaultParser.builder().build();
        assertNotNull(parser);
    }

    @Test
    void testBuilderWithPartialMatching() {
        DefaultParser parser = DefaultParser.builder().setAllowPartialMatching(false).build();
        assertNotNull(parser);
    }

    @Test
    void testBuilderWithStripLeadingAndTrailingQuotes() {
        DefaultParser parser = DefaultParser.builder().setStripLeadingAndTrailingQuotes(true).build();
        assertNotNull(parser);
    }
}