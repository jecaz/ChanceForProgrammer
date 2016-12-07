package parameterized_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bean.Bean;

public class ParamTestWithDataProviderWithBean {
	
	// Here, the @DataProvider passes bean objects as parameter
	@DataProvider(name = "test1")
	public static Object[][] createBean() {
			return new Object[][] { 
				{ new Bean("hi I am the bean1:", 111)},
				{ new Bean("hi I am the bean2:", 112)}};
	}
	
	// The attribute dataProvider is mapped to "test1".
	@Test(dataProvider = "test1")
	public void testMethod(Bean myBean) {
			System.out.println(myBean.getVal() + " " + myBean.getI());
	}
}
