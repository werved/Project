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

WebUI.callTestCase(findTestCase('Page Objects/Daftar/clickBtnDaftar'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/clickBtnMasukDisini'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputEmail'), [('varEmail') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputName'), [('varName') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputPassword'), [('varPassword') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar/verifyTitlePageDaftar'), [('varTitlePageDaftar') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickBtnAddProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickBtnEditProfile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickCardProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickLinkDiminati'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickLinkSemuaProduk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickLinkTerjual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/readTxtTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/readTxtUserAddress'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/readTxtUserName'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/seeImgUserProfilePicture'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyCardProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyProductDeleted'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyProductTerjualDeleted'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik orang lain)/clickBtnInginNego'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik orang lain)/verifyDetailProductOtherPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/clickBtnDeleteProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/clickBtnEditProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/readTxtCardTitleProductDesc'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/readTxtProductDesc'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/readTxtUserAddress'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/readTxtUserName'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/seeImgProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyDetailProductUserPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyTxtProductCategory'), [('expected') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyTxtProductName'), [('expected') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Detail Produk (milik sendiri)/verifyTxtProductPrice'), [('expected') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/clickBtnKirim'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/inputFieldHargaTawar'), [('hargatawar') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/verifyBtnDisabled'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Harga Tawar/verifyHargaTawarPage'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonJual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriBaju'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriElektronik'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriHobi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriKendaraan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriKesehatan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonKategoriSemua'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonNext'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonPrevious'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickProductCard'), [('varProductName') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/readTxtHargaProduk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/readTxtKategoriProduk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/readTxtNamaProduk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/seeImgFotoProduk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyHasilKategori'), [('varProductCategory') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyHasilSearch'), [('varProductName') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyHomepageTestObject'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyUrl'), [('urlExpectedVar') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnHubungiDi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnStatus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnTerima'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnTolak'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/verifyBtnHubungiDi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/verifyBtnStatus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/verifyBtnTerima'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/verifyBtnTolak'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtDaftarProduk'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtOfferStatusTolak'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtTitlePage'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/clickBtnBack'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/clickBtnSimpan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputAlamat'), [('varAlamat') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputPhoneNumber'), [('varPhoneNumber') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputUsername'), [('varUsername') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/selectCity'), [('varSelectCity') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/uploadProfileImage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/verifyTitlePageLengkapiInfoAkun'), [('vartitlePageLengkapiInfoAkun') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Login/clickBtnDaftarDisini'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Login/clickBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Login/inputEmail'), [('varLoginEmail') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Login/inputPassword'), [('varPassword') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Login/verifyAlerLogin'), [('varAlertLogin') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Login/verifyTitlePageMasuk'), [('varTitlePageLogin') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnEditProfile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnHome'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnKeluar'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnNotification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnProducts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/clickBtnProfile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navAkun/inputSearch'), [('varSearchNavAkun') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navHome/clickBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navHome/inputSearch'), [('varSearchNavHome') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navNotifikasi/clickCardProduct'), [('notificationTitle') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navNotifikasi/clickLinkLihatSemuaNotifikasi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Navbar/navNotifikasi/verifyNotificationsTestObject'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Notifikasi/clickButtonNext'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Notifikasi/clickButtonPrevious'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Notifikasi/clickCardProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Notifikasi/verifyNotificationPageObject'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/clickBtnKirim'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/clickRadioCheckBatalkanTransaksi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/clickRadioCheckBerhasilTerjual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/verifyTxtPenjualanDibatalkan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/verifyTxtStatusBerhasilTerjual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Perbarui Status/verifyTxtTitlePage'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/clickBtnPreview'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/clickBtnTerbitkan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldProductDesc'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldProductName'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldProductPrice'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/selectProductCategory'), [('category') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/uploadImageProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/verifyTambahProdukTestObjects'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/verifyTxtErrorMessage'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)

