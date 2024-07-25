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



class editProfileStep {
	@When("User memasukkan Email yang sudah register {string}")
	public void userMemasukkanEmailYangSudahRegister(String email) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/inputEmail'), [('varLoginEmail') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User memasukkan Password yang sudah register {string}")
	public void userMemasukkanPasswordYangSudahRegister(String password) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/inputPassword'), [('varPassword') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User klik tombol {string}")
	public void userlikTombol(String masuk) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/clickBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User melihat halaman {string}")
	public void userMelihatHalaman(String titlePage) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik icon profile sebelum edit")
	public void klikIconProfileSebelumEdit() {
		WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnProfile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Klik nama akun")
	public void klikNamaAkun() {
		WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnEditProfile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Upload foto")
	public void uploadFoto() {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/uploadProfileImage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input Nama {string}")
	public void inputNama(String nama) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputUsername'), [('varUsername') : nama], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input Kota {string}")
	public void inputKota(String kota) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/selectCity'), [('varSelectCity') : kota], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input Alamat {string}")
	public void inputAlamat(String alamat) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputAlamat'), [('varAlamat') : alamat], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input No Handphone {string}")
	public void inputNoHandphone(String handphone) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputPhoneNumber'), [('varPhoneNumber') : handphone], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Klik tombol {string} profile")
	public void klikTombolProfile(String btnSimpan) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/clickBtnSimpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Melihat halaman {string} setelah update profile")
	public void melihatHalamanSetelahUpdateProfile(String titlePage) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}