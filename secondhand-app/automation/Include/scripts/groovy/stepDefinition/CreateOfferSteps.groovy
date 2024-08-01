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



class CreateOfferSteps {
	@When("Tap Navbar Beranda")
	public void tapNavbarBeranda() {
		WebUI.callTestCase(findTestCase('Page Objects/Navigation Bar/tapBtnBeranda'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap Search field dengan mengetikkan {string}")
	public void tapSearchFieldDenganMengetikkan(String productName) {
		WebUI.callTestCase(findTestCase('Page Objects/Search/inputFieldSearch'), [('expected') : productName], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap pada Produk {string}")
	public void tapPadaProduk(String string) {
		WebUI.callTestCase(findTestCase('Page Objects/Search/TapProductName'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap tombol Saya Tertarik dan Ingin Nego")
	public void tapTombolSayaTertarikDanInginNego() {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (Orang)/tapBtnInginNego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan ke Modal {string}")
	public void diarahkanKeModal(String string) {
	}

	@When("input field harga tawar dengan {string}")
	public void inputFieldHargaTawarDengan(String hargaTawar) {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (Orang)/Bottom Sheets Harga Tawar/inputFieldHargaTawar'), [('hargaTawar') : hargaTawar],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap tombol Kirim")
	public void tapTombolKirim() {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (Orang)/Bottom Sheets Harga Tawar/tapBtnKirim'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Produk berhasil ditawar dengan Notif {string}")
	public void produkBerhasilDitawarDenganNotif(String berhasilTawar) {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (Orang)/verifyTxtBerhasilTawar'), [('expected') : berhasilTawar], FailureHandling.STOP_ON_FAILURE)
	}
}