@Daftar
Feature: Daftar
  Sebagai User saya mendaftar ke dalam aplikasi.

  #Background: 
    #Given User buka halaman Masuk

@Dftr001 @Positif
Scenario: User melakukan pendaftaran pada aplikasi dengan informasi yang valid
    When Klik icon "Akun"
    And Klik tombol "Masuk"
    And Tap tombol link "Daftar"
    Then Tampil halaman Daftar "Daftar"
    And Input nama untuk daftar "Romi Ganteng2" pada kolom Nama
    And Input email untuk daftar "romi2@yahoo.com" pada kolom Email
    And Input password untuk daftar "romimenyala2" pada kolom Password
    And Input nomor untuk daftar "0812234456" pada kolom Nomor HP
    And Input kota untuk daftar "Jakarta" pada kolom Kota
    And Input alamat untuk daftar "Tomang Bergelora" pada Kolom Alamat
    And Tap tombol Daftar
    Then Tampil halaman Akun Saya "Akun Saya"

@Dftr002 @Negatif
  Scenario Outline: User gagal melakukan daftar karena tidak sesuai format  
    When Klik icon "Akun"
    And Klik tombol "Masuk"
    And Tap tombol link "Daftar"
    Then Tampil halaman Daftar "Daftar"
    And Input nama untuk daftar "<nama>" pada kolom Nama
    And Input email untuk daftar "<email>" pada kolom Email
    And Input password untuk daftar "<password>" pada kolom Password
    And Input nomor untuk daftar "<hp>" pada kolom Nomor HP
    And Input kota untuk daftar "<kota>" pada kolom Kota
    And Input alamat untuk daftar "<alamat>" pada Kolom Alamat
    And Tap tombol Daftar
    Then Tampil pesan alert ketika daftar "<error>" 
    And Kembali ke halaman Akun Saya

    Examples: 
    | nama          | email          | password    | hp        | kota    | alamat           | error                            |
    |               | romi@yahoo.com | romimenyala | 081223445 | Jakarta | Tomang Bergelora | Nama tidak boleh kosong          |
    | romi ganteng  |                | romimenyala | 081223445 | Jakarta | Tomang Bergelora | Email tidak boleh kosong         |
    | romi ganteng  | romi@yahoo.com |             | 081223445 | Jakarta | Tomang Bergelora | Password tidak boleh kosong      |
    | romi ganteng  | romi@yahoo.com | romimenyala |           | Jakarta | Tomang Bergelora | Nomor telepon tidak boleh kosong |
    | romi ganteng  | romi@yahoo.com | romimenyala | 081223445 |         | Tomang Bergelora | Kota tidak boleh kosong          |
    | romi ganteng  | romi@yahoo.com | romimenyala | 081223445 | Jakarta |                  | Alamat tidak boleh kosong        |
    