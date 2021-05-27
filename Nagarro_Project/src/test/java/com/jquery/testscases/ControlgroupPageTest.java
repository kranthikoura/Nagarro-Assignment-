package com.jquery.testscases;

import org.testng.annotations.Test;

import com.jquery.pages.ControlgroupPage;

public class ControlgroupPageTest extends ControlgroupPage {

	@Test(priority = 1)
	public void SelectControlPage() {

		controlgroupPage();
		
		selectAutomaticRadioButton();
		
		selectInsuranceRadioButton();
		
		selectStandardRadioButton();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		selectInsuranceCheckBox();
		
		clickBookNowButton();
	}

}
