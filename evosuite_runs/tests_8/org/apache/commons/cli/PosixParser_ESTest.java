/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:34:38 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
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
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
      assertNotSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-";
      stringArray0[1] = "- ";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(6, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "");
      String[] stringArray0 = Locale.getISOLanguages();
      PosixParser posixParser0 = new PosixParser();
      posixParser0.parse(options1, stringArray0);
      posixParser0.burstToken("--", true);
      String[] stringArray1 = posixParser0.flatten(options1, stringArray0, true);
      assertEquals(189, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      options0.addRequiredOption("WF", "-WF", false, "'");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-WF";
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
  public void test05()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "*/Q*e";
      stringArray0[1] = "--d(v09HTzb45}=Pc";
      stringArray0[2] = "---\"-M";
      stringArray0[3] = "h\"Xqt|^#k'k`]";
      stringArray0[4] = "--";
      stringArray0[5] = "v[}XHxkf266b7lJ";
      stringArray0[6] = "fX*vxg:)`.$(1^DL";
      stringArray0[7] = "-";
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
      Options options1 = options0.addOption("", "", true, "");
      String[] stringArray0 = Locale.getISOCountries();
      PosixParser posixParser0 = new PosixParser();
      posixParser0.flatten(options1, stringArray0, true);
      posixParser0.burstToken("R-7<PESj\"wxQFY", true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("Ambiguous option: '", true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-2/";
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
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "", true, "");
      String[] stringArray0 = Locale.getISOCountries();
      PosixParser posixParser0 = new PosixParser();
      posixParser0.parse(options1, stringArray0);
      posixParser0.burstToken("--", true);
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(249, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("--", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }
}
