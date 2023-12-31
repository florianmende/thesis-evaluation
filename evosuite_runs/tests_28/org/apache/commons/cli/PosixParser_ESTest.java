/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:55:11 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PosixParser_ESTest extends PosixParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      posixParser0.burstToken("", false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-y";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(4, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      Options options1 = options0.addOption("J", "!'", true, "-!'");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-!'";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "--!";
      stringArray0[1] = "--!";
      stringArray0[2] = "!'";
      Options options1 = options0.addOption("", "!'", true, "----!");
      // Undeclared exception!
      try { 
        posixParser0.flatten(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "k*N{z4Vx$\"", true, "-k*N{z4Vx$\"");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "h";
      stringArray0[1] = "h";
      stringArray0[2] = "-k*N{z4Vx$\"";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options1, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "hs[S/l|Q$w?URd==";
      stringArray0[1] = "cQt%%)zs!*u}OZZ|";
      stringArray0[2] = "-{scfTj@EqdHG?&k";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "--=";
      Options options1 = options0.addRequiredOption("", "--=", false, "--=");
      options1.addRequiredOption("nWLCMvy0", "--]fdCQ7}k!F,.n5[", false, "-org.apache.commons.cli.PosixParser");
      try { 
        posixParser0.flatten(options1, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: '--=', '--]fdCQ7}k!F,.n5[')
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      options0.addRequiredOption("", "", false, "3>r367'QD(IQ?t>\"g:");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "--=7";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "--!";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
      assertEquals(7, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "^)Tz`";
      stringArray0[1] = "#*;yZ]n9UQSy";
      stringArray0[2] = "AE#?|aQqbb#z ";
      stringArray0[3] = "-,";
      stringArray0[4] = "-";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      options0.addOption("", "", true, "");
      String[] stringArray0 = new String[0];
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("h--", true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      options0.addRequiredOption("", "", true, "");
      String[] stringArray0 = new String[0];
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("--", true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "--=7";
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("acsns[UiFQ~W+", false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--AD";
      options0.addOption("", "org.apache.commons.cli.PosixParser");
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("--AD", true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("--AD", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }
}
