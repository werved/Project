@Produk_Detail
Feature: Product_Detail


@Pd001 @Positif
Scenario: Memastikan user dapat melihat produk detail
    When Buka "https://secondhand.binaracademy.org/"
    And User melakukan pencarian detail produk "kepik1" 
    And Klik card produk "kepik1"
    Then Berhasil menampilkan detail produk
    And Menampilkan foto produk
    And Menampilkan nama produk "kepik1"
    And Menampilkan kategori produk "Kendaraan"
    And Menampilkan harga produk "Rp 1.000.000"
    And Menampilkan tombol Saya tertarik dan ingin nego