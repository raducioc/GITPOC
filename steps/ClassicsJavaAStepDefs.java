package steps;
import resources.steps.ClassicsJavaAStepDefsHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;

/**
 * Description   : Functional Test Script
 * @author RaduCioc
 */
public class ClassicsJavaAStepDefs extends ClassicsJavaAStepDefsHelper
{
	/**
	 * Script Name   : <b>CalssicsJavaAStepsDefs</b>
	 * Generated     : <b>Oct 16, 2018 4:22:46 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/10/16
	 * @author RaduCioc
	 */
	public int slow=5;
	
	public void testMain(Object[] args) 
	{
		
		
		
		
	}
	@Given("^I start ClassicsJavaA App$")
	public void i_start_ClassicsJavaA_App() throws Throwable{
		startApp("ClassicsJavaA");
		sleep(slow);
	}
	
	@Then("^I maximize the App$")
	public void i_maximize_the_App()  throws Throwable{
		classicsCD().maximize();
		sleep(slow);
		}
	
	@Then("^I click the same button to restore the App$")
	public void i_restore_the_App()  throws Throwable{
		classicsCD().click(atPoint(1846,22));
		sleep(slow);
	}
	
	
	@Then("^I close the App$")
	public void i_close_the_App()  throws Throwable{
		classicsCD(ANY,MAY_EXIT).close();
		sleep(slow);
	}
}

