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
	@When("User Ketik {string} pada kolom Search")
	public void userKetikPadaKolomSearch(String namaProduk) {
		WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/inputSearch'), [('varSearchNavAkun') : namaProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan ke halaman Produk List {string}")
	public void diarahkanKeHalamanProdukList(String string) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik card produk bernama {string}")
	public void klikCardProdukBernama(String produkName) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickProductCard'), [('varProductName') : produkName], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan ke halaman preview produk")
	public void diarahkanKeHalamanPreviewProduk() {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik orang lain)/verifyDetailProductOtherPage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Saya tertarik dan ingin nego")
	public void klikTombolSayaTertarikDanInginNego() {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik orang lain)/clickBtnInginNego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan ke modal {string}")
	public void diarahkanKeModal(String modalName) {
		WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/verifyHargaTawarPage'), [('expected') : modalName], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input data Field Harga Tawar {string}")
	public void inputDataFieldHargaTawar(String hargaTawar) {
		WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/inputFieldHargaTawar'), [('hargatawar') : hargaTawar], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Kirim")
	public void klikTombolKirim() {
		WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/clickBtnKirim'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Produk berhasil di nego")
	public void produkBerhasilDiNego() {
		WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/verifyBtnDisabled'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Tombol Saya tertarik dan ingin nego berubah menjadi disabled {string}")
	public void tombolSayaTertarikDanInginNegoBerubahMenjadiDisabled(String string) {
		WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/verifyBtnDisabled'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}