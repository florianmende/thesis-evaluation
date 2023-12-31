/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:41:08 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GnuParser_ESTest extends GnuParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = gnuParser0.flatten((Options) null, stringArray0, false);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("", true, "-=$,<m0FWD]B3p");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "-=$,<m0FWD]B3p";
      GnuParser gnuParser0 = new GnuParser();
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-FQO_q7vrgBB1klz'";
      stringArray0[1] = "F";
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "F", true, "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      String[] stringArray1 = gnuParser0.flatten(options1, stringArray0, true);
      String[] stringArray2 = gnuParser0.flatten(options1, stringArray1, false);
      assertEquals(3, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Ns8\f]j8";
      stringArray0[1] = "";
      stringArray0[2] = "F";
      stringArray0[3] = "-FQO_q7vrgBB1klz'";
      stringArray0[4] = "yV@}`PC58Hm5!";
      stringArray0[5] = "";
      stringArray0[6] = "--";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(9, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-=$h<m0FWD]B3p";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, true);
      assertEquals(1, stringArray1.length);
  }
}
