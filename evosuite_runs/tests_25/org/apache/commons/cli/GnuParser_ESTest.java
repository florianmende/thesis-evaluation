/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:54:26 GMT 2023
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
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, "[", true, (String) null);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "org.apache.commons.cli.Util";
      stringArray0[1] = "[";
      stringArray0[2] = "[";
      stringArray0[3] = "[";
      stringArray0[4] = "[";
      stringArray0[5] = "-[.";
      String[] stringArray1 = gnuParser0.flatten(options1, stringArray0, true);
      assertEquals(7, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = ")dAbR9^S`:8M;";
      stringArray0[1] = "/0N.B(Zr{+y";
      stringArray0[2] = "9]z_g.)<*w3$";
      stringArray0[3] = "/0N.B(Zr{+y";
      stringArray0[4] = "-=^";
      String[] stringArray1 = new String[4];
      Options options1 = options0.addRequiredOption(stringArray1[0], "", false, "-vcFFnX6~<*o");
      String[] stringArray2 = gnuParser0.flatten(options1, stringArray0, true);
      assertEquals(6, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[12];
      stringArray0[0] = "-+=*BvBW@V$fL\"m+S#";
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
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "L?eAw}Zu";
      stringArray0[1] = "-.";
      Options options1 = options0.addOption((String) null, ".", true, "i`a8LaD(=WlX?ea{n");
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
  public void test5()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Hvtg]Fz?zCA\"Chc'";
      stringArray0[1] = "-yo";
      stringArray0[2] = "ma";
      stringArray0[3] = "-";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(4, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, true);
      assertEquals(2, stringArray1.length);
  }
}
