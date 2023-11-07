/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:11:20 GMT 2023
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
      posixParser0.burstToken(",", false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertNotSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("--", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-,";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertNotSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-,";
      try { 
        posixParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -,
         //
         verifyException("org.apache.commons.cli.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("y", "y");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-yo";
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray1 = posixParser0.flatten(options1, stringArray0, true);
      String[] stringArray2 = posixParser0.flatten(options1, stringArray1, true);
      assertEquals(9, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      options0.addRequiredOption("y", "y", true, "y");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-yo";
      stringArray0[1] = "-yo";
      stringArray0[2] = "y";
      stringArray0[3] = "y";
      stringArray0[4] = "-yo";
      stringArray0[5] = "-yo";
      stringArray0[6] = "--y";
      // Undeclared exception!
      try { 
        posixParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "--";
      stringArray0[1] = "5L";
      stringArray0[2] = "%FW5!:";
      stringArray0[3] = "--M>f=mX@";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
      assertEquals(4, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "--,svMez(~";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[16];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        posixParser0.parse(options0, stringArray0);
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
      Options options1 = options0.addRequiredOption("y", "y", true, "y");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-yo";
      posixParser0.parse(options1, stringArray0);
      posixParser0.burstToken("<u$ >fUie6Q)E", true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-yo";
      // Undeclared exception!
      try { 
        posixParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      posixParser0.burstToken("", false);
  }
}
