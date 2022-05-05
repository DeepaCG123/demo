package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy (xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	@FindBy (xpath="//a[text()=' SkillRary Demo APP']")
	private WebElement skillrarydemoapp;
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void gearBtn()
	{
		gearbtn.click();
	}
	public void skillraryDemoApp()
	{
		skillrarydemoapp.click();
	}

}
