/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:16:16 GMT 2023
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
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-=ky^jrvJ";
      Options options1 = options0.addOption("", "-=ky^jrvJ", false, ",");
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options1, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-,";
      Options options1 = options0.addRequiredOption((String) null, ",", false, "org.apache.commons.cli.OptionGroup");
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
        gnuParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = " ojf/FcIB<fB?(-s";
      stringArray0[1] = "--gBD";
      options0.addRequiredOption("", "BtU8ZG", false, "");
      stringArray0[2] = "";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      String[] stringArray2 = gnuParser0.flatten(options0, stringArray1, true);
      assertEquals(4, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-/=kxrvJ";
      try { 
        gnuParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -/=kxrvJ
         //
         verifyException("org.apache.commons.cli.Parser", e);
      }
  }
}