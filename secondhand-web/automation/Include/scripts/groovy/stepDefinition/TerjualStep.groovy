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



class TerjualStep {
	@When("Seller masukkan Email {string}")
	public void sellerMasukkanEmail(String email) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/inputEmail'), [('varLoginEmail') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller masukkan Password {string}")
	public void sellerMasukkanPassword(String password) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/inputPassword'), [('varPassword') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller klik tombol Masuk")
	public void sellerKlikTombolMasuk() {
		WebUI.callTestCase(findTestCase('Page Objects/Login/clickBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
	}

	@When("Seller diarahkan ke halaman {string}")
	public void sellerDiarahkanKeHalaman(String titlePage1) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller klik navigation link {string}")
	public void sellerKlikNavigationLink (String linkProducts) {
		WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnProducts'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan ke halaman daftar jual saya seller {string}")
	public void diarahkanKeHalamanDaftarJuaSayaSeller(String titlePage2) {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyTitlePageDaftarJualSaya'), [('varTitlePageDaftarJualSaya') : titlePage2],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik terjual {string}")
	public void klikTerjual(String string) {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickLinkTerjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Berhasil menampilkan card produk yang berhasil terjual")
	public void berhasilMenampilkanCardProdukYangBerhasilTerjual() {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyCardProduct'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}