package steps;
import resources.steps.PureRFTHelper;
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
public class PureRFT extends PureRFTHelper
{
	/**
	 * Script Name   : <b>PureRFT</b>
	 * Generated     : <b>Oct 17, 2018 10:27:11 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/10/17
	 * @author RaduCioc
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		startApp("ClassicsJavaA");
		sleep(2);
		classicsCD().maximize();
		sleep(2);
		classicsCD().click(atPoint(1846,22));
		sleep(2);
		classicsCD(ANY,MAY_EXIT).close();
	}
}

