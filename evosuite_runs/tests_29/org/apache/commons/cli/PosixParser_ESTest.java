/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:17:07 GMT 2023
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
      posixParser0.burstToken("", true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("qP.G4-", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-Z";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(6, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption((String) null, "3tNc]nRR'6", false, (String) null);
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-3t";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption((String) null, "3tNc0RARR'6", true, "3tNc0RARR'6");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--3tNc0RARR'6";
      stringArray0[1] = "3tNc0RARR'6";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(2, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption((String) null, "3tNc0RARR'6", true, (String) null);
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-3t";
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
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "3tNc0RARR'6", false, "3tNc0RARR'6");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[12];
      stringArray0[0] = "-3tNc0RARR'6";
      // Undeclared exception!
      try { 
        posixParser0.parse(options1, stringArray0);
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "--";
      stringArray0[1] = "-\"):y1%.";
      stringArray0[2] = "-Z";
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
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, "3tNc0RARR'6", false, (String) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-~?:ey#%.";
      stringArray0[1] = "p$|*E(j@^mxC%Q~ChL";
      stringArray0[2] = "--3tNc0RARR'6";
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
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "--=--DR<]k 0JTy}w";
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
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[6];
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
  public void test11()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      Options options1 = options0.addOption("", true, "");
      String[] stringArray0 = new String[0];
      posixParser0.flatten(options1, stringArray0, true);
      posixParser0.burstToken("--3tNc0RARR'6", true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = " ";
      options0.addOption((String) null, "", false, stringArray0[4]);
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("8-nCJjUqz)8|+", true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      options0.addOption((String) null, "", true, "--");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.apache.commons.cli.OptionValidator";
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("--", true);
  }
}