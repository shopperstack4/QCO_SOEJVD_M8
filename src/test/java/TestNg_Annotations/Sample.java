package TestNg_Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void Main1() {
		System.out.println("Hi");//2nd
	}
	@Test
	public void Main2() {
		System.out.println("Hello");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("bm");//1st
	}
	@AfterMethod
	public void am() {
		System.out.println("Bye");
	}

}
