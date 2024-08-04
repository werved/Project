@Daftar_Masuk_Offers
Feature: Daftar Masuk Offers
  Sebagai User saya mendaftar dan login ke dalam aplikasi
	
	#Register untuk User A
	@Dmo001 @Positif
	Scenario: User melakukan pendaftaran pada aplikasi dengan informasi yang valid
	    When Klik icon "Akun"
	    And Klik tombol "Masuk"
	    And Tap tombol link "Daftar"
	    Then Tampil halaman Daftar "Daftar"
	    And Input nama untuk daftar "Romi Ganteng3" pada kolom Nama
	    And Input email untuk daftar "romi5@yahoo.com" pada kolom Email
	    And Input password untuk daftar "romimenyala2" pada kolom Password
	    And Input nomor untuk daftar "0812234456" pada kolom Nomor HP
	    And Input kota untuk daftar "Jakarta" pada kolom Kota
	    And Input alamat untuk daftar "Tomang Bergelora" pada Kolom Alamat
	    And Tap tombol Daftar
	    Then Tampil halaman Akun Saya "Akun Saya"
    
	#Register untuk User B
	@Dmo002 @Positif
	Scenario: User melakukan pendaftaran pada aplikasi dengan informasi yang valid
	    When Klik icon "Akun"
	    And Klik tombol "Masuk"
	    And Tap tombol link "Daftar"
	    Then Tampil halaman Daftar "Daftar"
	    And Input nama untuk daftar "Romi Ganteng4" pada kolom Nama
	    And Input email untuk daftar "romi6@yahoo.com" pada kolom Email
	    And Input password untuk daftar "romimenyala2" pada kolom Password
	    And Input nomor untuk daftar "0812234456" pada kolom Nomor HP
	    And Input kota untuk daftar "Jakarta" pada kolom Kota
	    And Input alamat untuk daftar "Tomang Bergelora" pada Kolom Alamat
	    And Tap tombol Daftar
	    Then Tampil halaman Akun Saya "Akun Saya"
   
  #Login untuk User A
  @Dmo003 @Positif
  Scenario: User melakukan login dengan akun yang sudah terdaftar
    When Klik icon "Akun"
    Then Buka halaman "Akun Saya"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman login "Masuk"
    And Input Email terdaftar "romi5@yahoo.com" 
    And Input Password terdaftar "romimenyala2" 
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman "Akun Saya"
  
  #Login untuk User B
  @Dmo004 @Positif
  Scenario: User melakukan login dengan akun yang sudah terdaftar
    When Klik icon "Akun"
    Then Buka halaman "Akun Saya"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman login "Masuk"
    And Input Email terdaftar "romi6@yahoo.com" 
    And Input Password terdaftar "romimenyala2" 
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman "Akun Saya"