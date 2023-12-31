/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:25:00 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Util;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.stripLeadingAndTrailingQuotes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("-");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("--");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("IIQwkmo-kgOz-");
      assertNotNull(string0);
      assertEquals("IIQwkmo-kgOz-", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("\"B/4f7HQM3?s\"");
      assertEquals("B/4f7HQM3?s", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("\"//kc Gikm-p");
      assertEquals("\"//kc Gikm-p", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("\"B/4f7HQM3?s\"\"");
      assertEquals("\"B/4f7HQM3?s\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("IIQwkmo-kgOz-");
      assertEquals("IIQwkmo-kgOz-", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Util util0 = new Util();
  }
}
