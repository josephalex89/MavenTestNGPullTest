package testNGConcepts;
//
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsConcept {

	@Test ()
	public void verifyValues(){
		
		int num1, num2;
		num1 =5;
		num2 =5;
		int finalno1 = num1 + num2;
		int no2 = 10;
		
		/*if (no1 == no2) {
			System.out.println("Pass");
			
		}else {
			System.out.println("Fail");
		}*/
		
		Assert.assertEquals(finalno1, 10);
		Assert.assertEquals(no2, 20, "Values are not matching");
		Assert.assertTrue(true, "Values are not matching");
		System.out.println("End of program");
		
	}
	@Test(dependsOnMethods = "verifyValues")
	public void checkValues(){
		
		int num1, num2;
		num1 =5;
		num2 =5;
		int finalno1 = num1 + num2;
		int no2 = 20;
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(finalno1, 10);
		sa.assertEquals(no2, 10, "Values are not matching");
		System.out.println("Continued");
		sa.assertTrue(true, "Values are not matching");
		
		System.out.println("End of Program");
		
		sa.assertAll();
	}
}
