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



class TambahProduk {
	@When("Seller klik icon plus")
	public void sellerKlikIconPlus() {
		Mobile.callTestCase(findTestCase('Page Objects/Navigation Bar/tapBtnTambah'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Berhasil menampilkan halaman {string}")
	public void berhasilMenampilkanHalaman(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Top App Bar/verifyTxtPageTitle'), [('txtPageTitleExpected') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ubah Nama Produk {string}")
	public void ubahNamaProduk(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldNamaProduk'), [('expected') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ubah Harga Produk {string}")
	public void ubahHargaProduk(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldHargaProduk'), [('expected') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik Kategori")
	public void klikKategori() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapFieldDropDownKategori'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Pilih Kategori {string}")
	public void pilihKategori(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/Pilih Kategori/selectCategoryOption'), [('category') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ubah Lokasi {string}")
	public void ubahLokasi(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldLokasiProduk'), [('expected') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Ubah Deskripsi {string}")
	public void ubahDeskripsi(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldDeskripsiProduk'), [('expected') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Gagal menambahkan produk dengan snackbar {string}")
	public void gagalMenambahkanProdukDenganSnackbar(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/verifyTxtErrorMessage'), [('expected') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Upload Foto")
	public void uploadFoto() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapImageUploader'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik Upload Foto")
	public void klikUploadFoto() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapImageUploader'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik icon Galeri")
	public void klikIconGaleri() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/Bottom Sheets Pilih Gambar/tapBtnGaleri'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik foto")
	public void klikFoto() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/Bottom Sheets Pilih Gambar/tapImgFileExplorer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Terbitkan")
	public void klikTombolTerbitkan() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapBtnTerbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Berhasil menambahkan produk dengan snackbar {string}")
	public void berhasilMenambahkanProdukDenganSnackbar(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/seeToastMessageSuccess'), [('expected') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Preview")
	public void klikTombolPreview() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapBtnPreview'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}