/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:29:37 GMT 2023
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
      MissingArgumentException missingArgumentException0 = new MissingArgumentException((String) null);
      Option option0 = missingArgumentException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setRequired(true);
      Option option1 = missingArgumentException0.getOption();
      assertSame(option0, option1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setValueSeparator('j');
      Option option1 = missingArgumentException0.getOption();
      assertSame(option1, option0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option option0 = new Option("", true, "Missing argument for option: ");
      option0.setOptionalArg(true);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals('\u0000', option1.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Option option0 = new Option("", "org.apache.commons.cli.MissingArgumentException", false, "org.apache.commons.cli.MissingArgumentException");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals("org.apache.commons.cli.MissingArgumentException", option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs(2);
      Option option1 = missingArgumentException0.getOption();
      assertEquals((-2), Option.UNLIMITED_VALUES);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgName("FuS{");
      Option option1 = missingArgumentException0.getOption();
      assertEquals((-1), Option.UNINITIALIZED);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs(0);
      Option option1 = missingArgumentException0.getOption();
      assertNull(option1.getValue());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Option option0 = new Option("t", false, "Missing argument for option: ");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals((-2), Option.UNLIMITED_VALUES);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
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
