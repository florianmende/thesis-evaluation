/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:00:14 GMT 2023
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
      String[] stringArray0 = new String[0];
      String[] stringArray1 = gnuParser0.flatten((Options) null, stringArray0, false);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[13];
      stringArray0[0] = "-=w4a82khO[";
      Option option0 = new Option("", true, "-=w4a82khO[");
      Options options1 = options0.addOption(option0);
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = ",";
      stringArray0[1] = "-,";
      Options options1 = options0.addOption((String) null, ",", false, (String) null);
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options1, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-";
      GnuParser gnuParser0 = new GnuParser();
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "---/";
      stringArray0[3] = "";
      options0.addOption("", "=S|b");
      stringArray0[4] = "";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      String[] stringArray2 = gnuParser0.flatten(options0, stringArray1, false);
      assertEquals(6, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-=w4a82khO[";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, true);
      assertEquals(1, stringArray1.length);
  }
}
