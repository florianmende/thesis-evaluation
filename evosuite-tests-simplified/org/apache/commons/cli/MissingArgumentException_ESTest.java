/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 30 09:59:01 GMT 2023
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

public class MissingArgumentException_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = new MissingArgumentException("");
      Option option0 = missingArgumentException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, "");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setRequired(true);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option((String) null, false, "Jhh-e");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setValueSeparator('v');
      Option option1 = missingArgumentException0.getOption();
      assertNull(option1.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option option0 = new Option((String) null, "");
      option0.setOptionalArg(true);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Option option0 = new Option("", false, "");
      option0.setArgs(2638);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals('\u0000', option1.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setArgName("T");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals(1, option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Option option0 = new Option((String) null, "OG\"x|\"buER$n.#A<8", false, "");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals(79, option1.getId());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Option option0 = new Option("", false, "");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs(0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArgName());
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
