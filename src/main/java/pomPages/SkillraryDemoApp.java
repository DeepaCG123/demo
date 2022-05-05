package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	@FindBy (id="course")
	private WebElement coursebab;
	
	@FindBy (xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursebab() {
		return coursebab;
	}
    
	public void seleniumTraining()
	{
		seleniumtraining.click();
	}


}
