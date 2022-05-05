package scripts;


import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearBtn();
		s.skillraryDemoApp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.mouseHover(driver,sd.getCoursebab());
		sd.seleniumTraining();
		
		AddToCart a=new AddToCart(driver);
		driverUtilities.doubleClick(driver,a.getAdd());
		a.cartBtn();
		

	}
	
}
