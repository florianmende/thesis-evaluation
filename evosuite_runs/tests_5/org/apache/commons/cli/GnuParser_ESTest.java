/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:32:15 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
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
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      Options options1 = options0.addOption("", "--,");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-.";
      stringArray0[1] = "--,";
      // Undeclared exception!
      try { 
        gnuParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-=kI1R__";
      Option option0 = new Option("", "-=kI1R__");
      options0.addOption(option0);
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(2, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-.";
      Options options1 = options0.addOption("xpv", ".", true, ".");
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-'";
      stringArray0[1] = "[";
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "--";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(9, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-.Y=.Vq31V&S 9>m";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(1, stringArray1.length);
  }
}
