package TestNG_Group;

import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void sam1() {
		System.out.println("Hi");
	}
	@Test(groups="smoke")
	public void sam2() {
		System.out.println("Hello");
	}

}
