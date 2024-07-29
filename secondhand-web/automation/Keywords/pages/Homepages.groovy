package pages

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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Homepages {
	public static int G_WAIT = 30

	//verifyProductList method for Search_Produk scenario
	@Keyword
	public static verifyProductListBySearch(TestObject productName, String text) {
		WebUI.waitForElementVisible(productName, G_WAIT)
		List<WebElement> listProductName = WebUiCommonHelper.findWebElements(productName, G_WAIT)

		int listProductNameSize = listProductName.size()

		if(!listProductNameSize) {
			return KeywordUtil.logInfo("No result found")
		}

		for(int i = 0; i < listProductNameSize; i++) {
			if(listProductName.get(i).getText().contains(text)) {
				KeywordUtil.logInfo(listProductName.get(i).getText())
			} else {
				KeywordUtil.logInfo("Product Name does not contain " + text)
				break
			}
		}
	}

	@Keyword
	//verifyProductCategory method for Telusuri_Kategori scenario
	public static verifyProductListByCategory(TestObject productCategory, String text) {
		WebUI.waitForElementVisible(productCategory, G_WAIT)
		List<WebElement> listProductCategory = WebUiCommonHelper.findWebElements(productCategory, G_WAIT)

		int listProductCategorySize = listProductCategory.size()

		if(!listProductCategorySize) {
			return KeywordUtil.logInfo("No result found")
		}

		for(int i = 0; i < listProductCategorySize; i++) {
			if(listProductCategory.get(i).getText().equals(text)) {
				KeywordUtil.logInfo(listProductCategory.get(i).getText())
			} else {
				KeywordUtil.logInfo("Product Category does not contain " + text)
				break
			}
		}
	}

}