/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:28:54 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MissingArgumentException_ESTest extends MissingArgumentException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = new MissingArgumentException("");
      Option option0 = missingArgumentException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option("", "^S(|/G1eg|F");
      option0.setRequired(true);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals("^S(|/G1eg|F", option1.getDescription());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setValueSeparator('L');
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals("", option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option option0 = new Option("", "V58", true, "");
      option0.setOptionalArg(true);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Option option0 = new Option("", false, "");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs(2914);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Option option0 = new Option("", true, "uWv");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgName("uWv");
      Option option1 = missingArgumentException0.getOption();
      assertEquals("uWv", option1.getArgName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Option option0 = new Option("U5", "U5");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Option option0 = new Option("", true, "uWv");
      option0.setArgs(0);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = null;
      try {
        missingArgumentException0 = new MissingArgumentException((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.MissingArgumentException", e);
      }
  }
}
