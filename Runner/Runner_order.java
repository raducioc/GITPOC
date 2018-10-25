package Runner;
import resources.Runner.Runner_orderHelper;
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
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author RaduCioc
 */

@FTCucumberOptions(cucumberOptions= {
		
		"c:\\RFTWorkspace\\POC_Cucumber\\features\\orderTest.feature",
		"--plugin" , "junit:resultxml.xml",
		"--plugin" , "json:resultjson.json",
//		 plugin = {"junit:target/cucumber/result.xml", "json:target/cucumber/calculator.json"},
		"--glue", "",
})
public class Runner_order extends Runner_orderHelper
{
	/**
	 * Script Name   : <b>Runner_order</b>
	 * Generated     : <b>Oct 16, 2018 4:15:46 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/10/16
	 * @author RaduCioc
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
	}
}

