import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.MobileElement as MobileElement
import org.openqa.selenium.Keys as Keys
import java.util.concurrent.TimeUnit

driver = MobileDriverFactory.getDriver()

// Implicit wait to find each elements
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)

// Mobile element for Android API 30
List<MobileElement> android30 = driver.findElementsById('com.google.android.documentsui:id/thumbnail')

// Mobile element for Android API 35
List<MobileElement> android35 = driver.findElementsById('com.google.android.providers.media.module:id/icon_thumbnail')

//Logic condition when tested with either Android API 30 or API 35
if (android30.size() > 0) {
    android30.get(0).click()
} else {
    android35.get(0).click()
}