@Masuk
Feature: Masuk
  Sebagai User saya bisa masuk ke dalam aplikasi.

  Background: 
    Given Buka aplikasi "Secondhand"
    
    
  @Msk01 @Positif
  Scenario: User melakukan login dengan akun yang sudah terdaftar
    When Klik icon "Akun"
    Then Buka halaman "Akun Saya"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman "Masuk"
    And Input Email terdaftar "<emailaccount>"
    And Input Password terdaftar "<password>"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman "Akun Saya"

  
  @Msk02 @Positif
  Scenario Outline: User gagal melakukan login karena tidak menginput data
    When Klik icon "Akun"
    Then Diarahkan ke halaman "Akun Saya"
    And klik tombol "Masuk"
    Then Diarahkan ke halaman "Masuk"
    And Input Email terdaftar "<emailaccount>"
    And Input Password terdaftar "<password>"
    And Klik tombol "Masuk"
    Then Tampil pesan "<error>"

    Examples:
    | emailaccount | password | error |
    | ardianzah@yahoo.com | cobayah | |
    | dohai@yahoo.com | cobayah | Invalid Email or password |
    | ardianzah@yahoo.com | yukkitakemon | Invalid Email or password |

  @Msk03 @Negatif
  Scenario: User gagal melakukan login karena format data yang tidak sesuai
    When Klik icon "Akun"
    Then Diarahkan ke halaman "Akun Saya"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman "Masuk"
    And Input Email terdaftar "yuhuuuu.com"
    And Input Password terdaftar "123565"
    Then Tampil pesan "Please include an '@' in the email address. 'yuhuuuu.com' is missing an '@'"

  @Msk04 @Positif
  Scenario: User dapat melakukan pendaftaran melalui menu Daftar
    When Klik icon "Akun"
    Then Diarahkan ke halaman "Akun Saya"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman "Masuk"
    And Klik menu "Daftar"
    Then Diarahkan ke halaman "Daftar"