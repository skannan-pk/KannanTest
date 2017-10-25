package AppiumMavenK;


import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;



public class Test_ContactSearch extends BaseTestClass1 {

	
	
    @Test
    public void searchContact() {
        //Search for contact
    	
        searchPage.search("Sara");
      //XCUIElementTypeSearchField[@name="Search for contact"]
        //Verify result
        MobileElement searchResult = searchPage.getFirstSearchResult();
        Assert.assertEquals("Sara Alston", searchResult.getText());

        //Navigate to detail page
        searchResult.click();

        //Verify that correct page is displayed
        String str = detailPage.getContactName();
        Assert.assertEquals("Sara Alston", str);
    }
}


