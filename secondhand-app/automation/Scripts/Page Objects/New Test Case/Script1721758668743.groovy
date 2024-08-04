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

Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Belum Login/tapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Belum Login/verifyTitlePageAkunSaya'), [('varTitlePageAkunSaya2') : ''], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Sudah Login/tapBtnLogout'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Akun Saya - Sudah Login/verifyTitlePageAkunSaya'), [('varTitlePageAkunSaya') : ''], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/inputEmail'), [('varEmailMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/inputPassword'), [('varPasswordMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/tapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/tapLinkPageRegister'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Masuk/verifyTitlePageMasuk'), [('varTitlePageAkunSaya') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Page Objects/Navigation Bar/TapBtnAkun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/inputEmail'), [('varEmailMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/inputPassword'), [('varPasswordMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/tapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/tapLinkPageRegister'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/verifyTitlePageMasuk'), [('getTitlePageMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/verifyAlertTextMasuk'), [('varAlertTextMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navigation Bar/TapBtnAkun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Akun Saya - Belum Login/tapBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Beranda/verifyTitlePageMasuk'), [('varTitlePageTelusuriKategori') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Bottom Sheets/closeBottomSheets'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/verifyAlertUsernameOrPasswordSalah'), [('varAlertEmailOrSandiSalah') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Masuk/tapBtnKembali'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inpuKota'), [('varCity') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputAlamat'), [('varAlamat') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputEmail'), [('varEmailDaftar') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputNama'), [('varNameDaftar') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputNomorHpDaftar'), [('varNomorHp') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputPassword'), [('varPasswordDaftar') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/tapBtnDaftar'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/tapBtnKembali'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/tapLinkPageLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/verifyAlertTextDaftar'), [('varAlertTextDaftar') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/verifyTitlePageDaftar'), [('getTitlePageMasuk') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Beranda/scrollHalaman'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Beranda/getTxtProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/tapBtnKembali'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Beranda/verifyTitlePageMasuk'), [('varTitlePageTelusuriKategori') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Search/getTxtProductSearch'), [:], FailureHandling.STOP_ON_FAILURE)

