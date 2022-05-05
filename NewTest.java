package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	  SoftAssert sa = new SoftAssert();

  @Test
  public void checkingSoftAssert() {
	  
	  System.out.println("softassert started");
	  sa.assertEquals(3, 4);
	  System.out.println("softassert ended");
	  sa.assertAll();

	    
	  
  }
  
  @Test
  public void checkingHardtAssert() {
	  
	  System.out.println("hard started");
	  Assert.assertEquals(3, 4);
	  System.out.println("hard ended");
	

	   	  
  }
  
}
