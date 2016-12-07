package message_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import message.MessageUtil;

public class MessageTest1 {
	
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
