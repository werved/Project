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



class Masuk {
	//	@Given("User buka aplikasi {string}")
	//	public void userBukaAplikasi(String string) {
	//
	//
	//	}
	//
	@When("Klik icon {string}")
	public void klikIcon(String btnAkun) {
		WebUI.callTestCase(findTestCase('Page Objects/Navigation Bar/TapBtnAkun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Buka halaman {string}")
	public void bukaHalaman(String titleAkunSaya) {
		Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Belum Login/VerifyTitlePageAkunSaya'), [('varTitlePageAkunSaya2') : titleAkunSaya],
		FailureHandling.STOP_ON_FAILURE)

	}

	@Then("Klik tombol {string}")
	public void klikTombol(String btnMasuk) {
		WebUI.callTestCase(findTestCase('Page Objects/Akun Saya - Belum Login/TapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@Then("Diarahkan ke halaman {string}")
	public void diarahkanKeHalaman(String titleMasuk) {
		Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Sudah Login/VerifyTitlePageAkunSaya'), [('varTitlePageAkunSaya') : titleMasuk],
		FailureHandling.STOP_ON_FAILURE)

	}

	@Then("Diarahkan ke halaman login {string}")
	public void diarahkan_ke_halaman_login(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Masuk/VerifyTitlePageMasuk'), [('getTitlePageMasuk') : ''], FailureHandling.STOP_ON_FAILURE)
	}


	@Then("Input Email terdaftar {string}")
	public void inputEmailTerdaftar(String emailMasuk) {
		Mobile.callTestCase(findTestCase('Page Objects/Masuk/inputEmail'), [('varEmailMasuk') : emailMasuk], FailureHandling.STOP_ON_FAILURE)

	}

	@Then("Input Password terdaftar {string}")
	public void inputPasswordTerdaftar(String passwordMasuk) {
		Mobile.callTestCase(findTestCase('Page Objects/Masuk/inputPassword'), [('varPasswordMasuk') : passwordMasuk], FailureHandling.STOP_ON_FAILURE)

	}

	@Then("Tampil pesan {string}")
	public void tampilPesan(String alertText) {
		WebUI.callTestCase(findTestCase('Page Objects/Masuk/VerifyAlertTextMasuk'), [('varAlertTextMasuk') : alertText], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Tampil pesan invalid {string}")
	public void tampilPesanInvalid(String alertText1) {
		WebUI.callTestCase(findTestCase('Page Objects/Masuk/VerifyAlertUsernameOrPasswordSalah'), [('varAlertEmailOrSandiSalah') : alertText1],
			FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Klik kembali dari login")
	public void klikKembaliDariLogin() {
		WebUI.callTestCase(findTestCase('Page Objects/Masuk/TapBtnKembali'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Klik menu {string}")
	public void klikMenu(String btnLinkDaftar) {
		Mobile.callTestCase(findTestCase('Page Objects/Masuk/TapLinkPageRegister'), [:], FailureHandling.STOP_ON_FAILURE)

	}
}