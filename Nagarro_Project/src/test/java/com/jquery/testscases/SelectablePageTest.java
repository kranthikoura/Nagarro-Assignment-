package com.jquery.testscases;

import org.testng.annotations.Test;
import com.jquery.pages.SelectablePage;

public class SelectablePageTest extends SelectablePage {

	@Test(priority = 1)
	public void selectItems() {
		selectablePage();

		selectItem1();

		selectItem5();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		selectItem7();

	}

}
