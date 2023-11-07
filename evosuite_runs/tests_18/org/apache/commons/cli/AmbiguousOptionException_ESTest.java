/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:00:51 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
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
        ambiguousOptionException0 = new AmbiguousOptionException("", (Collection<String>) null);
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
      Locale.IsoCountryCode locale_IsoCountryCode0 = Locale.IsoCountryCode.PART3;
      Set<String> set0 = Locale.getISOCountries(locale_IsoCountryCode0);
      AmbiguousOptionException ambiguousOptionException0 = new AmbiguousOptionException("", set0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      AmbiguousOptionException ambiguousOptionException0 = new AmbiguousOptionException("org.apache.commons.cli.AmbiguousOptionException", linkedList0);
      Collection<String> collection0 = ambiguousOptionException0.getMatchingOptions();
      assertFalse(collection0.contains("org.apache.commons.cli.AmbiguousOptionException"));
  }
}
