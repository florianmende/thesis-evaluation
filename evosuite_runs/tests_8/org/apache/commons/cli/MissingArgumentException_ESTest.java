/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:46:57 GMT 2023
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
      MissingArgumentException missingArgumentException0 = new MissingArgumentException("5");
      Option option0 = missingArgumentException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setRequired(true);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setValueSeparator(',');
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArgs());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setOptionalArg(true);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.isRequired());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Option option0 = new Option("Z", true, (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs(2010);
      Option option1 = missingArgumentException0.getOption();
      assertTrue(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Option option0 = new Option("1", "1");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgName("org.evosuite.runtime.mock.java.lang.MockThrowable: Missing argument for option: 1");
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.isRequired());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs(0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Option option0 = new Option("", "7", true, "7");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals((-1), Option.UNINITIALIZED);
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
