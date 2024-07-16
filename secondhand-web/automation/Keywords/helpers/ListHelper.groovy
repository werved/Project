package helpers
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ListHelper {
	public int G_WAIT = 30

	@Keyword
	void listToClick(TestObject testObject, String text) {
		WebUI.waitForElementVisible(testObject, G_WAIT)
		List<WebElement> list = WebUiCommonHelper.findWebElements(testObject, G_WAIT)
		if(list.size()) {
			for(WebElement aList : list) {
				if(aList.getText().contains(text)) {
					aList.click()
					break
				}
			}
		} else {
			KeywordUtil.logInfo("There is no list")
		}
	}

	@Keyword
	void listToRead(TestObject testObject) {
		WebUI.waitForElementVisible(testObject, G_WAIT)
		List<WebElement> list = WebUiCommonHelper.findWebElements(testObject, G_WAIT)
		if(list.size()) {
			for(WebElement aList : list) {
				KeywordUtil.logInfo(aList.getText())
			}
		} else {
			KeywordUtil.logInfo("There is no list")
		}
	}

	@Keyword
	void listToVerify(TestObject testObject) {
		WebUI.waitForElementVisible(testObject, G_WAIT)
		List<WebElement> list = WebUiCommonHelper.findWebElements(testObject, G_WAIT)
		if(list.size()) {
			for(WebElement aList : list) {
				if(aList.displayed) {
					KeywordUtil.logInfo("There is product image")
				} else {
					KeywordUtil.logInfo("Missing product image")
				}
			}
		} else {
			KeywordUtil.logInfo("There is no list")
		}
	}
}