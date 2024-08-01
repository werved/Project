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



class TelusuriKategoriSteps {

	@When("Klik tombol kategori {string} untuk hobi")
	public void klikTombolKategoriUntukHobi(String katHobi) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriHobi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Lihat produk yang sudah di filter {string}")
	public void lihatProdukYangSudahDiFilter(String txtKategori) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyHasilKategori'), [('varProductCategory') : txtKategori], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol kategori {string} untuk kendaraan")
	public void klikTombolKategoriUntukKendaraan(String katKend) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriKendaraan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol kategori {string} untuk baju")
	public void klikTombolKategoriUntuk_baju(String katBaju) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriBaju'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol kategori {string} untuk elektronik")
	public void klikTombolKategoriUntukElektronik(String katElek) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriElektronik'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol kategori {string} untuk kesehatan")
	public void klikTombolKategoriUntukKesehatan(String katKesh) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriKesehatan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol kategori {string} untuk semua")
	public void klikTombolKategoriUntukSemua(String katSemua) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriSemua'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}