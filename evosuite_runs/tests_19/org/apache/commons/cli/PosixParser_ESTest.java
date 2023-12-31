/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:19:27 GMT 2023
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
      String[] stringArray0 = new String[0];
      String[] stringArray1 = posixParser0.flatten((Options) null, stringArray0, false);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("zr", false);
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
      String[] stringArray0 = new String[11];
      stringArray0[0] = "-/";
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
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-/";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(1, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-Z-P+kPN<*kv${zU7I U";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(2, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--yP+kPN=*kv${OU7I U";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(2, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
      assertEquals(8, stringArray2.length);
      assertEquals(7, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(1, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "G#eP4&EJoV@(|7k", true, "org.apache.commons.cli.Option");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "--%(";
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("--%(", true);
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
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "G#eP4&EJoV@(|7k", false, "org.apache.commons.cli.Option");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "--%(";
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("--%(", false);
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(7, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Illegal option name '";
      stringArray0[1] = "+1M6xJC";
      stringArray0[2] = "V";
      stringArray0[3] = "2";
      stringArray0[4] = "_]G";
      stringArray0[5] = "--R4$\"80O]|#";
      stringArray0[6] = "";
      stringArray0[7] = "yes";
      posixParser0.flatten(options0, stringArray0, false);
      posixParser0.burstToken("_]G", true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "G#eP4&EJoV@(|7k", true, "org.apache.commons.cli.Option");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "--%(";
      posixParser0.flatten(options1, stringArray0, true);
      posixParser0.burstToken("--", false);
  }
}
