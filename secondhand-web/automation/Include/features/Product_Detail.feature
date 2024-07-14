@Produk_Detail
Feature: Product_Detail


@Pd001 @Positif
Scenario: Memastikan user dapat melihat produk detail
    When Buka "https://secondhand.binaracademy.org/"
    And Klik card produk "Motor"
    Then Berhasil menampilkan detail produk
    And Menampilkan foto produk
    And Menampilkan nama produk "Motor"
    And Menampilkan kategori produk "Kendaraan"
    And Menampilkan harga produk "1.000.000"
    And Menampilkan tombol Saya tertarik dan ingin nego