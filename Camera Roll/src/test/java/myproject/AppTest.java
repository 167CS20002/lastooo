package myproject;
import org.testng.Assert;
import org.testng.annotation.Test;


public class AppTest {
	public void testlogin1() {
		App myapp=new App();
		Assert.assertEquals(0,myapp,userlogin("abc","abc1234"));
	}
	public void testlogin2() {
		App myapp=new App();
		Assert.assertEquals(1,myapp,userlogin("abc","abc@1234"));
	}
	


}
