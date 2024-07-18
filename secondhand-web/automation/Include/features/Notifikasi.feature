@Notifikasi
Feature: Notifikasi
    User dapat melihat notifikasi yang masuk

#Background: 
    #Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    #When Memasukkan Email yang sudah register "tes1@example.com" 
    #And Memasukkan Password yang sudah register "123456"
    #And Klik tombol login "Masuk" 
    #Then Melihat halaman produk setelah login "Telusuri Kategori" 

@Nksi01 @Positif
Scenario: Check Notifikasi masuk
    When Klik icon Notification
    Then Menampilkan list dropdown Notification
    
@Nksi02 @Positif
Scenario: Klik Notifikasi Penawaran Produk
    When Klik icon Notification
    And Klik status "Penawaran Produk"
    Then Diarahkan ke halaman "Info Penawar" 