package org.iit.healthcare.mmp.patientmodule.tests;

import org.iit.healthcare.base.TestBaseClass;
import org.iit.healthcare.mmp.patientmodule.pages.HomePage;
import org.iit.healthcare.mmp.patientmodule.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ScheduleAppointmentTests extends TestBaseClass
{
    /**
     * 
     * Scheduling Appointment for a Patient module
     * @throws InterruptedException
     */
	@Test
	public void validateScheduleAppointment() throws InterruptedException
	{
		launchApplication("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");	
		LoginPage lPage = new LoginPage(driver);
		lPage.login("ria1","Ria12345");
	
		HomePage hPage = new HomePage(driver);
		hPage.navigationMenuItem("Information");
		String actual = driver.findElement(By.xpath("//div[@class='panel-title']")).
							getText().trim().
							replace("\\s","    ").
							replace("\n", "").
							trim();
		String actual1 = actual.replace("\\s","    "); 
		System.out.println("*************Actual*******************");
		System.out.println(actual1);
		System.out.println(actual1.length());
		System.out.println("**********************************");
 
		
		String expected="Manage My Patient (MMP) is a medical practice management solution that boosts productivity by automating the day-to-day tasks that can slow an office manager down. Central delivers much more than medical billing software. Sure, it has the tools to help generate cleaner claims and reduce denials, but our easy-to-use practice management software also streamlines your workflow to deliver seamless handoffs across departments.Manage My Patient (MMP) becomes your practice’s command center, delivering robust, real-time analytics through customizable reports and dashboards to ensure you know how your business is performing on the metrics that matter most.";
 
		System.out.println("*************Expected*******************");
		System.out.println(expected);
		System.out.println(expected.length());
		System.out.println("**********************************");
//		ScheduleAppointmentPage sPage = new ScheduleAppointmentPage(driver);
//		HashMap<String,String> appointmentDetailsHMap=sPage.bookAnAppointment("Dr.Beth");
//	
//		boolean result = hPage.validatePatientPortalMessage();
//		Assert.assertTrue(result);
//
//		HashMap<String,String> homePageDetailsHMap=hPage.validateApptDetailsinHomePage();
//		Assert.assertEquals(appointmentDetailsHMap, homePageDetailsHMap);
//
//		
//		hPage.navigationMenuItem("Schedule Appointment");
//	 
//		 
//		HashMap<String,String> sPageHMap=sPage.validateApptDetailsinSPage();
//		Assert.assertEquals(appointmentDetailsHMap, sPageHMap);
//



	}
 

}
