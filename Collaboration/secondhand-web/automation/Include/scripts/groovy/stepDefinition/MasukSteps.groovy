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



class MasukSteps {

	@Given("User membuka {string}")
	public void userMembuka(String url) {
		WebUI.navigateToUrl(url)
	}

	@When("Memasukkan Email yang sudah register {string}")
	public void memasukkanEmailYangSudahRegister(String email) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/inputEmail'), [('varLoginEmail') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Memasukkan Password yang sudah register {string}")
	public void memasukkanPasswordYangSudahRegister(String password) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/inputPassword'), [('varPassword') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol login {string}")
	public void klikTombolLogin(String btnMasuk) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/clickBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Melihat halaman produk setelah login {string}")
	public void melihatHalamanProdukSetelahLogin(String title) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Memasukkan Email yang tidak benar {string}")
	public void memasukkanEmailYangTidakBenar(String email) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/inputEmail'), [('varLoginEmail') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Memasukkan Password yang tidak benar {string}")
	public void memasukkanPasswordYangTidakBenar(String password) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/inputPassword'), [('varPassword') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Disana menampilkan pesan {string}")
	public void disanaMenampilkanPesan(String alert) {
		WebUI.callTestCase(findTestCase('Page Objects/Login/verifyAlerLogin'), [('varAlertLogin') : alert], FailureHandling.STOP_ON_FAILURE)
	}
}