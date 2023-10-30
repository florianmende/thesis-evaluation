package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.junit.Test;

public class OptionTest_Method_71_Run_20231028_042634 {
    @Test(expected = UnsupportedOperationException.class)
    public void testAddValue() {
        Option option = Option.builder("a").longOpt("arg-name").build();
        option.addValue("value");
    }
}