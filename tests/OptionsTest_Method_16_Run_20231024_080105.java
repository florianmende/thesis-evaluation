package org.apache.commons.cli;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class OptionsTest_Method_16_Run_20231024_080105 {
    @Test
    public void testHelpOptions() {
        Options options = new Options();
        options.addOption("a", "aaa", true, "aaa");
        options.addOption("b", "bbb", false, "bbb");
        options.addOption("c", "ccc", true, "ccc");

        List<Option> result = options.helpOptions();

        List<Option> expected = new ArrayList<>();
        expected.add(new Option("a", "aaa", true, "aaa"));
        expected.add(new Option("b", "bbb", false, "bbb"));
        expected.add(new Option("c", "ccc", true, "ccc"));

        Assertions.assertEquals(expected, result);
    }
}