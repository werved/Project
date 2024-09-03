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



class UbahProduk {
	@Then("Klik produk Item")
	public void klikProdukItem() {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/Tab Produk - Terjual/tapProductCard'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Hapus Kategori")
	public void hapusKategori() {
		Mobile.callTestCase(findTestCase('Page Objects/Ubah Produk/tapBtnRemoveChip'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Pilih Spinner Kategori")
	public void pilihSpinnerKategori() {
		Mobile.callTestCase(findTestCase('Page Objects/Ubah Produk/tapSpinnerCategory'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan ke halaman Ubah Produk")
	public void diarahkanKeHalamanUbahProduk() {
		Mobile.callTestCase(findTestCase('Page Objects/Ubah Produk/seeTxtPageTitle'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Klik tombol Perbarui Produk")
	public void klikTombolPerbaruiProduk() {
		Mobile.callTestCase(findTestCase('Page Objects/Ubah Produk/tapBtnPerbaruiProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}