@Daftar
Feature: Daftar
  Sebagai User saya mendaftar ke dalam aplikasi.

  Background: 
    Given Buka aplikasi "Secondhand"
    Given Buka halaman Masuk

@Dftr01 @Positif
Scenario: User melakukan pendaftaran pada aplikasi dengan informasi yang valid
    When Klik tombol "Daftar"
    Then Tampil halaman Daftar
    And Input "Romi Ganteng" pada kolom Nama
    And Input "romi@yahoo.com" pada kolom Email
    And Input "romimenyala" pada kolom Password
    And Input "081223445" pada kolom Nomor HP
    And Input "Jakarta" pada kolom Kota
    And Input "Tomang Bergelora" pada Kolom Alamat
    And Klik tombol Daftar
    Then Tampil halaman Akun Saya

@Dftr02 @Negatif
  Scenario Outline: User gagal melakukan daftar karena tidak sesuai format
    When Klik tombol "Daftar"
    Then Tampil halaman Daftar
    And Input "<nama>" pada kolom Nama
    And Input "<email>" pada kolom Email
    And Input "<password>" pada kolom Password
    And Input "<hp>" pada kolom Nomor HP
    And Input "<kota>" pada kolom Kota
    And Input "<alamat>" pada Kolom Alamat
    And Klik tombol Daftar
    Then Tampil pesan "<error>"

    Examples:
    | nama | email | password | hp | kota | alamat | error |
    |  | romi@yahoo.com | romimenyala | 081223445 | Jakarta | Tomang Bergelora | Nama tidak boleh kosong |
    | romi ganteng |  | romimenyala | 081223445 | Jakarta | Tomang Bergelora | Email tidak boleh kosong |
    | romi ganteng | romi@yahoo.com |  | 081223445 | Jakarta | Tomang Bergelora | Password tidak boleh kosong |
    | romi ganteng | romi@yahoo.com | romimenyala |  | Jakarta | Tomang Bergelora | Nomor telepon tidak boleh kosong |
    | romi ganteng | romi@yahoo.com | romimenyala | 081223445 |  | Tomang Bergelora | Kota tidak boleh kosong |
    | romi ganteng | romi@yahoo.com | romimenyala | 081223445 | Jakarta |  | Alamat tidak boleh kosong |