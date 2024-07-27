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



class NotifikasiSteps {
	@Then("Menampilkan list dropdown Notification")
	public void melihatListNotifikasi() {
		WebUI.callTestCase(findTestCase('Page Objects/Navbar/navNotifikasi/verifyNotificationsTestObject'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik icon Notification")
	public void klik() {
		WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnNotification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik status {string}")
	public void klik_status(String string) {
		WebUI.callTestCase(findTestCase('Page Objects/Navbar/navNotifikasi/clickCardProduct'), [('notificationTitle') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Diarahkan ke halaman {string}")
	public void diarahkan_ke_halaman(String string) {
		WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtTitlePage'), [('expected') : string], FailureHandling.STOP_ON_FAILURE)
	}
}