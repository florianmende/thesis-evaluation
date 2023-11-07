/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:06:34 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.apache.commons.cli.AmbiguousOptionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AmbiguousOptionException_ESTest extends AmbiguousOptionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AmbiguousOptionException ambiguousOptionException0 = null;
      try {
        ambiguousOptionException0 = new AmbiguousOptionException("J+.[kVUSxh4+]", (Collection<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.AmbiguousOptionException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      AmbiguousOptionException ambiguousOptionException0 = new AmbiguousOptionException("mJ?c^", set0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<String> list0 = List.of("");
      AmbiguousOptionException ambiguousOptionException0 = new AmbiguousOptionException("", list0);
      Collection<String> collection0 = ambiguousOptionException0.getMatchingOptions();
      assertTrue(collection0.contains(""));
  }
}
