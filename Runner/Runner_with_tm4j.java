package Runner;
import resources.Runner.Runner_with_tm4jHelper;
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

import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author RaduCioc
 */
//@RunWith(Cucumber.class)
@FTCucumberOptions( cucumberOptions = 
{
		"--plugin" , "json:counter.json" ,
		"--plugin" , "progress:progress.txt" ,
		"--plugin" , "pretty:pretty.txt",
		"--plugin" , "junit:junit.txt",
		"--glue", "",
	 	"features\\orderTest.feature"
	//	"features\\c:\\RFTWorkspace\\POC_Cucumber\\features\\orderTest.feature"
}) 
public class Runner_with_tm4j extends Runner_with_tm4jHelper
{
	/**
	 * Script Name   : <b>Runner_with_tm4j</b>
	 * Generated     : <b>Oct 21, 2018 10:46:21 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/10/21
	 * @author RaduCioc
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
	}
}

