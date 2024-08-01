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



class ProductDetailSteps {
		@When("User melakukan pencarian detail produk {string}")
		public void userMelakukanPencarianDetailProduk(String searchProduct) {
			WebUI.callTestCase(findTestCase('Page Objects/Navbar/navHome/inputSearch'), [('varSearchNavHome') : searchProduct], FailureHandling.STOP_ON_FAILURE)
		}
		
		@When("Klik card produk {string}")
		public void klikCardProduk(String cardProduct) {
			WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickProductCard'), [('varProductName') : cardProduct], FailureHandling.STOP_ON_FAILURE)
			}
		
		@Then("Berhasil menampilkan detail produk")
		public void berhasilMenampilkanDetailProduk() {
			WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik orang lain)/verifyDetailProductOtherPage'), [:], FailureHandling.STOP_ON_FAILURE)
		}
		
		@Then("Menampilkan foto produk")
		public void menampilkanFotoProduk() {
			WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/seeImgProduct'), [:], FailureHandling.STOP_ON_FAILURE)
		}
		
		@Then("Menampilkan nama produk {string}")
		public void menampilkanNamaProduk(String nameProduct) {
			WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyTxtProductName'), [('expected') : nameProduct],
				FailureHandling.STOP_ON_FAILURE)
		}
		
		@Then("Menampilkan kategori produk {string}")
		public void menampilkanKategoriProduk(String categoryProduc) {
			WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyTxtProductCategory'), [('expected') : categoryProduc], 
    FailureHandling.STOP_ON_FAILURE)
		}
		
		@Then("Menampilkan harga produk {string}")
		public void menampilkanHargaProduk(String priceProduct) {
			WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyTxtProductPrice'), [('expected') : priceProduct],
				FailureHandling.STOP_ON_FAILURE)
		}
		
		@Then("Menampilkan tombol Saya tertarik dan ingin nego")
		public void menampilkanTombolSayaTertarikDanInginNego() {
			WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik orang lain)/verifyBtnInginNego'), [:], FailureHandling.STOP_ON_FAILURE)
		}
}