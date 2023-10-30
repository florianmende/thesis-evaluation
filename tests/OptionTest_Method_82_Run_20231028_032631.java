package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;

public class OptionTest_Method_82_Run_20231028_032631 {

    @Test
    public void testGetOpt() {
        // test case 1: option is not null
        Option.Builder builder = Option.builder("a").required(true).longOpt("arg-name");
        Option option = builder.build();
        Assertions.assertEquals("a", option.getOpt());

        // test case 2: option is null
        builder = Option.builder(null).required(true).longOpt("arg-name");
        option = builder.build();
        Assertions.assertEquals(null, option.getOpt());

        // test case 3: option is empty string
        builder = Option.builder("").required(true).longOpt("arg-name");
        option = builder.build();
        Assertions.assertEquals("", option.getOpt());
    }
}