import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Belum Login/TapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Belum Login/VerifyTitlePageAkunSaya'), [('varTitlePageAkunSaya2') : ''], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Sudah Login/TapBtnLogout'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Sudah Login/VerifyTitlePageAkunSaya'), [('varTitlePageAkunSaya') : ''], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/inputEmail'), [('varEmailMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/inputPassword'), [('varPasswordMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/TapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/TapLinkPageRegister'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/VerifyTitlePageMasuk'), [('varTitlePageAkunSaya') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Navigation Bar/TapBtnAkun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/inputEmail'), [('varEmailMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/inputPassword'), [('varPasswordMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/TapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/TapLinkPageRegister'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/VerifyTitlePageMasuk'), [('getTitlePageMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/VerifyAlertTextMasuk'), [('varAlertTextMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navigation Bar/TapBtnAkun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Akun Saya - Belum Login/TapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Beranda/VerifyTitlePageMasuk'), [('varTitlePageTelusuriKategori') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Bottom Sheets/closeBottomSheets'), [:], FailureHandling.STOP_ON_FAILURE)

