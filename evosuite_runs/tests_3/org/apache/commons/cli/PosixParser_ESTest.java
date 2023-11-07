/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:39:55 GMT 2023
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
      posixParser0.burstToken("", false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("BjY", false);
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
      Options options1 = options0.addOption("", ".", true, ",D]F");
      String[] stringArray0 = Locale.getISOLanguages();
      posixParser0.flatten(options1, stringArray0, true);
      posixParser0.burstToken("--", true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[12];
      stringArray0[0] = "-n";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(12, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-.a8\"b+0z";
      stringArray0[1] = "-.a8\"b+0z";
      stringArray0[2] = "-.a8\"b+0z";
      stringArray0[3] = "-.a8\"b+0z";
      stringArray0[4] = "-.a8\"b+0z";
      options0.addOption("", ".", true, "-.a8\"b+0z");
      stringArray0[5] = "-.a8\"b+0z";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
      assertEquals(12, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "D?";
      stringArray0[1] = "-n";
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
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
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("9p", "-:X", true, "---:X");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[19];
      stringArray0[0] = "---:X";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--+k Ps=[p";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(2, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-.a8\"b+0z";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
      assertEquals(7, stringArray1.length);
      assertEquals(8, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-";
      PosixParser posixParser0 = new PosixParser();
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-.a8\"b+0z";
      options0.addOption("", ".", false, ",D]F");
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(8, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-:X";
      try { 
        posixParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -:X
         //
         verifyException("org.apache.commons.cli.Parser", e);
      }
  }
}
