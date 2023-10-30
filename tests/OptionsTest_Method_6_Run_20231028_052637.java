package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptionsTest_Method_6_Run_20231028_052637 {
    @Test
    public void testAddRequiredOption() {
        Options options = new Options();
        Option option = new Option("a", "arg", true, "description");
        options.addRequiredOption("a", "arg", true, "description");
        assertTrue(options.getOption("a").isRequired());
    }
}