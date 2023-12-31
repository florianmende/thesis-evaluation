/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:25:40 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
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
      String[] stringArray0 = new String[0];
      String[] stringArray1 = posixParser0.flatten((Options) null, stringArray0, false);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("vhv", false);
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
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("PwmZLUoJ", ".", true, "--N MR7Gynws$fzTM+;");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-.";
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
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-.";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(4, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "--A#3sKP=f8UE3JL]@x.";
      stringArray0[1] = "-*";
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
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "->*";
      stringArray0[1] = "--H|C(|3 Ib~b";
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
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[15];
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
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      options0.addOption("", true, "");
      posixParser0.parse(options0, (String[]) null);
      posixParser0.burstToken("--", true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      options0.addOption("U", false, "'  (could be: ");
      posixParser0.parse(options0, stringArray0);
      posixParser0.burstToken("-Unrecogniz\"dCoption: ", true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      Options options1 = options0.addOption("U", true, "'  (could be: ");
      posixParser0.parse(options1, stringArray0);
      posixParser0.burstToken("-Unrecogniz\"dCoption: ", true);
      String[] stringArray1 = new String[2];
      stringArray1[0] = "'  (could be: ";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options1, stringArray1, true);
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "->*";
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
  public void test11()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      posixParser0.burstToken("", false);
  }
}
