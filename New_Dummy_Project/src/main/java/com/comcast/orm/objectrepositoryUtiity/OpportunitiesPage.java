package com.comcast.orm.objectrepositoryUtiity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {
	WebDriver driver;
	public  OpportunitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("hi");
	}

	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement newOpptuBtn;
	public WebElement getNewOpptuBtn() {
		System.out.println("create opprtuntiy page is created");
		System.out.println("navigate to opprtn page");
		System.out.println("opertion done to opprtn page");
		System.out.println("closed to opprtn page");
		
		return newOpptuBtn;
		
		
		
		
	}
	
}
