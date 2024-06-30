@pagination
Feature: Pagination
Agar list produk selanjutnya atau sebelumnya dapat dilihat

@pagi001 @positive
Scenario Outline: Lihat list produk selanjutnya dan sebelumnya
    Given User membuka "https://secondhand.binar-academy.org/"
    When berhasil menampilkan halaman "Home Produk" dengan query "<query_halaman_awal>"
    And User klik "<tombol_pagination>"
    Then berhasil menampilkan halaman "Home Produk" dengan query "<query_halaman_akhir>"

    Examples: 
      | <query_halaman_awal> | <tombol_pagination> | <query_halaman_akhir> |
      |                      | Next                | /?page=2              |
      | /?page=2             | Previous            | /?page=1              |