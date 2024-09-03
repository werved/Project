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



class DaftarJualSaya {

	@Given("User tap navbar icon Akun")
	public void userTapNavbarIconAkun() {
		Mobile.callTestCase(findTestCase('Page Objects/Navigation Bar/TapBtnAkun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik menu Daftar Jual Saya")
	public void klikMenuDaftarJualSaya() {
		Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Sudah Login/tapBtnLDaftarJualSaya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tab {string}")
	public void klikTab(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/tapBtnTabTitle'), [('title') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Ditampilkan list produk yang ditawar oleh buyer")
	public void ditampilkanListProdukYangDitawarOlehBuyer() {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/Tab Diminati/verifyProductCard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Ditampilkan list produk terjual")
	public void ditampilkanListProdukTerjual() {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/Tab Produk - Terjual/verifyProductCard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Ditampilkan list produk")
	public void ditampilkanListProduk() {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/Tab Produk - Terjual/verifyProductCard'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}