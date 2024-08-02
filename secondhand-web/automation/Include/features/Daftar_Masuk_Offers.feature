@Daftar_Masuk_Offres
Feature: Daftar Masuk Offers
  Saya ingin daftar masuk offers di SecondHand web.

  #untuk datar seller
  @Dmo01 @Dftsel
  Scenario: Seller Daftar dengan credential yang valid
    Given User membuka "https://secondhand.binaracademy.org/users/sign_up"
    When Masukan Name Daftar "Seller"
    And Input Email Daftar "seller@seller5.com"
    And Input Password Daftar "123456"
    And Klik tombol Daftar "Daftar"
    Then Melihat halaman setelah daftar "Telusuri Kategori"

  #untuk daftar buyer
  @Dmo02 @Dftbuy
  Scenario: Buyer Daftar dengan credential yang valid
    Given User membuka "https://secondhand.binaracademy.org/users/sign_up"
    When Masukan Name Daftar "Buyer"
    And Input Email Daftar "buyer@buyer123.com"
    And Input Password Daftar "123456"
    And Klik tombol Daftar "Daftar"
    Then Melihat halaman setelah daftar "Telusuri Kategori"

  #untuk login seller
  @Dmo03 @Msksel
  Scenario: seller ingin login dengan credential yang benar
  	Given User membuka "https://secondhand.binaracademy.org/users/sign_in"
    When Memasukkan Email yang sudah register "seller@seller5.com"
    And Memasukkan Password yang sudah register "123456"
    And Klik tombol login "Masuk"
    Then Melihat halaman produk setelah login "Telusuri Kategori"

  #untuk pembeli
  #@Dmo04 @Mskpem
  #Scenario: User ingin login dengan credential yang benar
  #When Memasukkan Email yang sudah register "tes1@example.com"
  #And Memasukkan Password yang sudah register "123456"
  #And Klik tombol login "Masuk"
  #Then Melihat halaman produk setelah login "Telusuri Kategori"
  
  
  @Dmo05 @Liasel
  Scenario: Seller ingin melengkapi profil akun
    When Klik icon profile
    Then Klik nama akun
    And Upload foto
    And Input Kota "Solo"
    And Input Alamat "JL. Seller"
    And Input No Handphone "08123456789"
    And Klik tombol "Simpan" profile
    Then Melihat halaman produk setelah login "Telusuri Kategori"

  @Dmo06 @Liabuy
  Scenario: Buyer ingin melengkapi profil akun
    When Klik icon profile
    Then Klik nama akun
    And Upload foto
    And Input Kota "Solo"
    And Input Alamat "JL. Buyer"
    And Input No Handphone "08123456789"
    And Klik tombol "Simpan" profile
    Then Melihat halaman produk setelah login "Telusuri Kategori"

  @Dmo07 @Ao002
  Scenario: Memastikan pembeli dapat melakukan tawar harga produk dari Search tanpa login
    When User Ketik "Motor Badai" pada kolom Search
    Then Diarahkan ke halaman Produk List "Motor"
    When Klik card produk bernama "Motor Badai"
    Then Diarahkan ke halaman preview produk
    When Klik tombol Saya tertarik dan ingin nego
    Then Diarahkan ke modal "Masukkan Harga Tawarmu"
    When Input data Field Harga Tawar "900000"
    And Klik tombol Kirim
    Then Produk berhasil di nego
    And Tombol Saya tertarik dan ingin nego berubah menjadi disabled "Menunggu respon penjual"
