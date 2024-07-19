package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class deleteProductDiminati {
	@When("Klik navigation link Products")
	public void klikNavigationLinkProducts() {
		WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnProducts'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("klik link Diminati")
	public void klikLinkDiminati() {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickLinkDiminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik product {string}")
	public void klikProduct(String namaProduct) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickProductCard'), [('varProductName') : namaProduct], FailureHandling.STOP_ON_FAILURE)
	}


	@When("Klik tombol Delete")
	public void klikTombolDelete() {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/clickBtnDeleteProduct'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Produk berhasil dihapus")
	public void produkBerhasilDihapus() {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyProductDeleted'), [:], FailureHandling.STOP_ON_FAILURE)
	}

}