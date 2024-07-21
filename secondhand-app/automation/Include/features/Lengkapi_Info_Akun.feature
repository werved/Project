@Lengkapi_Info_Akun
Feature: Lengkapi_Info_Akun
  Saya ingin memperbaharui profile

Background:
		Given User membuka aplikasi SecondHand
		When User klik tombol "Masuk"
		And User memasukkan "example@example.com" pada bidang "Email"
		And User memasukkan "123456" pada bidang "Password"
		And User klik tombol "Masuk"
		Then Menampilkan halaman "Akun Saya"

  @Lia001 @Positif
  Scenario: User input data profile
    When Klik icon pensil pada profile
    Then Menampilkan halaman "Lengkapi Info Akun" 
    And Klik icon foto
    And Klik pada modal "Pilih Gambar" 
    And Pilih "Gambar" dan upload foto
    And Input Nama "tes1" 
    Then Klik tombol "Simpan" 
    And Input Nomor HP "0812345667" 
    Then Klik tombol "Simpan" 
    And Input Kota "Depok" 
    Then Klik tombol "Simpan" 
    And Input Alamat "JL. Bintang" 
    Then Klik tombol "Simpan" 
    
    @Lia001 @Negatif
  Scenario: User update info profile tanpa mengisi data
    When Klik icon pensil pada profile
    Then Menampilkan halaman "Lengkapi Info Akun" 
    And Kosongkan Nama " " 
    And Klik tombol "Simpan" 
    Then Menampilkan alert nama "Wajib Diisi" 
    And Kosongkan Nomor HP "  " 
    And Klik tombol "Simpan" 
    Then Menampilkan alert nomor hp "Wajib Diisi" 
    And Kosongkan Kota "  " 
    And Klik tombol "Simpan" 
    Then Menampilkan alert kota "Wajib Diisi" 
    And Kosongkan Alamat "  " 
    And Klik tombol "Simpan" 
    Then Menampilkan alert alamat "Wajib Diisi" 
    
    @Lia002 @Negatif
  Scenario Outline: User update info akun tanpa mengisi data
    When Klik icon pensil pada profile
    Then Menampilkan halaman "Lengkapi Info Akun" 
    And Kosongkan Email "  " 
    And Klik tombol "Simpan" 
    Then Menampilkan alert email "Wajib Diisi" 
    And Kosongkan kata sandi lama "<sandilama>" 
    And Klik tombol "Simpan"
    And Kosongkan kata sandi baru "<sandibaru>" 
    And Klik tombol "Simpan"
    And Kosongkan konfirmasi kata sandi "<konf.katasandi>" 
    And Klik tombol "Simpan" 
    Then Menampilkan alert kata sandi "<alert>" 
    
    Examples: 
      | sandilama     | sandibaru     | konf.katasandi     | alert
      |               | 123456        | 123456             | Wajib Diisi
      | 123456        |               | 123456             | Wajib Diisi
      | 123456        | 123456        |                    | Wajib Diisi
    
    