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



class StatusOfferSteps {

	@When("Klik tombol Status")
	public void klikTombolStatus() {
		WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnStatus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan Ke Modal {string}")
	public void diarahkanKeModal(String modalTitle) {
		WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/verifyTxtTitlePage'), [('expected') : modalTitle], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik form check Berhasil Terjual")
	public void klikFormCheckBerhasilTerjual() {
		WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/clickRadioCheckBerhasilTerjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Status produk menjadi Berhasil terjual")
	public void statusProdukMenjadiBerhasilTerjual() {
		WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/verifyTxtStatusBerhasilTerjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik form check Batalkan Transaksi")
	public void klikFormCheckBatalkanTransaksi() {
		WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/clickRadioCheckBatalkanTransaksi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Status produk menjadi Penjualan dibatalkan")
	public void statusProdukMenjadiPenjualanDibatalkan() {
		WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/verifyTxtPenjualanDibatalkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}