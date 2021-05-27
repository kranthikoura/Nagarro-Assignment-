package com.jquery.testscases;

import org.testng.annotations.Test;
import com.jquery.base.TestBase;
import com.jquery.pages.DroppablePage;

public class DroppablePageTest extends TestBase {

	DroppablePage dp = new DroppablePage();

	@Test
	public void dragAndDrop() {
		dp.selectDroppableButton();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dp.dragAndDrop();

	}

}
