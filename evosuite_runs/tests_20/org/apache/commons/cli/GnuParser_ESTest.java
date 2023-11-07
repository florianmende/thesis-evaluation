/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:49:06 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.CommandLine;
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "org.apache.commons.cli.CommandLine";
      stringArray0[1] = "-.";
      stringArray0[2] = "-=K!0p80}C|PhJ8h";
      stringArray0[3] = "<9a|qOwbV-%G)\"";
      stringArray0[4] = "-.";
      stringArray0[5] = "<9a|qOwbV-%G)\"";
      stringArray0[6] = "-.";
      stringArray0[7] = "<9a|qOwbV-%G)\"";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(8, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      Option option0 = new Option("", "");
      Options options1 = options0.addOption(option0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "--*";
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options1, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "-=K!0p80}C|PhJ8h";
      options0.addRequiredOption((String) null, "", false, "");
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
  public void test4()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".";
      stringArray0[1] = "-.";
      options0.addRequiredOption((String) null, ".", false, ".");
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
      Options options0 = new Options();
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-";
      GnuParser gnuParser0 = new GnuParser();
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

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[14];
      stringArray0[0] = "--";
      CommandLine commandLine0 = gnuParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }
}
