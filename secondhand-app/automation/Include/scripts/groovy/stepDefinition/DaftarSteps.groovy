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



class DaftarSteps {
	@When("Tap tombol link {string}")
	public void TapTombolLink(String linkDaftar) {
		Mobile.callTestCase(findTestCase('Page Objects/Masuk/TapLinkPageRegister'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Tampil halaman Daftar {string}")
	public void tampilHalamanDaftar(String titlePageDaftar) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/VerifyTitlePageDaftar'), [('varTitlePageDaftar') : titlePageDaftar], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input nama untuk daftar {string} pada kolom Nama")
	public void inputNamaUntukDaftarPadaKolomNama(String fieldNama) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputNama'), [('varNameDaftar') : fieldNama], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input email untuk daftar {string} pada kolom Email")
	public void inputEmailUntukDaftarPadaKolomEmail(String fieldEmail) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputEmail'), [('varEmailDaftar') : fieldEmail], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input password untuk daftar {string} pada kolom Password")
	public void inputPasswordUntukDaftarPadaKolomPassword(String fieldPassword) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputPassword'), [('varPasswordDaftar') : fieldPassword], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input nomor untuk daftar {string} pada kolom Nomor HP")
	public void inputNomorUntukDaftarPadaKolomNomorHP(String fieldNomorHp) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputNomorHpDaftar'), [('varNomorHp') : fieldNomorHp], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input kota untuk daftar {string} pada kolom Kota")
	public void inputKotaUntukDaftarPadaKolomKota(String fieldKota) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inpuKota'), [('varCity') : fieldKota], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input alamat untuk daftar {string} pada Kolom Alamat")
	public void inputAlamatUntukDaftarPadaKolomAlamat(String fieldAlamat) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputAlamat'), [('varAlamat') : fieldAlamat], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Tap tombol Daftar")
	public void TapTombolDaftar() {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/TapBtnDaftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Tampil halaman Akun Saya {string}")
	public void tampilHalamanAkunSaya(String titlePageSetelahDaftar) {
		Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Sudah Login/VerifyTitlePageAkunSaya'), [('varTitlePageAkunSaya') : titlePageSetelahDaftar],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Tampil pesan alert ketika daftar {string}")
	public void tampilPesanAlertKetikaDaftar(String alertDaftar) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/VerifyAlertTextDaftar'), [('varAlertTextDaftar') : alertDaftar], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Kembali ke halaman Masuk")
	public void kembaliKeHalamanMAsuk() {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar/TapBtnKembali'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Kembali ke halaman Akun Saya")
	public void kembaliKeHalamanAkunSaya() {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar/TapBtnKembali'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}