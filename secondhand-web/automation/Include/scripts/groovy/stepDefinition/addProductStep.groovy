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



class addProductStep {
	@When("Klik tombol {string}")
	public void klikTombol(String string) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonJual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan ke halaman Terbitkan")
	public void diarahkanKeHalamanTerbitkan() {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/verifyTambahProdukTestObjects'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input data Field Nama Produk {string}")
	public void inputDataFieldNamaProduk(String namaProduk) {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldProductName'), [('expected') : namaProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input data Field Harga Produk {string}")
	public void inputDataFieldHargaProduk(String hargaProduk) {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldProductPrice'), [('expected') : hargaProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Pilih Kategori {string}")
	public void pilihKategori(String kategori) {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/selectProductCategory'), [('category') : kategori], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input data Field Deskripsi {string}")
	public void inputDataFieldDeskripsi(String deskripsi) {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldProductDesc'), [('expected') : deskripsi], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Pilih gambar dari penyimpanan pribadi")
	public void pilihGambarDariPenyimpananPribadi() {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/uploadImageProduct'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Terbitkan")
	public void klikTombolTerbitkan() {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/clickBtnTerbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Produk berhasil diterbitkan")
	public void produkBerhasilDiterbitkan() {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyDetailProductUserPage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan kehalaman detail produk")
	public void diarahkanKehalamanDetailProduk() {
		WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyDetailProductUserPage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik navigation link {string}")
	public void klik_navigation_link(String string) {
	}

	@When("klik tombol {string}")
	public void klik_tombol(String string) {
	}

	@Then("Berhasil memunculkan preview produk")
	public void berhasil_memunculkan_preview_produk() {
	}

	@Then("Menampilkan alert {string}")
	public void menampilkan_alert(String string) {
		;
	}
}