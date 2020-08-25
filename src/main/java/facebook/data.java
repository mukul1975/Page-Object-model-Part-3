package facebook;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class data {
	WebDriver driver;
	@FindBy(css="[type='email']")
	WebElement email;
	@FindBy(how=How.CSS,using="[name='pass']")
	WebElement pass;
	@FindBy(how=How.XPATH,using="//input[@name='lastname']")
	WebElement firstname;
	@FindBy(how=How.XPATH,using="//input[@name='reg_email__']")
	WebElement pnumber;
	 @FindBy(how=How.XPATH,using="//input[@autocomplete='new-password']")
	 WebElement npassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='firstname']")
	WebElement lasttname;
	
	@FindBy(how=How.XPATH,using="//select[@name='birthday_month']")
	WebElement month;
	
	@FindBy(how=How.XPATH,using="//select[@name='birthday_day']")
	WebElement day;
	
	@FindBy(how=How.XPATH,using="//select[@name='birthday_year']")
	WebElement year;
	
	@FindBy(xpath="//span[2]//input[1]")
	WebElement radio;
	By footer=By.xpath("//div[@id='pageFooter']");
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Forgot account?')]")
	WebElement createna;
	
	public data(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createna()
	{
		Assert.assertTrue(createna.getText().contains("forgot account"));
	}
	public void footer()
	{
	WebElement footer1=driver.findElement(footer);
	System.out.println(footer1.findElements(By.tagName("a")).size());
	
	}
	public void radio()
	{
		radio.click();
	}
	public void month()
	{
		Select sc=new Select(month);
		sc.selectByVisibleText("Feb");
	}
	
	public void day()
	{
		Select sc=new Select(day);
		sc.selectByVisibleText("21");
	}
	
	public void year()
	{
		Select sc=new Select(year);
		sc.selectByVisibleText("1975");
	}
	
	
	public void npassword1(String pass)
	{
		npassword.sendKeys(pass);
	}
	
	public void mnumber1(String num)
	{
		pnumber.sendKeys(num);
	}
	
	public void email1(String tt)
	{
		email.sendKeys(tt);
	}
	
	public void pass1(String ss)
	{
		pass.sendKeys(ss);
	}
	
	public void title1()
	{
		driver.getTitle().contains("facebook");
	}
	
	public void lastname1(String name1)
	{
		lasttname.sendKeys(name1);
	}
	
	public void firstname1(String name)
	{
		firstname.sendKeys(name);
	}
	
}
