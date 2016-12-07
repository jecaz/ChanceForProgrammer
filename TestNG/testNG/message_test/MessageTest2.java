package message_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import message.MessageUtil;

public class MessageTest2 {
	
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(dependsOnMethods = { "dependencyTest" })
	public void testSalutationMessage() {
		message = "Hi!".concat("Manisha");
		System.out.println("Inside testSalutationMessage()");
	
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
	
	@Test
	public void dependencyTest() {
		System.out.println("This is dependency test");
	}
	
	// This method is not ready to use
	@Test(enabled = false)
	public void testSalutationMessage1(){
		message = "Hello";
		// Miss some code...
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
	
}
