@Pagination
Feature: Pagination
Agar list produk selanjutnya atau sebelumnya dapat dilihat
      
@Pagi001 @Positif
Scenario: User lihat list produk selanjutnya
    Given Buka "https://secondhand.binar-academy.org/"
    When Berhasil menampilkan halaman Beranda
    And Klik "Next"
    Then Berhasil menampilkan URL "https://secondhand.binar-academy.org/?page=2"
    And Berhasil menampilkan halaman Beranda

@Pagi002 @Positif
Scenario: User lihat list produk sebelumnya
    Given Buka "https://secondhand.binar-academy.org/"
    When Berhasil menampilkan halaman Beranda
    And Klik "Next"
    Then Berhasil menampilkan URL "https://secondhand.binar-academy.org/?page=2"
    When Klik "Previous"
    Then Berhasil menampilkan URL "https://secondhand.binar-academy.org/?page=1"
      
#Versi awal      
#@Pagi001 @Positif
#Scenario Outline: Lihat list produk selanjutnya dan sebelumnya
#    Given User membuka "https://secondhand.binar-academy.org/"
#    When berhasil menampilkan halaman "Home Produk" dengan query "<query_halaman_awal>"
#    And User klik "<tombol_pagination>"
#    Then berhasil menampilkan halaman "Home Produk" dengan query "<query_halaman_akhir>"

#    Examples: 
#      | <query_halaman_awal> | <tombol_pagination> | <query_halaman_akhir> |
#      |                      | Next                | /?page=2              |
#      | /?page=2             | Previous            | /?page=1              |