/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:31:15 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.GnuParser;
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
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      options0.addRequiredOption("", "", true, "M");
      stringArray0[1] = "";
      stringArray0[2] = "-- to desired type: ";
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-t:i:iWT/=MUU+{";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, true);
      assertEquals(1, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      options0.addRequiredOption("", ",", true, ",");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-,";
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "]";
      stringArray0[3] = "]";
      stringArray0[4] = "-F";
      stringArray0[5] = "-";
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Either opt or longOpt must be specified";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "TWYq*ZW^dC#Mk]]QTFB";
      stringArray0[5] = "[>:xF@3[OXmdZFZ";
      stringArray0[6] = "--";
      String[] stringArray1 = gnuParser0.flatten((Options) null, stringArray0, false);
      assertEquals(9, stringArray1.length);
  }
}
