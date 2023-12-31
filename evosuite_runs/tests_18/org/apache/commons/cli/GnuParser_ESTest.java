/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:04:05 GMT 2023
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
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, true);
      assertNotSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        gnuParser0.flatten((Options) null, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-,";
      try { 
        gnuParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -,
         //
         verifyException("org.apache.commons.cli.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "K";
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("K", " _#[^Wbz@w");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      stringArray0[1] = "-KXLu6Js;=![}D=vW~DH";
      stringArray0[2] = "|T@M[!";
      stringArray0[3] = "org.apache.commons.cli.GnuParser";
      stringArray0[4] = "--";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      String[] stringArray2 = gnuParser0.flatten(options0, stringArray1, false);
      assertEquals(10, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        gnuParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
