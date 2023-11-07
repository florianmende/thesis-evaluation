/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:02:35 GMT 2023
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
      posixParser0.burstToken("", false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("org.apache.commons.cli.Option", false);
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
      Options options1 = options0.addOption("b", "b", true, "b");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[17];
      stringArray0[0] = "-b";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-4";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("", "");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[0];
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("----0gb0", true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("b", "b", true, "b");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "b";
      stringArray0[1] = "b";
      stringArray0[2] = "b";
      stringArray0[3] = "--w_I=P wty+L";
      stringArray0[4] = "b";
      stringArray0[5] = "--b";
      posixParser0.flatten(options1, stringArray0, false);
      posixParser0.burstToken("]N<}Y`\"3a^`r@H", true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[13];
      stringArray0[0] = "-9B9()iR]!Y9C{";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(14, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[17];
      stringArray0[0] = "-b";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(17, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
      assertEquals(7, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "6+";
      stringArray0[1] = "--00F";
      stringArray0[2] = "o9b0c0}MYK-L";
      stringArray0[3] = "-";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      Options options1 = options0.addRequiredOption("", "}_];Kw_RY", true, "}_];Kw_RY");
      posixParser0.flatten(options1, stringArray0, true);
      posixParser0.burstToken("--", true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("", true, "");
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[0];
      posixParser0.flatten(options0, stringArray0, true);
      posixParser0.burstToken("----0xgb0", true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "b";
      stringArray0[1] = "b";
      stringArray0[2] = "b";
      stringArray0[3] = "--w_I=P wty+L";
      stringArray0[4] = "b";
      stringArray0[5] = "--b";
      posixParser0.flatten(options0, stringArray0, false);
      posixParser0.burstToken("p/+0,N]bIPQh%$$R-", false);
  }
}