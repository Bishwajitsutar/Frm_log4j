package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
@Test
public void tc001() throws Exception {
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.OpenApplication();
	obj.Login();
	obj.Logout();
	obj.CloseApplication();
}

}
